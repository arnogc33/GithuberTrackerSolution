<%--

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Github Tracker - githubers.jsp</title>
    <jsp:include page="header.jsp" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<head>
    <title>GithuberTracker - People</title>
</head>

<jsp:include page="header.jsp" />

<h1>People</h1>
<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>login</th>
        <th>ID</th>
        <th>picture</th>
    </tr>
    <c:forEach items="${githubersList}" var="githuber">
        <tr>
            <td><c:out value="${githuber.name}" /></td>
            <td><c:out value="${githuber.email}" /></td>
            <td><c:out value="${githuber.login}" /></td>
            <td><c:out value="${githuber.id}" /></td>
            <td><img src="<c:out value="${githuber.avatarUrl}" />" width="60"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>