<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>List books</h1>
	<a href="<c:url value="/registerBook"/>">Dodaj książekę</a>
	<table>
		<tr>
			<th>Category</th>
			<th>Description</th>
			<th>Links</th>
		</tr>
		<c:forEach items="${adList}" var="ads">
			<tr>
				<td>${ads.adCagtegory}</td>
				<td>${ads.description}</td>
				
				<td><a href="<c:url   value="adDetails/${ads.id}"/>">Szczegóły</a>
			</tr>
		</c:forEach>
	</table>
</body>
</html>