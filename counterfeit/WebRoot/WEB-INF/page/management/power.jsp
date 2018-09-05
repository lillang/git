<%@ page language="java" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>云系统 </title>
	<jsp:include page="../inc.jsp"></jsp:include>
	<script type="text/javascript" charset="utf-8"> 
	var roleArray=[];
	var role;
	$(function(){
	//加载权限列表
		role = $("#role").tree({
			url:'${pageContext.request.contextPath}/role/getRole',
			loadFilter:function(data){
				var rows=[];
				if(data.status=="200"){
					rows=data.data;
				}else{
					rows=data;
				}
				return convert(rows);
			},
			onLoadSuccess:function(node,data){  
				var node = $('#role').tree('find', data[0].id);			
				$('#role').tree('expandTo', node.target).tree('select', node.target);
		    },
		    onClick: function(node){
                sitename(node.roleid);
            },
		  //  formatter:function(node){
		  //	var s = node.text;
		  // 	if (node.children){
		 //			s += '&nbsp;<span style=\'color:blue\'>(' + node.children.length + ')</span>';
		 //  	}
		//		return s;
		//	}
		});
        sitename(1);
	});
	
	/**
	 * 查询所有权限页面
	 */
	function sitename(str){
		$("#power").tree({
			url:'${pageContext.request.contextPath}/per/getPer?roleid='+str,
                //cascadeCheck: false,
			loadFilter:function(data){
				debugger;
				var rows=[];
				if(data.status="200"){
					var node=data.data;
					for(var i=0;i<node.length;i++){
					var childrenNode=node[i].children;
					if(childrenNode!=null){
						var flag=true;
						for(var j=0;j<childrenNode.length;j++){
						  if(childrenNode[j]['state']==0){
						  flag=false;
						  }
						}
						if(!flag){
						node[i]['state']=0;
						}
						}
						
					}
					rows=node;
				}else{
					rows=data;
				}
				return convert(rows);
			},
			onCheck: function (node, checked) {
			if($("#power").tree('getParent', node.target)!=null){
			//获得选中节点的父节点
			   var parent=$("#power").tree('getParent', node.target);
			   //获得选中节点的同级所有节点
			   var childNode = $("#power").tree('getChildren',parent.target);
			   
			   //标识1
			   var flag1=true;
			   
			   for(var i=0;i<roleArray.length;i++){
			  	 if(roleArray[i]==parent['id']){
			  	  flag1=false;
			 	 }
			   }
			   
			   if(flag1){
			  	 for(var i=0;;i++){
			  		 if(roleArray[i]==null){
			  	 	 roleArray[i]=parent['id'];
			  	 	 break;
			 	 	}
			   	 }
			   } 
			  //标识2
			   var flag2=true;
			   
			   //标识3
			   var flag3=true;
                if (childNode.length > 0) {
                      for (var i = 0; i < childNode.length; i++) {
                    	  if(childNode[i]['checked']==false){
                      		flag2=false;
                      	  }
                      	  if(childNode[i]['checked']==true){
                      		flag3=false;
                      	  }
                      }
                }            
     
     //同级子节点全选中，flag2为true
     //同级子节点全未选中，flag3为true
     
              if(flag2||flag3){
                for(var i=0;i<roleArray.length;i++){
			  		if(roleArray[i]!=null&&roleArray[i]==parent['id']){
			  			 var j=i;
			  			 while(roleArray[j+1]!=null){
			  			 	roleArray[j]=roleArray[j+1];
			  			 	j++;
			  			 }
			 	 			roleArray[j]=null;
			 	 			break;
			   		}
               }
              }        
			}else{
			 	if(node['checked']==false){
			 		for(var i=0;i<roleArray.length;i++){
			  		if(roleArray[i]!=null&&roleArray[i]==node['id']){
			  			 var j=i;
			  			 while(roleArray[j+1]!=null){
			  			 	roleArray[j]=roleArray[j+1];
			  			 	j++;
			  			 }
			 	 			roleArray[j]=null;
			 	 			break;
			   		}
              	  }
			 	}
			}
           },
		    formatter:function(node){
				var s = node.text;
				if (node.children){
					s += '&nbsp;<span style=\'color:blue\'>(' + node.children.length + ')</span>';
				}
				return s;
			}
		});
	}
	
	//将数据转换为树形结构的数据
	function convert(rows){
		var nodes=[];
		for(var i=0;i<rows.length;i++){
			var row=rows[i];
			if(row.children){
				var data={
					id:row.role_id==undefined?row.right_id:row.role_id,
					text:row.role_name==undefined?row.right_name:row.role_name,
					state:'closed',
					//iconCls:'icon-add',
					name:row.role_name==undefined?row.right_name:row.role_name,
					info:row.role_info,
					roleid:row.role_id,
					roleInfo:row.role_info,
					roleName:row.role_name==undefined?row.right_name:row.role_name,
					checked:row.state==1?true:false,
					children:convert(row.children)
				};
				nodes.push(data);
			}else{
				var data={
					id:row.role_id==undefined?row.right_id:row.role_id,
					role_id:row.role_id==undefined?row.right_id:row.role_id,
					checked:row.state==1?true:false,
					roleInfo:row.role_info,
					roleName:row.role_name==undefined?row.right_name:row.role_name,
					text:row.role_name==undefined?row.right_name:row.role_name,
					name:row.role_name==undefined?row.right_name:row.role_name,
					info:row.role_info,
					roleid:row.role_id
				};
				nodes.push(data);
			}
		}
		return nodes;
	}
	
	//全部关闭
	function collapseAll(){
		$('#power').tree('collapseAll');
	}
	
	//全部展开
	function expandAll(){
		$('#power').tree('expandAll');
	}
	
	//保存
	function save(){
	var nodea =$('#power').tree('getChecked'); 
		var roles = $('#role').tree('getSelected');
		var nodes = $('#power').tree('getChecked');
		var s = '';
		for(var i=0; i<nodes.length; i++){
			if (s != '') s += ',';
			s += '{\"rightid\":\"'+nodes[i].id+'\",\"roleid\":\"'+roles.roleid+'\",\"roleName\":\"'+roles.text+'\"}';
		}
		
		for(var i=0;i<roleArray.length;i++){
			  		if(roleArray[i]!=null){
			  		if (s != '') s += ',';
			  		s+='{\"rightid\":\"'+roleArray[i]+'\",\"roleid\":\"'+roles.id+'\",\"roleName\":\"'+roles.text+'\"}';
			   		}
               }
		
		$.ajax({
			type : "post",
			cache : false,
			dataType : "json",
			url : '${pageContext.request.contextPath}/per/updPer',
			async : false,
			data : {
				"serviceType" : "modifyPermission",
				"roleid" : roles.roleid,
				"rights" : '{\"rights\":['+s+']}'
			},
			success : function(data){
				try {
					var r = data;
					$.messager.show({
						title : '提示',
						msg : r.status=='200'?'操作成功':r.msg
					});
				} catch (e) {
					$.messager.alert('提示', data);
					console.info(e);
				}
				sitename(roles.id);
			}
		});
	}
	
	function delRole(){
	var node = $('#role').tree('getSelected');
		if(!confirm("您是否要删除当前选中的数据？")){
			return;
		}
		var flag=false;
		if(node['roleid']=="4"){
				$.messager.show({
						title : '提示',
						msg : '该权限为系统权限，不能删除'
					});
			return;
		}
		$.ajax({
			url : '${pageContext.request.contextPath}/role/delRole',
			data : {
				roleid : node.roleid
			},
			async: false,
			dataType : 'json',
			success : function(data) {
				if(data.status=="200"){
					$.messager.show({
						title : '提示',
						msg : data.msg
					});
					flag=true;
					refesh();
				}else{
					$.messager.show({
						title : '提示',
						msg : data.msg
					});
				}
				
			}
		});
		
	}
	
	//添加角色
	function addRole(str){
		var service_Type = '';
		if(str==2){	//修改
			service_Type = 'modifyRole';
		}else{
			service_Type = 'createRole';
		}
		$('#role_add_dialog').dialog({
			href : '${pageContext.request.contextPath}/toEditRole',
			width : 485,
			height : 200,
			modal : true,
			title : str==1?'添加角色':'修改角色',
			buttons : [ {
				text : '保存',
				iconCls : 'icon-add',
				handler : function() {
				if($("#nameIdEdit").val().trim()==""){
						$.messager.show({
									title : '提示',
									msg : '角色名称不能为空'
								});
						return;
				}
				if($("#infoIdEdit").val().trim()==""){
				$.messager.show({
									title : '提示',
									msg : '说明不能为空'
								});
						return;
				}
				var node = $('#role').tree('getSelected');
				
				if(str==2&&node['name']==$("#nameIdEdit").val().trim()){
				}else{
				var flag=false;
				$.ajax({
								url:'${pageContext.request.contextPath}/role/selectRole',
								data : {
									name : $("#nameIdEdit").val().trim(),
								},
								async: false,
								dataType : 'json',
								success : function(data) {
									if(data.status=="201"){
											$.messager.show({
												title : '提示',
												msg : data.msg
											});
											flag=true;
										return;
									}
								}
							});
				if(flag){
					return;
				}
				}
					$('#role_add_addForm').form('submit', {
						url : '${pageContext.request.contextPath}/role/addRole',
						onSubmit: function(param){   
					        param.type=service_Type
					    },
						success : function(data) {
							try {
								var r = JSON.parse(data);
								if (r.status == "200") {
									$("#role_add_dialog").dialog("close");
									role.tree('reload');
								}
								$.messager.show({
									title : '提示',
									msg : r.msg
								});
							} catch (e) {
								$.messager.alert('提示', data);
							}
						}
					});
				}
			} ] ,
			onLoad : function() {
				if(str==2){	//修改	
					var node = $('#role').tree('getSelected');
					$('#role_add_addForm').form('load', node);
					}
			}
		});
	}
	function refesh(){
		role.tree('reload');
	}
	</script>
  </head>
  
  <body class="easyui-layout">
	<div data-options="region:'west',title:'角色',isonCls:'icon-save',tools : [ {
				iconCls : 'icon-reload',
				handler : function() {
					role.tree('reload');
				}
			},{
				iconCls : 'icon-add',
				handler : function() {
					addRole(1);
				}
			},{
				iconCls : 'icon-Edit',
				handler : function() {
					addRole(2);
				}
			},{
				iconCls : 'icon-no',
				handler : function() {
					delRole();
				}
			}]"
				style="width: 200px;overflow: auto;">
			<ul id="role" class="easyui-tree" ></ul>
	</div>
	<div style="padding:10px 30px 20px 30px;" data-options="region:'center',title:'权限'">
		<div style="margin:0 0 10px 0;">
			<a href="#" class="easyui-linkbutton" onclick="collapseAll()">全部关闭</a>
			<a href="#" class="easyui-linkbutton" onclick="expandAll()">全部展开</a>
			<a href="#" class="easyui-linkbutton" onclick="save()">&nbsp;&nbsp;保存&nbsp;&nbsp;</a>
		</div>
		<div>
			<ul id="power" class="easyui-tree" data-options="animate:true,checkbox:true" >
			</ul>
		</div>
	</div>
	<div id="role_add_dialog"></div>
  </body>
</html>
