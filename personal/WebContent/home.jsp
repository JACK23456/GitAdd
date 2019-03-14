<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
   #e{
    margin-left:700px;
   }
   #a{
     margin-left:300px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
 <div id="e">
  <a href="${ pageContext.request.contextPath}/percenter">个人中心</a>&nbsp;&nbsp;
  <a href="${ pageContext.request.contextPath}/index.jsp">退出登录</a>
</div>
<div id="a">
<table>
<tr>
   <td style="padding-left: 300px;padding-top:200px">
   <form action="${pageContext.request.contextPath }/address">
   <input type="submit" value="个人通讯录">
   </form>
   </td>
   <td style="padding-left: 200px;padding-top:200px">
   <form action="${pageContext.request.contextPath }/memo">
   <input type="submit" value="个人备忘录">
   </form>
   </td>
</tr>
<tr>
   <td style="padding-left: 300px;padding-top:100px">
   <form action="${pageContext.request.contextPath }/diary">
   <input type="submit" value="个人日记">
   </form>
   </td>
   <td style="padding-left: 200px;padding-top:100px">
   <form action="${pageContext.request.contextPath }/property">
   <input type="submit" value="个人财物">
   </form>
   </td>
</tr>
</table>
</div>
</body>
</html>