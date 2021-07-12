<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UPDATE SPECS</title>
</head>
<body>

<br>
<br>
<br>

<center><h1><font style = "microgram" size = 7>UPDATE A MOTORCYCLE</font></h1></center>
<center><h3><font style = "microgram" size = 5>TWO WHEELS &nbsp; || &nbsp; INFINTE POSSIBILITIES</font></h3></center>

<form action="updateMotorcycle" method="post">
	<p>ID: <input type='text' name='id' id='id' value ="${motorcycle.id}"/></p>
	<p>Name: <input type='text' name='name' id='name' value ="${motorcycle.name}"/></p>
	<p>Make: <input type='text' name='make' id='make' value ="${motorcycle.make}"/></p>
	<p>Model: <input type='text' name='model' id='model' value ="${motorcycle.model}"/></p>
	<p>Year: <input type='text' name='year' id='year' value ="${motorcycle.year}"/></p>
	<p>Market: <input type='text' name='market' id='market' value ="${motorcycle.market}"/></p>
	<p>Fuel Type:<input type='text' name='fuelType' id='fuelType' value ="${motorcycle.fuelType}"/></p>
	<p>Capacitpy: <input type='text' name='fuelTankCapacityInGallons' id='fuelTankCapacityInGallons' value ="${motorcycle.fuelTankCapacityInGallons}"/></p>
	<p>MPG:<input type='text' name='milesPerGallon' id='milesPerGallon' value ="${motorcycle.milesPerGallon}"/></p>
	<p>Range:<input type='text' name='rangeInMiles' id='rangeInMiles' value ="${motorcycle.rangeInMiles}"/></p>
	<p>Weight:<input type='text' name='weightInPoundsWet' id='weightInPoundsWet' value ="${motorcycle.weightInPoundsWet}"/></p>
	<p>Pannier: <input type='text' name='pannierCapable' id='pannierCapable' value ="${motorcycle.pannierCapable}"/></p>
	<p>Price: <input type='text' name='priceNewInUsDollars' id='priceNewInUsDollars' value ="${motorcycle.priceNewInUsDollars}"/></p>
	<p>Desc:<input type='text' name='description' id='description' value ="${motorcycle.description}"/></p>
	<p><input type='submit' value='Save'/></p>
 </form>

</body>
</html>