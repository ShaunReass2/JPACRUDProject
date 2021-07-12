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

<br>
<br>

<center><h1><font style = "microgram" size = 7>CRUD &nbsp; || &nbsp; YOUR &nbsp; || &nbsp; RIDE</font></h1></center>
<center><h3><font style = "microgram" size = 5>TWO WHEELS &nbsp; || &nbsp; INFINTE POSSIBILITIES</font></h3></center>
<center><h1><font style = "microgram" size = 5>CLICK A NAME TO VIEW MOTORCYCLE DEETS &nbsp; || &nbsp; CLICK DELETE TO WATCH HER RIDE AWAY</font></h1></center>

<br>
<br>

<c:forEach var="item" items="${motorcycle}">
		<center><p><a href='/updateMotorcycle?id=${item.id}'>${item.name }</a>  <br>
		<a href='/deleteMotorcycle?id=${item.id}'><button>DELETE</button></a></p></center>

</c:forEach>

<br>
<br>
	<form action="/"><input type="submit" value="Return to the Home Page"></form>
<br>
<br>

</body>
</html>
