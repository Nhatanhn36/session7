<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Add Student</title>
	<link type="text/css" rel="stylesheet" href="css/style.css">
	<link type="text/css" rel="stylesheet" href="css/add-student-style.css">
</head>
<body>
<div id="wrapper">
  	<div id="header">
	  	<h2>CodeLean Academy</h2>
  	</div>
</div>

<div id="container">
	<h3>Add Student</h3>
	<form action="StudentControllerServlet" method="GET">
		<input type="hidden" value="ADD" name="command">
		<table>
			<tbody>
				<tr>
					<td><label>First Name:</label></td>
					<td><input type="text" name="firstName"></td>
				</tr>
				<tr>
					<td><label>Last Name:</label></td>
					<td><input type="text" name="lastName"></td>
				</tr>
				<tr>
					<td><label>Email:</label></td>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<td><label>Student Image:</label></td>
					<td><input type="file" name="studentImg"></td>
				</tr>
				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save" class="save"></td>
				</tr>
			</tbody>
		</table>
	</form>
	<div style="clear: both"></div>
	<p>
		<a href="StudentControllerServlet">Back to List</a>
	</p>
</div>
</body>
</html>
