 <%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
 <jsp:include page="../inc.jsp"></jsp:include>
   <style>
   .input{
     width: 170px;
   }
   </style>
<script type="text/javascript">

	$(function() {
		//初始加载数据
		$('#data_datagrid_list').datagrid({
			url : '../user/getUserList',
			queryParams : {
// 				serviceType : "retrieveUserInfo",
			},
			idField : 'userId',
			fit : true,
			fitColumns : false,
			border : false,
			sortName : 'userName',
			sortOrder : 'desc',
			singleSelect:false,          //是否单选
			rownumbers:true,            //显示行号 
			striped:true,   //斑马线效果
			remoteSort:false,    //是否服务器端排序，设成false才可以在页面进行排序
			nowrap : false,
			pagination : true,
			autoRowHeight:false,
			pageSize : 20,
			columns : [[{
					field : 'userId',
					title : '编号',
					hidden : true,
				},{
					field : 'userAccount',
					title : '用户账号',
					sortable : true,
					halign: 'center',
					width : 100
				},{
					field : 'userRole',
					title : '角色',
					sortable : true,
					halign: 'center',
					formatter :function (value, row) {
						return row.tbRole.roleName;
					},
					width : 80
				},{
					field : 'userName',
					title : '姓名',
					sortable : true,
					halign: 'center',
					width : 60
				},{
					field : 'userSex',
					title : '性别',
					sortable : true,
					halign: 'center',
					formatter :function (value, row) {
						var sex="女";
						if(value==1){
							sex="男";
						}
						return sex;
					},
					width : 30
				},{
					field : 'userPhone',
					title : '电话号码',
					sortable : true,
					halign: 'center',
					width : 60
				},{
					field : 'userWechat',
					title : '微信',
					sortable : true,
					halign: 'center',
					width : 60
				},{
					field : 'userQq',
					title : 'qq',
					sortable : true,
					halign: 'center',
					width : 60
				}
				]]
		});
		
	   /**
		* 分页
		*/
		var p = $('#data_datagrid_list').datagrid('getPager');  
                $(p).pagination({  
                pageSize: 20,//每页显示的记录条数，默认为5  
                pageList: [ 10, 20, 30, 40, 50 ],//可以设置每页记录条数的列表  
                beforePageText: '第',//页数文本框前显示的汉字  
                afterPageText: '页    共 {pages} 页',  
                displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录'
            }); 
	});


	/**
	 * 查询
	 */
	function data_serarchFun() {
		$('#data_datagrid_list').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
		$('#data_datagrid_list').datagrid('load',{    
		    serviceType : "retrieveUserInfo",
			userPhone : $("#userPhone").val(),
			createDateBegin : $("#createDateBegin").datetimebox("getValue")==""?null:new Date($("#createDateBegin").datetimebox("getValue")).getTime(),
			createDateEnd :  $("#createDateEnd").datetimebox("getValue")==""?null:new Date($("#createDateEnd").datetimebox("getValue")).getTime(),
		});
	}
	
	/**
	 * 清空
	 */
	function data_clear() {
		$('#data_datagrid_list').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
		$("#userPhone").val(""),
		$('#createDateBegin').combo("setValue", "").combo("setText","");
		$('#createDateEnd').combo("setValue", "").combo("setText","");
		data_serarchFun();
	}
	//新增
	function data_addFun(){
		$('#data_datagrid_list').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
		$('#user_add_dialog').dialog({
			href: "${pageContext.request.contextPath}/toAddUser",
		    title: "新增用户",
		    width:500,
		    height: 430,
		    closed: false,
		    cache: false,
		    resizable:false,
		    modal: true,
		    
		    buttons: [{
                text: '保存',
                iconCls: 'icon-ok',
                handler: function () {
                   if($("#account").val().trim()==""){
                	   $.messager.show({
   						title : '提示',
   						msg : '帐号不能为空',
   						});
   						return;
                   }
                   
                   if($("#password").val().trim()==""){
                	   $.messager.show({
   						title : '提示',
   						msg : '密码不能为空',
   						});
   						return;
                   }
                   
               	if($("#password").val().length<6||$("#password").val().length>16){
					$.messager.show({
						title : '提示',
						msg : '密码长度为6到16位',
					});
					return;
			}
				
			if($("#phone").val().trim()!=""){
			if(!checkPhone($("#phone").val()))
					{
						$.messager.show({
									title : '提示',
									msg : '手机格式不正确'
								});
						return;
					}
			}
                   
                   if($("#name").val().trim()==""){
                	   $.messager.show({
   						title : '提示',
   						msg : '姓名不能为空',
   						});
   						return;
                   }
                   
                   if($("#password").val().trim()==""){
                	   $.messager.show({
   						title : '提示',
   						msg : '密码不能为空',
   						});
   						return;
                   }
                   
                   if($("#sex").combobox("getValue").trim()==""){
						$.messager.show({
								title : '提示',
								msg : '性别不能为空'
						});
						return;
                }
                   
                   var flag=false;
					$.ajax({
								url:'${pageContext.request.contextPath}/user/getByAccount',
								data : {
									account : encodeURI($("#account").val().trim()),
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
					$.messager.progress({ 
       					  title:'Please waiting',
					 		  msg:'保存中...',
					 		  text:'',
							  interval:'300'
					 	 });
					$('#addForm').form('submit', {
						url : '../user/addUser',
						onSubmit: function(param){   
					        param.serviceType = "createUser";  
					    },
						success : function(data) {
							var r = JSON.parse(data);
							$.messager.progress('close'); 
							try {
								if (r.status == "200") {
									$("#user_add_dialog").dialog("close");
									$('#data_datagrid_list').datagrid('loadData', getData());
									$('#data_datagrid_list').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
								}
								$.messager.show({
									title : '提示',
									msg : r.msg
								});
							} catch (e) {
								$.messager.alert('提示', r.msg);
							}
						}
					});
				}
                   
            }, {
                text: '关闭',
                iconCls: 'icon-cancel',
                handler: function () {
                    $("#user_add_dialog").dialog('close');
                }
            }]
		});

	}
	
	//判断手机格式
	function checkPhone(str){
	    /***
	    最新的手机电话号码段：
	
	    移动：134(1349除外）135 136 137 138 139
	
	    147
	    150 151 152 157 158 159
	    182 183 184 187 188
	
	    联通： 130 131 132 
	    155 156 
	    185 186 
	    145
	
	    电信：133 153 177 180 181 189
	    //////////////////////////////////////////////////
	    固话：
	    区号：前面一个0，后面跟2-3位数字 ： 0\d{2,3}
	
	    电话号码：7-8位数字： \d{7,8}
	
	    分机号：一般都是3位数字： \d{3,}
	
	    **/
	    var isPhone = /^((0\d{2,3})-)(\d{7,8})(-(\d{3,}))?$/;
	    var isMob=/^((\+?86)|(\(\+86\)))?(13[012356789][0-9]{8}|15[012356789][0-9]{8}|18[02356789][0-9]{8}|147[0-9]{8}|1349[0-9]{7})$/;
	    if(isMob.test(str)||isPhone.test(str))
	    {
			return true;
		}else{
			return false;
		}
	}
	
	
	/**
	 * 加载数据
	 */
	function getData(){
		//初始加载数据
		$('#data_datagrid_list').datagrid({
			url : '../user/getUserList',
			queryParams : {
// 				serviceType : "retrieveUserInfo",
			},
			idField : 'userId',
			fit : true,
			fitColumns : false,
			border : false,
			sortName : 'userName',
			sortOrder : 'desc',
			singleSelect:false,          //是否单选
			rownumbers:true,            //显示行号 
			striped:true,   //斑马线效果
			remoteSort:false,    //是否服务器端排序，设成false才可以在页面进行排序
			nowrap : false,
			pagination : true,
			autoRowHeight:false,
			pageSize : 20,
			columns : [[{
					field : 'userId',
					title : '编号',
					hidden : true,
				},{
					field : 'userAccount',
					title : '用户账号',
					sortable : true,
					halign: 'center',
					width : 100
				},{
					field : 'userRole',
					title : '角色',
					sortable : true,
					halign: 'center',
					formatter :function (value, row) {
						return row.tbRole.roleName;
					},
					width : 80
				},{
					field : 'userName',
					title : '姓名',
					sortable : true,
					halign: 'center',
					width : 60
				},{
					field : 'userSex',
					title : '性别',
					sortable : true,
					halign: 'center',
					formatter :function (value, row) {
						var sex="女";
						if(value==1){
							sex="男";
						}
						return sex;
					},
					width : 30
				},{
					field : 'userPhone',
					title : '电话号码',
					sortable : true,
					halign: 'center',
					width : 60
				},{
					field : 'userWechat',
					title : '微信',
					sortable : true,
					halign: 'center',
					width : 60
				},{
					field : 'userQq',
					title : 'qq',
					sortable : true,
					halign: 'center',
					width : 60
				}
				]]
		});
	}
	
	
	/**
	 * 批量删除
	 */
	function user_list_removeFun() {
		var rows = $('#data_datagrid_list').datagrid('getSelections');
		var ids = [];
		if (rows.length > 0) {
			$.messager.confirm('确认', '您是否要删除当前选中的 '+rows.length+' 条数据？', function(r) {
				if (r) {
					var currentUserId = "${sessionScope.session.tbUser.userAccount}";/*当前登录用户的ID*/
					var flag = false;
					for ( var i = 0; i < rows.length; i++) {
						if (currentUserId != rows[i].userAccount) {
							ids.push(rows[i].userId);
						} else {
							flag = true;
						}
					}
					if (flag) {
							$.messager.show({
								title : '提示',
								msg : '不可以删除自己！'
							});
						return;
					} 
					$.ajax({
						url : '${pageContext.request.contextPath}/user/delUser',
						data : {
							serviceType : 'removeUser',
							deleteobj : ids.join(',')
						},
						dataType : 'json',
						success : function(data) {
							if (data.status=="200") {
								$.messager.show({
									title : '提示',
									msg : data.msg
								});
								$('#data_datagrid_list').datagrid('loadData', getData());
								$('#data_datagrid_list').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
							}				
						}
					});
				}
			});
		} else {
			$.messager.show({
				title : '提示',
				msg : '请勾选要删除的记录！'
			});
		}
	}
	
	//修改
	function user_list_editFun() {
		var rows = $('#data_datagrid_list').datagrid('getSelections');
		var ids = [];
		if (rows.length==1) {
			$('#user_edit_dialog').dialog({
				href : '${pageContext.request.contextPath}/toEdit',
				width : 500,
				height : 400,
				modal : true,
				title : '编辑用户',
				buttons : [ {
					text : '保存',
					iconCls : 'icon-edit',
					handler : function() {
						
						if($("#account").val().trim()==""){
		                	   $.messager.show({
		   						title : '提示',
		   						msg : '帐号不能为空',
		   						});
		   						return;
		                   }
						var uPattern = /^[a-zA-Z0-9_]{4,16}$/;

						if(!uPattern.test($("#account").val().trim())){
							$.messager.show({
							title : '提示',
							msg : '账号格式不正确，4到16位（字母，数字，下划线）'
							});
							return;
						
						}
						
					if($("#phone").val().trim()!=""){
					if(!checkPhone($("#phone").val()))
							{
								$.messager.show({
											title : '提示',
											msg : '手机格式不正确'
										});
								return;
							}
					}
		                   
		                   if($("#name").val().trim()==""){
		                	   $.messager.show({
		   						title : '提示',
		   						msg : '姓名不能为空',
		   						});
		   						return;
		                   }
		                   
		                   if($("#sex").combobox("getValue").trim()==""){
								$.messager.show({
										title : '提示',
										msg : '性别不能为空'
								});
								return;
		                }
					var node = rows[0];
					if(node['account']!=$("#account").val().trim()){
				var flag=false;
				$.ajax({
								url:'${pageContext.request.contextPath}/user/getByAccount',
								data : {
									account : encodeURI($("#account").val().trim()),
								},
								async: false,
								dataType : 'json',
								success : function(data) {
									if(data.status=="201"){
											$.messager.show({
												title : '提示',
												msg : '该账号已存在，请重新输入'
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
					
// 						$.messager.progress({ 
//         					  title:'Please waiting',
// 					 		  msg:'修改中...',
// 					 		  text:'',
// 							  interval:'300'
// 					 		  });
						$('#updForm').form('submit', {
							url : '${pageContext.request.contextPath}/user/updUser',
							onSubmit: function(param){   
						        param.serviceType = "modifyUser";  
						    },
							success : function(data) {
								try {
									if (r.status == "200") {
										$.messager.progress('close'); 
										$("#user_edit_dialog").dialog("close");
										$('#data_datagrid_list').datagrid('loadData', getData());
										$('#data_datagrid_list').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
									}
									$.messager.alert('提示', r.msg);
								} catch (e) {
									$.messager.alert('提示', data);
								}
							}
						});
					}
				} ],
				onLoad : function() {
					var o = rows[0];
					$("#temp_site").val(rows[0].sitename+"###"+rows[0].siteid);
					$('#updForm').form('load', o);
				}
			});
		}else{
			$.messager.alert('提示', "请选择一笔数据进行修改！");
		}
	}
	//修改密码
	function user_list_editPasswordFun(){
		var rows = $('#data_datagrid_list').datagrid('getSelections');
		var ids = [];
		if (rows.length==1) {
			$('#user_editPassword_dialog').dialog({
				href : '${pageContext.request.contextPath}/toUpdPass',
				width : 500,
				height : 400,
				modal : true,
				title : '修改密码',
				buttons : [ {
					text : '保存',
					iconCls : 'icon-edit',
					handler : function() {
						
						if($("#newPassword").val().trim()!=$("#confirmPassword").val().trim()){
		                	   $.messager.show({
		   						title : '提示',
		   						msg : '两次输入的密码不一致！',
		   						});
		   						return;
		                   }
					var node = rows[0];
				var flag=false;
				$.ajax({
								url:'${pageContext.request.contextPath}/user/findPass',
								data : {
									password : encodeURI($("#confirmPassword").val().trim()),
									id:$("#userId").val().trim(),
								},
								async: false,
								dataType : 'json',
								success : function(data) {
									if(data.status == "201"){
											$.messager.show({
												title : '提示',
												msg :data.msg
											});
											flag=true;
										return;
									}
								}
							});
				if(flag){
					return;
				}
					
// 						$.messager.progress({ 
//         					  title:'Please waiting',
// 					 		  msg:'修改中...',
// 					 		  text:'',
// 							  interval:'300'
// 					 		  });
						$('#pass_form').form('submit', {
							url : '${pageContext.request.contextPath}/user/updPass',
							onSubmit: function(param){   
						        param.serviceType = "modifyUser";  
						    },
							success : function(data) {
								try {
									var r = JSON.parse(data);
									if (r.status == "200") {
										$.messager.progress('close'); 
										$("#user_editPassword_dialog").dialog("close");
										$('#data_datagrid_list').datagrid('loadData', getData());
										$('#data_datagrid_list').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
									}
									$.messager.alert('提示', r.msg);
								} catch (e) {
									$.messager.alert('提示', data);
								}
							}
						});
					}
				} ],
				onLoad : function() {
					var o = rows[0];
					$("#temp_site").val(rows[0].sitename+"###"+rows[0].siteid);
					$('#pass_form').form('load', o);
				}
			});
		}else{
			$.messager.alert('提示', "请选择一笔数据进行修改！");
		}
	}
	//时间控件添加清空
$.fn.datetimebox.defaults.cleanText = '清空';

(function ($) {
    var buttons = $.extend([], $.fn.datetimebox.defaults.buttons);
    buttons.splice(1, 0, {
        text: function (target) {
            return $(target).datetimebox("options").cleanText;
        },
        handler: function (target) {
            $(target).datetimebox("setValue", "");
            $(target).datetimebox("hidePanel");
        }
    });
    $.extend($.fn.datetimebox.defaults, {
        buttons: buttons
    });

})(jQuery);
</script>
<div class="easyui-layout" data-options="fit : true,border : false">
	<div data-options="region:'north',title:'查询条件',border:false" style="height: 100px;overflow: hidden;background-color: #F4F4F4;">
	    <form id="data_show_searchForm" method="post" data-options="novalidate:true">
	    	<input type="hidden" value="" id="temp_site" />
	    	<table id="addUser" cellpadding="1">
	    		<tr>
	    			<td width='10px'></td>
	    			<td>用户：</td>
	    			<td>
	    				<input id="userPhone" class="easyui-numberbox" style="width:100px;" maxlength="11">
	    			</td>
	    			<td width='20px'></td>
	    			<td>创建时间：</td>
	    			<td>
	    				<input name="createDateBegin" id="createDateBegin" class="easyui-datetimebox" data-options="editable:false" >
	    			</td>
	    			<td width='20px'> 至 </td>
	    			<td>
	    				<input name="createDateEnd" id="createDateEnd" class="easyui-datetimebox"  data-options="editable:false" />
	    			</td>
	    			<td><a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="data_serarchFun();">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-reload',plain:true" onclick="data_clear();">清空</a>
						</td>
						
				</tr>
				<tr>
					<td>
					</td>
				</tr>
	    	</table>
	    	<div id="ft" style="padding:2px 5px;">
			    <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="data_addFun();" plain="true">增加</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="user_list_editFun();" plain="true">修改</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="user_list_removeFun();" plain="true">批量删除</a>
				<a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="user_list_editPasswordFun();" plain="true">修改密码</a>
			</div>
	    </form>
	</div>
	<div data-options="region:'center',border:false">
		<table id="data_datagrid_list"></table>
	</div>
	<div id="user_add_dialog"></div>
	<div id="user_edit_dialog"></div>
	<div id="user_editPassword_dialog"></div>
</div>