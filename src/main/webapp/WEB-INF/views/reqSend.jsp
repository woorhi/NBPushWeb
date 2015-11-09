<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="msg" method="post">
<table>
<tr>
<td>Receiver</td><td><select name="receiverId">
<option value="woorhi">woorhi</option>
<option value="test">test</option>
<option value="test1">test1</option>
</select></td></tr>
<tr><td>Title</td><td><input type="text" name="title" /></td></tr>
<tr><td>Content</td><td><input type="text" name="content" /></td></tr>
<tr><td colspan="2"><input type="submit" value=" RequestSend" /></td></tr>
</table>
</form>
</body>
</html>