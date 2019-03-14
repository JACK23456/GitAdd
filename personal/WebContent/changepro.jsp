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
  function a(){
	  window.history.back(-1);
  }
  $(function(){
		$("#myform").validate({
			rules:{
				"income":{
					"required":true,
					"number":true,
				},
			},
			messages:{
				"income":{
					"required":"收入不能为空",
					"number":"请输入数字",
				},
			}
		});
	});
</script>
<style type="text/css">
   #mybody{
      margin-left: 660px;
      margin-top: 150px;
   }
   #e{
    margin-left:1000px;
   }
   .error{
    color:red;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg" id="mybody">
   <div id="e">
  <a href="${ pageContext.request.contextPath}/percenter">个人中心</a>
  <a href="${ pageContext.request.contextPath}/index.jsp">退出登录</a>
</div>
     <form action="${pageContext.request.contextPath }/changeproto" method="post" id="myform">
     <label>添加收入</label>
     <input type="text" name="income" placeholder="请输入要增加的金额">
     <br>
     <input type="text" name="remain" value=${remain } style="display:none">
     <input type="text" name="inmoney" value=${income } style="display:none">
     <input type="text" name="remoney" value=${remain } style="display:none">
     <input type="text" name="pid" value="${pid }" style="display:none">
     <input type="submit" value="提交">
      <input type="button" onclick=a() value="取消" id="cancel">
   </form>
</body>
</html>