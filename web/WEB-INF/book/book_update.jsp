<%--
 Created by tronghh on 01/10/2015.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
<h1>Update</h1>
<a href="/book?m=list">List</a>
<form action="/book?m=doUpdate" method="post">
    <input type="hidden" name="id" value="<c:out value="${book.id}"/>">
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" value="<c:out value="${book.name}"/>"></td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><input type="text" name="price" value="<c:out value="${book.price}"/>"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="submit" value="Update"></td>
        </tr>
    </table>
</form>
</body>
</html>
