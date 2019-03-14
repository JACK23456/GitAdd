<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
   #a{
      margin-left: 700px;
      margin-top: 300px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
<div id="a">
    <label>用户名:&nbsp;${username }</label>
    <br><br>
    <a href="${pageContext.request.contextPath }/changeper?uid=${uid}&username=${username}">修改用户名和密码</a>
    <br>
    <a href="${pageContext.request.contextPath }/home.jsp">返回首页</a>
</div>
</body>
</html>