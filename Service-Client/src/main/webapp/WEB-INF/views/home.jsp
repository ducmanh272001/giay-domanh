<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="stag" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<stag:url value="/" var="rootpath"/>
<body>
<h1>Xin chào bạn đến với Bkap</h1>
<hr>
<a href="${rootpath}student">Bấm vào đây xem danh sách sinh viên</a>
<a href="${rootpath}classes">Bấm vào đây xem danh sách lớp học</a>
</body>
</html>