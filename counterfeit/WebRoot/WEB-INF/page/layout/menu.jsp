<%@ page language="java" pageEncoding="UTF-8"%>

<script type="text/javascript" charset="utf-8">
	var ctrlTree, zdx;
	$(function() {
		ctrlTree = $('#ctrlTree').tree({
			url : 'menu/getMenu',
			lines : true,
			animate : true,
			onClick : function(node) {
				 if(node.attributes.url){//判断url是否存在，存在则创建tabs  
                     addTab(centerTabs, node);  
                 }else{
                     $.messager.show({
						title : '提示',
						msg : '此模块正在开发中...'
					});
                 } 
			},
			onDblClick : function(node) {
				if (node.state == 'closed') {
					$(this).tree('expand', node.target);
				} else {
					$(this).tree('collapse', node.target);
				}
			}
		});
	});
</script>
<div class="easyui-accordion" data-options="fit:true,border:false">
	<div title="系统菜单" data-options="isonCls:'icon-save',tools : [ {
				iconCls : 'icon-reload',
				handler : function() {
					ctrlTree.tree('reload');
				}
			} ]">
		<ul id="ctrlTree" style="margin-top: 5px;"></ul>
	</div>
</div>
