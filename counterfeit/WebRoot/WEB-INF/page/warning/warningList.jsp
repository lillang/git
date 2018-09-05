 <%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
 <jsp:include page="../inc.jsp"></jsp:include>
   <style>
   .input{
     width: 170px;
   }
   </style>
<script type="text/javascript">
	var date;
	$(function() {
		//初始加载数据
		$('#data_datagrid').datagrid({
			url : '../counterfeit/getCounterfeitListByArea',
			queryParams : {
				counterfeitRecycle:1
			},
			idField : 'counterfeitId',
			fit : true,
			fitColumns : false,
			border : false,
// 			sortName : 'counterfeitCreatedate',
// 			sortOrder : 'desc',
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
					title : '假币出现次数',
					sortable : true,
					halign: 'center',
					width : 80
				},
				{
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
		function load(){
			$('#data_datagrid').datagrid({
				url : '../counterfeit/getCounterfeitListByArea',
				queryParams : {
					counterfeitRecycle:1
				},
				idField : 'counterfeitId',
				fit : true,
				fitColumns : false,
				border : false,
//	 			sortName : 'counterfeitCreatedate',
//	 			sortOrder : 'desc',
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
						title : '假币出现次数',
						sortable : true,
						halign: 'center',
						width : 80
					},
					{
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
			})
		}
		
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
			area : $("#area-combotreeFind").combobox("getValue"),
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
	
	
	
	/*加载省市地区*/
	function loadAreaFind(){
		$('#area-combotreeFind').combotree({
			url:'${pageContext.request.contextPath}/counterfeit/area',
			loadFilter:function(data){
				var  ars=[];
				if(data.status=="200"){
					ars=data.data;
				
				}else{
					ars=data;
				}
				return converth(ars);
			},
			
			onChange:function(record){  
			
			//myArray[0]=$('#area-combotree').combotree('getValue');
			
			//$('#cul_num').val(myArray.join(''))
			
				
			},
			onLoadSuccess:function(node,data){  
				
		    }
		});	
	
	}
	
	//将数据转换为树形结构的数据
	function converth(ars){
		var addres=[];
		for(var i=0;i<ars.length;i++){
			var ar=ars[i];
			if(ar.children){
				var data={
					id:ar.codeid,
					text:ar.cityName,
					state:'closed',
					children:converth(ar.children)
				};
				addres.push(data);
			}else{
				var data={
					id:ar.codeid,
					text:ar.cityName
				};
				addres.push(data);
			}
		}
     
		return addres;
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
var urlStr="${pageContext.request.contextPath}/exportForm/exportWarnList?area="+$("#area-combotreeFind").combobox("getValue")
+"&page="+curr+"&rows="+size;
location.href=urlStr;
}
</script>
<div class="easyui-layout" data-options="fit : true,border : false">
	<div data-options="region:'north',title:'查询条件',border:false" style="height: 100px;overflow: hidden;background-color: #F4F4F4;">
	    <form id="data_show_searchForm" method="post" data-options="novalidate:true">
	    	<table cellpadding="2">
	    		<tr>
	    			<td>地区:</td>
			    			<td colspan="2">
								<input type="text" id="area-combotreeFind" name="area" class="easyui-textbox" style="width:300px"></input>
								<script type="text/javascript">
			   					loadAreaFind();
								</script>
					</td>
	    			<td width='20px'></td>
	    			<td><a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="data_serarchFun();">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-reload',plain:true" onclick="data_clear();">清空</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="data_delete();">删除</a></td>
				</tr>
	    	</table>
	    	<div id="ft" style="padding:2px 5px;">
	    	 <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="export_ExcelFun();" plain="true">导出为excel</a>
	    	 
	    	</div>
	    </form>
	</div>
	<div data-options="region:'center',border:false">
		<table id="data_datagrid"></table>
	</div>
</div>