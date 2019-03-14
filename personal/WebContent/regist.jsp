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
   $.validator.addMethod(
	       "checkusername",
		   function(value,element,params){
		       var flag=false;
			   $.ajax({
				   "async":false,
				   "url":"${pageContext.request.contextPath}/regist",
				   "data":{"name":value},
				   "dataType":"json",
				   "type":"POST",
				   "success":
					   function(data){
					   flag=data.regist;
				   }
			   });
	           return !flag;       
	       }
   );
   
   $(function(){
	   $("#registform").validate({
		   rules:{
			   "name":{
				   "required":true,
				   "checkusername":true
			   },
			   "password":{
				   "required":true
			   },
			   "repassword":{
				   "required":true,
				   "equalTo":"#password"
			   }
		   },
		   messages:{
			   "name":{
				   "required":"用户名不能为空",
				   "checkusername":"用户名已存在"
			   },
		       "password":{
		    	   "required":"密码不能为空"
		       },
		       "repassword":{
		    	   "required":"确认密码不能为空",
		    	   "equalTo":"两次密码不一致"
		       }
		   }
	   });
   });
</script>
<style type="text/css">
	#registform{
	margin-left:650px;
	margin-top:300px;
   }
   #a{
    margin-left:80px;
   }
   #e{
     margin-left:700px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
<div id="e">
  <a href="${ pageContext.request.contextPath}/percenter">个人中心</a>&nbsp;&nbsp;
  <a href="${ pageContext.request.contextPath}/index.jsp">退出登录</a>
</div>
   <form action="${pageContext.request.contextPath }/registinfo" method="post" id="registform">
     <label>&nbsp;&nbsp;&nbsp;&nbsp;账号:&nbsp;&nbsp;</label>
     <input type="text" name="name">
     <br>
     <label>&nbsp;&nbsp;&nbsp;&nbsp;密码:&nbsp;&nbsp;</label>
     <input type="password" id="password" name="password">
     <br>
     <label>确认密码:</label>
     <input type="password" name="repassword">
     <br><br>
     <input type="submit" value="注册" id="a"> 
     <input type="button" onclick="javascript:history.back(-1);" value="取消">
   </form>
</body>
</html>