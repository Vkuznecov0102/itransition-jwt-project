<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>Log in with your account</title>
</head>

<body>
<div>
  <table>
    <thead>
    <th>ID</th>
    <th>UserName</th>
    <th>Password</th>
    <th>Roles</th>
    </thead>
    <c:forEach items="${getAll}" var="userService">
      <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.lastname}</td>
        <td>${user.email}</td>
        <td>${user.password}</td>
        <td>${user.status}</td>
        <td>
          <c:forEach items="${user.roles}" var="role">${role.getName}; </c:forEach>
        </td>
      </tr>
    </c:forEach>
  </table>
  <a href="/">Главная</a>
</div>
</body>
</html>