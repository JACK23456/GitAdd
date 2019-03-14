<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/jquery.validate.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<title>Insert title here</title>
<script type="text/javascript">
  var check=${logincheck};
  if(!check){
	  alert("用户名或密码错误");
  }

	$(function(){
		$("#loginform").validate({
			rules:{
				"Name":{
					"required":true,
				},
				"Password":{
					"required":true,
				}
			},
			messages:{
				"Name":{
					"required":"请输入账号",
				},
				"Password":{
					"required":"请输入密码",
				}
			}
		});
	});
</script>
<style type="text/css">
	.div{
	margin-left:650px;
	margin-top:240px;
   }
   .error{
    color:red;
   }
   #deng{
    margin-left:80px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
<div class="div">
<form action="${pageContext.request.contextPath }/logininfo" method="post" id="loginform">
  <h2>个人信息管理系统</h2>
  <label style="color:red">账号:</label>
  <input type="text" name="Name" id="name" placeholder="请输入账号">
  <br><br>
  <label style="color:red">密码:</label>
  <input type="password" name="Password" id="password" placeholder="请输入密码">
  <br><br>
  <input type="submit" id="deng" value="登录"> 
</form>
  <br> &nbsp;&nbsp;
<label style="color:red">还没有账号？</label>
<a href="${ pageContext.request.contextPath}/regist.jsp">点击这里</a>
</div>
</body>
</html>