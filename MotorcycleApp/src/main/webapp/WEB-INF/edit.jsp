<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to mkdir Moto</title>
<script>
	const name = "${motorcycle.name}";
	function ChooseById ()
	{
		const id = prompt ("Enter ID:");
		window.location.replace ("/edit/"+id);
	}
</script>
</head>
<body>

<h1>Motorcycles Rock!</h1>
<form>
	<p><input type='text' name='name' id='name' value ="${motorcycle.name}"/></p>
	<p><input type='text' name='name' id='name' value ="${motorcycle.make}"/></p>
</form>


</body>
</html>