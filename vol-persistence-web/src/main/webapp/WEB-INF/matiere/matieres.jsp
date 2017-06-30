<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des matières</title>
</head>
<body>
	<div class="container">
		<fieldset>
			<legend>Liste des matières</legend>
			<table class="table table-striped">
				<tr>
					<th>Id</th>
					<th>Version</th>
					<th>Nom</th>
					<th>Difficulté</th>
				</tr>

				<c:forEach items="${matieres}" var="matiere">
					<tr>
						<td>${matiere.id}</td>
						<td>${matiere.version}</td>
						<td>${matiere.nom}</td>
						<td>${matiere.difficulte}</td>
					</tr>
				</c:forEach>

			</table>
		</fieldset>
	</div>
</body>
</html>