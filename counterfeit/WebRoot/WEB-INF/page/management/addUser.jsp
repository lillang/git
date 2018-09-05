 <%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=utf-8"%>
<div style="padding:10px 30px 20px 30px;" >
	<form id="addForm"  class="easyui-form" method="post" data-options="novalidate:true" >
		<table cellpadding="5">
			<tr>
				<td>账号：</td>
				<td><input  type="text" class="easyui-textbox" id="account" name="userAccount" data-options="required:true"/> </td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" class="easyui-textbox" id="password" name="userPassword" data-options="required:true"/></td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><input type="text" class="easyui-textbox" id="name"  name="userName" data-options="required:true"/></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td>
				<select id="sex" name="userSex" class="easyui-combobox" panelHeight="70" style="width:80;" data-options="editable:false">
	    				<option value="1">男</option>
						<option value="0">女</option>
	    				</select>
				</td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" class="easyui-textbox" id="phone" name="userPhone" data-options="required:true"/></td>
			</tr>
			<tr>
				<td>微信：</td>
				<td><input type="text" class="easyui-textbox" id="userWechat" name="userWechat" data-options="required:true"/></td>
			</tr>
			<tr>
				<td>QQ：</td>
				<td><input type="text" class="easyui-textbox" id="userQq" name="userQq" data-options="required:true"/></td>
			</tr>
			<tr>
				<td>角色：</td>
				<td>
				<input type="text" id=userRoleid name="userRoleid"/>
				</td>
			</tr>
			<input type="hidden" name="userStatus" value="0"/>
			<input type="hidden" name="userRetrylogin" value="0"/>
		</table>
	</form>
</div>
<script>
$(document).ready(function(){

    queryXzqh();   

  })

  function queryXzqh(){

	$("#userRoleid").combobox({

 

  url:encodeURI("../role/list"),//获取数据

  // 向服务器请求的模式 

  method : "post",

  valueField: 'role_id',

  textField: 'role_name', 

  });

  }
</script>