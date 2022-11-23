<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="stag" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sform" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<stag:url value="/" var="rootpath" />
<body>
  <h1>Chào bạn</h1>
  <hr>
  <span>${mess.text}</span>
	<sform:form action="${rootpath}student/insertok" method="post"
		modelAttribute="std">
		<table border="1">
			<tr>
				<th>Nhập tên:</th>
				<td><sform:input type="text" path="fullname" /></td>
			</tr>
			<tr>
				<th>Nhập giới tính:</th>
				<td><sform:radiobutton path="gender" value="true" />Nam <sform:radiobutton
						path="gender" value="false" />Nữ</td>
			</tr>
			<tr>
				<th>Nhập ngày sinh:</th>
				<td><sform:input type="date" path="birthday" /></td>
			</tr>
			<tr>
				<th>Nhập địa chỉ:</th>
				<td><sform:input type="text" path="address" /></td>
			</tr>
			<tr>
				<th>Chọn lớp học</th>
				<td><sform:select path="idClass">
						<sform:options items="${lst}" itemValue="idClass"
							itemLabel="className" />
					</sform:select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Thêm"></td>
				<td><input type="reset" value="Làm lại"></td>
			</tr>
		</table>
	</sform:form>
</body>
</html>