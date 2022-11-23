<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="stag" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<stag:url value="/" var="rootpath"/>
<body>
	<h1>Trang danh sach Student</h1>
	<hr>
	<table border="1">
		<tr>
			<th>STUID</th>
			<th>FULLNAME</th>
			<th>GENDER</th>
			<th>BIRTHDAY</th>
			<th>ADDRESS</th>
			<th>CLASSID</th>
			<th>THEM</th>
			<th>SUA</th>
			<th>XOA</th>
		</tr>
		<c:forEach items="${lst}" var="l">
			<tr>
				<td>${l.id}</td>
				<td>${l.fullname}</td>
				<td>${l.gender?"Nam":"Nu"}</td>
				<td><fmt:formatDate value="${l.birthday}" pattern="dd-MM-yyyy" /></td>
				<td>${l.address}</td>
				<td>${l.nameClass}</td>
				<td><a href="${rootpath}student/insert">insert</a></td>
				<td><a href="${rootpath}student/update">update</a></td>
				<td><a href="${rootpath}student/delete">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>