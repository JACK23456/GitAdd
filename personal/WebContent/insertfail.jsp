<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
  function a(){
	  window.history.back(-1);
  }
</script>
<style type="text/css">
  #c{
    margin-left:1000px;
	margin-top:100px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
    <h2>插入失败，请咨询432管理员...</h2>
    <input type="button" onclick=a() value="返回" id="c">
</body>
</html>