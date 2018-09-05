 <%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
 <jsp:include page="../inc.jsp"></jsp:include>
   <style>
   .input{
     width: 170px;
   }
   </style>
<script type="text/javascript">
// 	function shang(){
// 		$.ajax({
//             type:"post",
//             url:'${pageContext.request.contextPath}/counterfeit/fileUpload',//提供数据的Servlet
//             success:function(data){
//             }
// 		})
            
// 	}
//新增
function data_addFun(){
	$('#data_datagrid_list').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
	$('#counter_add_dialog').dialog({
		href: "${pageContext.request.contextPath}/toaddCounter",
	    title: "假币上传",
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
            	 if($("#result").val().trim()==""){
                	   $.messager.show({
    						title : '提示',
    						msg : '鉴定结果不能为空',
    						});
    						return;
                   }	
            	 	var re=$("#result").val().trim();
               	   if(re.substr(re.indexOf("."))!='.pdf'){
               		 $.messager.show({
    						title : '提示',
    						msg : '鉴定结果允许上传的后缀名为.pdf',
    						});
    						return;
            			}
                
               if($("#account").val().trim()==""){
            	   $.messager.show({
						title : '提示',
						msg : '冠字号不能为空',
						});
						return;
               }
               if($("#createDate").datetimebox("getValue")==""){
            	   $.messager.show({
						title : '提示',
						msg : '发布时间不能为空',
						});
						return;
               }
               if($("#counterfeitDeviceid").combobox("getValue").trim()==""){
					$.messager.show({
							title : '提示',
							msg : '设备序列号不能为空'
					});
					return;
           }
               if($("#counterfeitCurrency").val().trim()==""){
					$.messager.show({
							title : '提示',
							msg : '币种不能为空'
					});
					return;
          }
               
               if($("#counterfeitBottle").val().trim()==""){
            	   $.messager.show({
						title : '提示',
						msg : '版别不能为空',
						});
						return;
               }
               
               if($("#counterfeitMoney").combobox("getValue").trim()==""){
					$.messager.show({
							title : '提示',
							msg : '面额不能为空'
					});
					return;
          }
               
           	if($("#counterfeitCapturename").val().trim()==""){
				$.messager.show({
					title : '提示',
					msg : '收缴行名称不能为空',
				});
				return;
		}
		
               
               if($("#counterfeitCaptureaddress").val().trim()==""){
            	   $.messager.show({
						title : '提示',
						msg : '收缴行地址不能为空',
						});
						return;
               }
              
              
             	  if($("#file").val().trim()==""){
               	   $.messager.show({
   						title : '提示',
   						msg : '图片文件不能为空',
   						});
   						return;
                  }
                  var picture=$("#file").val().trim();
              	   if(picture.substr(picture.indexOf("."))!=".jpg"){
              		 $.messager.show({
   						title : '提示',
   						msg : '图片文件允许上传的后缀名为.jpg',
   						});
   						return;
           			}
               
               
               var flag=false;
// 				$.ajax({
// 							url:'${pageContext.request.contextPath}/user/getByAccount',
// 							data : {
// 								account : encodeURI($("#account").val().trim()),
// 							},
// 							async: false,
// 							dataType : 'json',
// 							success : function(data) {
// 								if(data.status=="201"){
// 										$.messager.show({
// 											title : '提示',
// 											msg : data.msg
// 										});
// 										flag=true;
// 									return;
// 								}
// 							}
// 						});
// 			if(flag){
// 				return;
// 			}
				$.messager.progress({ 
   					  title:'Please waiting',
				 		  msg:'上传中...',
				 		  text:'',
						  interval:'300'
				 	 });
				$('#addForm').form('submit', {
					url : '../counterfeit/fileUpload',
					onSubmit: function(param){   
				        param.serviceType = "createUser";  
				        param.counterfeitCreatedate=$("#createDate").datetimebox("getValue")==""?null:new Date($("#createDate").datetimebox("getValue")).getTime()
				    },
					success : function(data) {
						var r=JSON.parse(data);
						$.messager.progress('close'); 
						try {
							if (r.status == "200") {
								$("#counter_add_dialog").dialog("close");
								$('#data_datagrid').datagrid('loadData', getData());
								$('#data_datagrid').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
							}else if(r.status == "201"){
								$.messager.show({
									title : '错误提示',
									msg : r.msg
								});
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
                $("#counter_add_dialog").dialog('close');
            }
        }]
	});

}
	
	var date;
	$(function() {
		//初始加载数据
		$('#data_datagrid').datagrid({
			url : '../counterfeit/getCounterfeitList',
			queryParams : {
				counterfeitRecycle:1
			},
			idField : 'counterfeitId',
			fit : true,
			fitColumns : false,
			border : false,
			sortName : 'counterfeitCreatedate',
			sortOrder : 'desc',
			singleSelect:true,          //是否单选
			rownumbers:true,            //显示行号 
			striped:true,   //斑马线效果
			remoteSort:false,    //是否服务器端排序，设成false才可以在页面进行排序
			nowrap : false,
			pagination : true,
			autoRowHeight:false,
			pageSize : 20,
			columns : [[{
					field : 'counterfeitId',
					title : '编号',
					hidden : true,
				},{
					field : 'counterfeitCreatedate',
					title : '发布时间',
					sortable : true,
					halign: 'center',
					formatter :function (value, row) {
						date = new Date();
						date.setTime(value * 1000);
						return formatDate(date);
					},
					width : 80
				},{
					field : 'counterfeitCapturedate',
					title : '假币上缴时间',
					sortable : true,
					halign: 'center',
					formatter :function (value, row) {
						if(value==null){
							var timestamp = Date.parse(new Date());
							var time=15-parseInt((timestamp/1000-row.counterfeitCreatedate)/60/60/24);
							if(time<15&&time>=10){
								return "<span style='color:lime'>剩余"+time+"天</span>";
							}else if(time<10&&time>=5){
								return "<span style='color:purple'>剩余"+time+"天</span>";
							}else if(time<5&&time>=0){
								return "<span style='color:orange'>剩余"+time+"天</span>";
							}else if(time<0){
								return "<span style='color:red'>已逾期</span>";
							}
							return time;
						}else{
							date = new Date();
							date.setTime(value * 1000);
							return formatDate(date);
						}
					},
					width : 90
				},{
					field : 'counterfeitSerialnum',
					title : '冠字号',
					sortable : true,
					halign: 'center',
					width : 90
				},{
					field : 'counterfeitCurrency',
					title : '币种',
					sortable : true,
					halign: 'center',
					width : 70
				},{
					field : 'counterfeitBottle',
					title : '版别',
					sortable : true,
					halign: 'center',
					width : 60
				},{
					field : 'counterfeitMoney',
					title : '面额',
					sortable : true,
					halign: 'center',
					width : 60
				},{
					field : 'counterfeitType',
					title : '假币类型',
					sortable : true,
					halign: 'center',
					formatter :function (value, row) {
						if(value==0){
							return "<button type='button' style='background-color: #7ED321;width: 82px;height: 36px;font-size:10px;color: #FFFFFF' disabled='disabled'>伪造机制假币</button>";
						}else if(value==1){
							return "<button type='button' style='background-color: orange;width: 82px;height: 36px;font-size:10px;color: #FFFFFF' disabled='disabled'>变造拼接假币</button>";
						}
						
					},
					width : 94
				},{
					field : 'counterfeitCheckresult',
					title : '鉴定结果',
					sortable : true,
					halign: 'center',
					formatter:function(value,row,index){
						return '<a href="../counterfeit/fileDown?path='+value+'">鉴定结果下载</a>';
					},
					width : 80
				},{
					field : 'counterfeitPicture',
					title : '图片信息',
					sortable : true,
					halign: 'center',
					formatter:function(value,row,index){
						var s = '<a href="Javascript:void(0)" id="tooltipIMG'+index+'" onmouseout = "hidePhoto()" onmouseover="showPhoto(this)">显示图片</a> ';
						return s;
					},
					width : 60
				},{
					field : 'deviceAccount',
					title : '设备序列号',
					sortable : true,
					halign: 'center',
					formatter :function (value, row) {
						return row.tbDevice.deviceAccount;
					},
					width : 100
				},{
					field : 'deviceBank',
					title : '鉴定行名称',
					sortable : true,
					halign: 'center',
					formatter :function (value, row) {
						return row.tbDevice.deviceBank;
					},
					width : 150
				},{
					field : 'deviceDetailed',
					title : '鉴定行地址',
					sortable : true,
					halign: 'center',
					formatter :function (value, row) {
						return row.tbDevice.deviceDetailed;
					},
					width : 150
				},{
					field : 'counterfeitCapturename',
					title : '收缴行名称',
					sortable : true,
					halign: 'center',
					width : 150
				},{
					field : 'counterfeitCaptureaddress',
					title : '收缴行地址',
					sortable : true,
					halign: 'center',
					width : 150
				}
				]]
		});
		
	   /**
		* 分页
		*/
		var p = $('#data_datagrid').datagrid('getPager');  
                $(p).pagination({  
                pageSize: 20,//每页显示的记录条数，默认为5  
                pageList: [ 10, 20, 30, 40, 50 ],//可以设置每页记录条数的列表  
                beforePageText: '第',//页数文本框前显示的汉字  
                afterPageText: '页    共 {pages} 页',  
                displayMsg: '当前显示 {from} - {to} 条记录   共 {total} 条记录'
                
            }); 
	});
	
	function hidePhoto(target)
	{
		$("#tooltipIMG").tooltip("hide");
	}

	function showPhoto(target)
	{	
		var row = $('#data_datagrid').datagrid('getData').rows[getRowIndex(target)];
		var data=row.counterfeitPicture;
		var picName=row.counterfeitPicName;
		var year=data.substring(0,4);
		var month=data.substring(4,6);
		var day=data.substring(6,8);
		var numcode=data.substring(8,14);
// 		url = "../file/"+year+"/"+month+"/"+day+"/"+data+"/全幅白光_out.jpg";
// 		content="<img style='width:500px; height:250px;' src='"+ url +"'/>";
						
// 		 	        	$("#tooltipIMG"+getRowIndex(target)).tooltip({
// 		 	        		content:content,
// 		 	        		position: 'right',
			        		

// 		 	        	});
// 		 	        	$("#tooltipIMG"+getRowIndex(target)).tooltip("show");
		$.ajax({
			url:"${pageContext.request.contextPath}/counterfeit/getpath",
			success :function(datas){
// 				var a="/";
				url = datas+"/file/"+year+"/"+month+"/"+day+"/"+numcode+"/"+picName;
// 				alert(url);
				content="<img style='width:500px; height:250px;' src='${pageContext.request.contextPath}/counterfeit/getpic?url="+ url +"'/>";
// 				alert(content);
	        	$("#tooltipIMG"+getRowIndex(target)).tooltip({
	        		content:content,
	        		position: 'right',
	        		

	        	});
	        	$("#tooltipIMG"+getRowIndex(target)).tooltip("show");
			}
		})
		
		
	}
	
			// 取得行索引
	function getRowIndex(target){
		var tr = $(target).closest('tr.datagrid-row');
		return parseInt(tr.attr('datagrid-row-index'));
	}
	
	function formatDate(date){
		return date.getFullYear() + '-' + dataDispose((date.getMonth() + 1)) + '-' + dataDispose(date.getDate());
	}

	function dataDispose(num){
	 	return (num+"").length==1?"0"+num:num;
	}

	/**
	 * 查询
	 */
	function data_serarchFun() {
		$('#data_datagrid').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
		$('#data_datagrid').datagrid('load',{    
			counterfeitRecycle:1,
			counterfeitSerialnum : $("#counterfeitSerialnum").val(),
			counterfeitCreateBegindate : $("#counterfeitCreateBegindate").datetimebox("getValue")==""?null:new Date($("#counterfeitCreateBegindate").datetimebox("getValue")).getTime(),
			counterfeitCreateEnddate : $("#counterfeitCreateEnddate").datetimebox("getValue")==""?null:new Date($("#counterfeitCreateEnddate").datetimebox("getValue")).getTime(),
		});
		
	}
	
	/**
	 * 清空
	 */
	function data_clear() {
		$('#data_datagrid').datagrid('uncheckAll').datagrid('unselectAll').datagrid('clearSelections');
		$("#counterfeitSerialnum").val(""),
		$("#counterfeitCreateBegindate").combo("setValue", "").combo("setText","");
		$("#counterfeitCreateEnddate").combo("setValue", "").combo("setText","");
		data_serarchFun();
	}
	
	function data_delete(){
		var rows = $('#data_datagrid').datagrid('getSelections');
		var ids = [];
		if (rows.length > 0) {
			$.messager.confirm('确认', '您是否要删除当前选中数据？', function(r) {
			if (r) {
			$.ajax({
				url : '../counterfeit/delCounterfeit',
				data : {
					counterfeitId : rows[0].counterfeitId,
					counterfeitRecycle : 0
				},
				dataType : 'json',
				success : function(data) {
					if (data.status=="200") {
						data_serarchFun();
					}
					$.messager.show({
						title : '提示',
						msg : jd.resultMsg=='success'?'操作成功':jd.resultMsg
					});
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

//导出为excel
function export_ExcelFun(){
	var options = $("#data_datagrid" ).datagrid("getPager").data("pagination").options;
	curr = options.pageNumber;  
	size = options.pageSize;
var urlStr="${pageContext.request.contextPath}/exportForm/ecl?counterfeitRecycle="+1+"&counterfeitCreateBegindate="+$("#counterfeitCreateBegindate").datebox("getValue")
+"&counterfeitCreateEnddate="+$("#counterfeitCreateEnddate").datebox("getValue")+"&page="+curr+"&rows="+size;
location.href=urlStr;
}
</script>
<div class="easyui-layout" data-options="fit : true,border : false">
	<div data-options="region:'north',title:'查询条件',border:false" style="height: 100px;overflow: hidden;background-color: #F4F4F4;">
	    <form id="data_show_searchForm" method="post" data-options="novalidate:true">
	 
	    	<table cellpadding="2">
	    		<tr>
	    			<td width='10px'></td>
	    			<td>冠字号：</td>
	    			<td>
	    				<input id="counterfeitSerialnum" class="easyui-textbox" style="width:100px;" maxlength="10">
	    			</td>
	    			<td width='20px'></td>
	    			<td>发布时间：</td>
	    			<td>
	    				<input name="counterfeitCreateBegindate" id="counterfeitCreateBegindate" class="easyui-datebox" data-options="editable:false" >
	    			</td>
	    			<td width='20px'>至</td>
	    			<td>
	    				<input name="counterfeitCreateEnddate" id="counterfeitCreateEnddate" class="easyui-datebox"  data-options="editable:false" />
	    			</td>
	    			<td><a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="data_serarchFun();">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-reload',plain:true" onclick="data_clear();">清空</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="data_delete();">删除</a></td>
				</tr>
	    	</table>
	    	<div id="ft" style="padding:2px 5px;">
	    	 <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="export_ExcelFun();" plain="true">导出为excel</a>
	    	 <a href="" class="easyui-linkbutton" iconCls="icon-add" onclick="data_addFun();" plain="true">上传假币</a>
	    	</div>
	    </form>
	</div>
	<div data-options="region:'center',border:false">
		<table id="data_datagrid"></table>
	</div>
	<div id="counter_add_dialog"></div>
</div>
