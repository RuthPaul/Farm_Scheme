<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Farmer Registration Form</title>
</head>
<body>
	<h1 style="text-align:center">FARMER REGISTRATION</h1>
	<form align="middle">
		<table style="width: 50%" style="text-align:center"  >
			<tr>
				<td>Full Name</td>
				<td><input type="text" name="full_name" /></td>
			</tr>
			<tr>
				<td>Contact No.</td>
				<td><input type="text" name="contact_no" /></td>
			</tr>
			<tr>
				<td>Email_id</td>
				<td><input type="text" name="email_id" /></td>
			</tr>
			<tr>
				<td>Address Details</td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td>State</td>
				<td><input type="text" name="state" /></td>
			</tr>
			<tr>
				<td>Pincode</td>
				<td><input type="text" name="pincode" /></td>
			</tr>
			<tr>
				<td>Land Details</td>
			</tr>
			<tr>
				<td>Area</td>
				<td><input type="text" name="area" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>Pin Code</td>
				<td><input type="text" name="pincode" /></td>
			</tr>
			<tr>
				<td>Bank Details</td>
			</tr>
			<tr>
				<td>Account No.</td>
				<td><input type="text" name="account_no" /></td>
			</tr>
			<tr>
				<td>IFSC</td>
				<td><input type="text" name="ifsc" /></td>
			</tr>
			<tr>
				<td>Document Upload</td>
			</tr>
			<tr>
				<td>Aadhar Card</td>
				<td><input type="file" name="aadhar_card" /></td>
			</tr>
			<tr>
				<td>PAN Card</td>
				<td><input type="file" name="pan_card" /></td>
			</tr>
			<tr>
				<td>Trader License</td>
				<td><input type="file" name="trader_lic"/></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="text" name="confirm_password" /></td>
			</tr>
</table>
		<input type="button" value="Register" name="register" />
		<input type="button" value="Reset" name="reset" />
	</form>
</body>
</html>