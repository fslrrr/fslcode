<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工管理</title>

<style type="text/css">
body {
	color: #000;
	font-size: 12px;
	margin: 0px auto;
	}
</style>


<style type="text/css" title="currentStyle" media="screen">#divcenter{  
   position:absolute;/*层漂浮*/  
   top:40%;  
   left:50%;  
   width:300px;  
   height:300px;  
   margin-top:-150px;/*注意这里必须是DIV高度的一半*/  
   margin-left:-150px;/*这里是DIV宽度的一半*/  

}</style>  

<script type="text/javascript">
	function check(form) {
		if (document.forms.form1.username.value == "") {
			alert("please input username");
			document.forms.form1.username.focus();
			return false;
		}

		if (document.forms.form1.password.value == "") {
			aler("please input password");
			document.forms.form1.password.focus();
			return false;
		}
	}
</script>

</head>
<body>

<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">    
<img src="image/login.jpg" height="100%" width="100%"/>    
</div> 



<div id="divcenter">

<h1 align="center"><font size=5>学生信息管理系统</font></h1>

	<form action="LoginServlet" method="post" name="form1">
		<table border="1" cellspacing="1" cellpadding="1"
			align="center" >

			<tr>
				<td><b>用户名</b></td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td align="center"><b>密码1</b></td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td align="center"><a href="rsg.jsp"><b>注册</b></a></td>
				<td><input type="submit" name="submit"
					onclick="return check(this);" /><input type="reset" /></td>
			</tr>
		</table>
	</form>
</div> 	
	
</body>
</html>