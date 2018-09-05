<%@ page language="java" pageEncoding="UTF-8"%>
<div style="padding:10px 30px 20px 30px;">
	<form id="pass_form" class="easyui-form" method="post" data-options="novalidate:true">
		<input type="hidden" id="userId" name="userId" />
		<table cellpadding="5">
			<tr>
				<td style="width:40%;" class="rtr">原密码:</td>
				<td style="width:60%;">
				<!-- 信息有残留显示，使信息不显示 -->
				<input type="password" style="display:none;" />
				<input class="easyui-textbox" type="password" id="oldPassword" name="userPassword"  data-options="required:true"></input></td>
			</tr>	
			<tr>
				<td  class="rtr">新密码:</td>
				<td><input class="easyui-textbox" type="password" name="newPassword" id="newPassword" data-options="required:true"></input></td>
			</tr>
			<tr>
				<td  class="rtr">重复输入:</td>
				<td><input class="easyui-textbox" type="password" id="confirmPassword" data-options="required:true"></input></td>
			</tr>
		</table>
	</form>
</div>