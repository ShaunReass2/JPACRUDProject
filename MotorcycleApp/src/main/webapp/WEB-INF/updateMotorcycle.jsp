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

<center><h3><font style = "microgram" size = 7>TWO WHEELS &nbsp; || &nbsp; INFINTE POSSIBILITIES</font></h3></center>
<center><h1><font style = "microgram" size = 5>CRUD &nbsp; || &nbsp; YOUR &nbsp; || &nbsp; RIDE</font></h1></center>


<form action="updateMotorcycle" method="post">
	<center><p>ID: <input readonly='true' type='text' name='id' id='id' value ="${motorcycle.id}"/></p></center>
	<center><p>Name: <input type='text' name='name' id='name' value ="${motorcycle.name}"/></p></center>
	<center><p>Make: <input type='text' name='make' id='make' value ="${motorcycle.make}"/></p></center>
	<center><p>Model: <input type='text' name='model' id='model' value ="${motorcycle.model}"/></p></center>
	<center><p>Year: <input type='text' name='year' id='year' value ="${motorcycle.year}"/></p></center>
	<center><p>Market: <input type='text' name='market' id='market' value ="${motorcycle.market}"/></p></center>
	<center><p>Fuel Type:<input type='text' name='fuelType' id='fuelType' value ="${motorcycle.fuelType}"/></p></center>
	<center><p>Fuel Capacity (gal): <input type='text' name='fuelTankCapacityInGallons' id='fuelTankCapacityInGallons' value ="${motorcycle.fuelTankCapacityInGallons}"/></p></center>
	<center><p>MPG:<input type='text' name='milesPerGallon' id='milesPerGallon' value ="${motorcycle.milesPerGallon}"/></p></center>
	<center><p>Range (miles):<input type='text' name='rangeInMiles' id='rangeInMiles' value ="${motorcycle.rangeInMiles}"/></p></center>
	<center><p>Weight (pounds):<input type='text' name='weightInPoundsWet' id='weightInPoundsWet' value ="${motorcycle.weightInPoundsWet}"/></p></center>
	<center><p>Panniers (pair): <input type='text' name='pannierCapable' id='pannierCapable' value ="${motorcycle.pannierCapable}"/></p></center>
	<center><p>Price ($USD): <input type='text' name='priceNewInUsDollars' id='priceNewInUsDollars' value ="${motorcycle.priceNewInUsDollars}"/></p></center>
	<center><p>Description:<input type='text' name='description' id='description' value ="${motorcycle.description}"/></p></center>
	<p><input type='submit' value='Save'/></p>
 </form>

<br>
<br>
	<form action="/"><input type="submit" value="Return to the Home Page"></form>
<br>
<br>

</body>
</html>