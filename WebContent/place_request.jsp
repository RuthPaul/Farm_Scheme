<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Place_Request</title>
</head>
<body>
	<h1 style="text-align: center">PLACE REQUEST</h1>
	<form align="center">
		<table style="width: 50%" align:"center">
			<tr>
				<td>Crop Type</td>
				<td><input type="text" name="crop_type" /></td>
			</tr>
			<tr>
				<td>Crop Name</td>
				<td><input type="text" name="crop_name" /></td>
			</tr>
			<tr>
				<td>Fertilizer Type</td>
				<td><input type="text" name="fertilizer" /></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><input type="text" name="quantity" /></td>
			</tr>


			<tr>
				<td>Soil PH Certificate</td>
				<td><input type="file" name="ph_certificate" /></td>
			</tr>

		</table>
		<input type="button" value="Place Request" name="place_request" />
	</form>
</body>
</html>