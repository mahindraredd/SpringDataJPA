<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to ${name}</h1>
<center>
<form method="post" >
	<table border="1">
		<tr>
			<th>Employee Name</th>
			<td>
				<input type="text" name="ename">
			</td>
		</tr>
		<tr>
			<th>Employee number</th>
			<td>
				<input type="text" name="eno">
			</td>
		</tr>
		<tr>
			<th>Employee age</th>
			<td>
				<input type="text" name="eage">
			</td>
		</tr>
		<tr>
			<th>Employee address</th>
			<td>
				<input type="text" name="eaddress">
			</td>
		</tr>
		<tr>
			<th>Employee salary</th>
			<td>
				<input type="text" name="esal">
			</td>
		</tr>
		<tr>
			<th >
			<input type="submit" value="Submit"></th>
			
		</tr>
		
		
	
	</table>
</form>
</center>


</body>
</html>