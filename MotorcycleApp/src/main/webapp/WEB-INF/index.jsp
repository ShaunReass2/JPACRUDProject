<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to mkdir Moto</title>
<script>
	function ChooseById ()
	{
		const id = prompt ("Enter ID:");
		window.location.replace ("/edit/"+id);
	}
</script>
</head>
<body>

<center><h1>Welcome to mkdir Moto!</h1></center>
<h3>What would you like to do?</h3>
<ol>
	<li><a href='javascript:ChooseById()'>Choose Motorcycles by Id</a></li>
	<li><a href='/list'>List All Motorcycles</a></li>
</ol>


</body>
</html>