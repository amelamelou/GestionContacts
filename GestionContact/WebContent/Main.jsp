<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Espace Personnel</title>
</head>
<body>
		
<table>

	<tr>
	<td>
	<form method="post" action="addContact.jsp">
	<input class="button" type="submit" value="Creer un Contact" />
	</form>
	</td>
	<td>
	<form method="post" action="searchContact.jsp">
	<input class="button" type="submit" value="Rechercher un Contact" />
	</form>
	</td>
	<td>
	<form method="post" action="ListContact.jsp">
	<input class="button" type="submit" value="Liste Contacts" />
	</form>
	</td>
	<td>
	<form method="post" action="removeContact.jsp">
	<input class="button" type="submit" value="Supprimer un contact" />
	</form>
	</td>
	</tr>

</table>
	
</body>
</html>