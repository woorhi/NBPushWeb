<%@page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	요청목록
</h1>
<a href="msg">요청등록</a>
<table>
<tr>
	<td>번호</td>
	<td>제목</td>
	<td>메시지내용</td>
	<td>상태</td>
	<td>성공</td>
	<td>실패</td>
</tr>
<c:forEach items="${ReqList}" var="list">
<tr><td>${list.msgMngId}</td><td>${list.title}</td><td>${list.content}</td>
<td>${list.result}</td><td>${list.successCnt}</td><td>${list.failCnt}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
