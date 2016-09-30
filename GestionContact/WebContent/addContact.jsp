<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="addContact">
<table>

	<tr>
	<td><h2>Voici un premier exemple de composant web avec un servlet</h2></td>
	</tr>
	<tr>
	<td> <i> Nom : <input type="text" name="lastname" size="50"></i></td>
	</tr>
	
	<tr>
		<td> <i> Prenom : <input type="text" name="firstname" size="50"></i></td>
	</tr>
	<tr>
		<td><i> Mail : <input type="text" name="email" size="100"></i></td>
	</tr>
	<tr>
	<td>
	<input class="button" type="submit" value="Submit" />
	<input class="button" type="reset"  value="Reset" />
	</td>
	</tr>

</table>

</form>

</body>
</html>