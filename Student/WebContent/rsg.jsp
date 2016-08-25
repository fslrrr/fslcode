<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>

<style type="text/css" title="currentStyle" media="screen">#divcenter{  
   position:absolute;/*层漂浮*/  
   top:40%;  
   left:50%;  
   width:300px;  
   height:300px;  
   margin-top:-150px;/*注意这里必须是DIV高度的一半*/  
   margin-left:-150px;/*这里是DIV宽度的一半*/  

}</style>


<style type="text/css" title="currentStyle" media="screen">#divcenter2{  
   position:absolute;/*层漂浮*/  
   top:120%;  
   left:95%;  
   width:300px;  
   height:300px;  
   margin-top:-150px;/*注意这里必须是DIV高度的一半*/  
   margin-left:-150px;/*这里是DIV宽度的一半*/  

}</style>

</head>
<body>

<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">    
<img src="image/login.jpg" height="100%" width="100%"/>    
</div> 


<a href="login.jsp">点击返回登陆</a>  
<div id="divcenter">

<h1 align="center"><font size=5>学生注册</font></h1>

<form action="Reg" method="post" name="form1">
		<table border="1" cellspacing="1" cellpadding="1"
			align="center" >

			<tr>
				<td><b>用户名</b></td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td align="center"><b>密码</b></td>
				<td><input type="text" name="password" /></td>
			</tr>
						<tr>
				<td align="center"><b>姓名</b></td>
				<td><input type="text" name="names" /></td>
			</tr>
									<tr>
				<td align="center"><b>学号</b></td>
				<td><input type="text" name="id" /></td>
			</tr>
									<tr>
				<td align="center"><b>班级</b></td>
				<td><input type="text" name="classes" /></td>
			</tr>
			

		</table>
		<div id="divcenter2">
		<input  type="submit" name="submit" />
		</div>
	</form>
</div> 	
</body>
</html>