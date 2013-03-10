<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<script type='text/javascript'>
function clearForm() 
{ 
	document.loginForm.loginid.value = ""; 
	document.loginForm.password.value = ""; 
}
</script>
</head>
<body>
<form name = "loginForm" action="Controller?param=Login" method="post">
<table>
<tr><td>LoginId: </td>
	<td>
<input type="text" name="loginid"  maxlength="40"></input>

</td>
</tr>
<tr><td>Password: </td>
	<td><input type="password" name="password"></input>
</td></tr>
<tr><td> <input type="submit" value="Login"></input></td> <td> 
<input type="reset" value="Reset" onclick = 'clearForm()'></input>
</td></tr>
</table></form>
</body>
</html>