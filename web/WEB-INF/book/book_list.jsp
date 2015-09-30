<%--
 Created by tronghh on 23/09/2015.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h1>Hello World!</h1>
<a href="/book?m=insert">Insert</a> | <a href="/book?m=list">Refresh</a>
<table border="1">
    <thead>
    <tr>
        <td>No</td>
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td>Action</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${bookList}" var="book" varStatus="status">
        <tr>
            <td><c:out value="${status.count}"/></td>
            <td><c:out value="${book.id}"/></td>
            <td><c:out value="${book.name}"/></td>
            <td><c:out value="${book.price}"/></td>
            <td>
                <c:url var="urlUpdate" value="/book?m=update">
                    <c:param name="id" value="${book.id}"/>
                </c:url>
                <c:url var="urlDelete" value="/book?m=doDelete">
                    <c:param name="id" value="${book.id}"/>
                </c:url>
                <a href="${urlUpdate}">Update</a> | <a href="${urlDelete}">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
