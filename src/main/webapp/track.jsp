<%--
  Created by IntelliJ IDEA.
  User: arnaud
  Date: 15/05/18
  Time: 00:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Track</title>
</head>

<head>
    <title>GithuberTracker - People</title>
</head>

<jsp:include page="header.jsp"/>
<form action="${pageContext.request.contextPath}/track" method="post">
    <label>login:</label>
    <input name="login" type="text" id="login">
    <br/>
    <button type="submit">Submit</button>
</form>
</body>
</html>
