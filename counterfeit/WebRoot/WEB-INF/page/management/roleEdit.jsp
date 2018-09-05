<%@ page language="java" pageEncoding="UTF-8"%>
<div style="padding:10px 30px 20px 30px;">
	<form id="role_add_addForm" class="easyui-form" method="post" data-options="novalidate:true">
		<input type="hidden" name="roleid" />
		<table cellpadding="5">
			<tr>
				<td style="width:25%;" class="rtr">角色名称:</td>
				<td style="width:75%;"><input class="easyui-textbox" id="nameIdEdit" type="text" name="roleName" data-options="required:true"></input></td>
			</tr>
			<tr>
				<td class="rtr">说明:</td>
				<td><input class="easyui-textbox" type="text" id="infoIdEdit" name="roleInfo" data-options="required:true"></input></td>
			</tr>
		</table>
	</form>
</div>
