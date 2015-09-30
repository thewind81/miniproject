<%--
 Created by tronghh on 01/10/2015.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Insert</title>
</head>
<body>
<h1>Insert</h1>
<a href="/book?m=list">List</a>
<form action="/book?m=doInsert" method="post">
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" name="submit" value="Insert"></td>
        </tr>
    </table>
</form>
</body>
</html>
