<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insurance Application Form</title>
</head>
<body>
	<h1 style="text-align: center">Insurance Application</h1>
	<form align="middle">
		<table style="width: 50%"align:"center">


			<tr>
				<td>Season</td>
				<td><input type="text" name="policyno" /></td>
			</tr>
			<tr>
				<td>Year</td>
				<td><input type="text" name="insurance_company" /></td>
			</tr>
			<tr>
				<td>Crop</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>Area</td>
				<td><input type="text" name="sum_insured" /></td>
			</tr>
		</table>

		<input type="button" value="Reset" name="reset" /> 
		<input type="button" value="Calculate" name="calculate" />

	</form>
</body>
</html>