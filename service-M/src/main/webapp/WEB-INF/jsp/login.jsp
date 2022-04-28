<html>
<head> Login With Single User</head>

	<body>
	
		<h1 style="color:green;">WELCOME TO LOGIN PAGE</h1>
		<font color="red" size="8">${errorMsg}</font>
	 	
	 	<form name="loginForm"  action="" method="post">
	 	<table border="0">
	 		<tr>
	 		<th>User name : </th>
	 		<td><input type="text" name="name" id="name"/></td>
	 		<td><font color="red" size="5">${userMsg}</font></td>
	 		</tr>
	 		<tr>
	 		<th>Password : </th>
	 		<td><input type="password" name="password" id="password"/></td>
	 		<td><font color="red" size="5">${pwdMsg}</font></td>
	 		</tr>
	 		<tr>
	 		<td></td><td><input type="submit" value="Sign In"/></td><td></td>
	 		</tr>
	 	</table>
	 	</form>
	 	
	</body>
</html> 