<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to mkdir Moto</title>
<script>
	function ChooseById (id)
	{
		//const id = prompt ("Enter ID:");
		window.location.replace ("/view?id="+id);
	}
</script>
</head>
<body>

<h1>Motorcycles Rock!</h1>
<h3>LIST</h3>


<c:forEach var="item" items="${motorcycle}">
		<p><a href='/updateMotorcycle?id=${item.id}'>${item.name }</a>  <a href='/deleteMotorcycle?id=${item.id}'>DELETE</a></p>

</c:forEach>
</body>
</html>
