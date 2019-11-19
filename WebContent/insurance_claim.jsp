<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insurance Claim Form</title>
</head>
<body>
	<h1 style="text-align: center">Insurance Claim</h1>
	<form align="middle">
		<table style="width: 50%"align:"center">
			<h3 style="text-align: center">Particulars of Insuree</h3>
			<form align="middle">
				<table style="width: 50%"align:"center">

					<tr>
						<td>Policy Number</td>
						<td><input type="text" name="policyno" /></td>
					</tr>
					<tr>
						<td>Insurance Company</td>
						<td><input type="text" name="insurance_company" /></td>
					</tr>
					<tr>
						<td>Name of Insuree</td>
						<td><input type="text" name="name" /></td>
					</tr>
					<tr>
						<td>Sum Insured</td>
						<td><input type="text" name="sum_insured" /></td>
					</tr>
				</table>
				<table>
					<h3 style="text-align: center">Details of Cause for Loss</h3>
					<form align="middle">
						<table style="width: 50%"align:"center">

							<tr>
								<td>Cause of Loss</td>
								<td><input type="text" name="cause" /></td>
							</tr>
							<tr>
								<td>Date of Loss</td>
								<td><input type="text" name="date" /></td>
							</tr>
						</table>
						<input type="button" value="Submit" name="submit" />
					</form>
</body>
</html>