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
		$("#form").validate({
			rules:{
				"conitem":{
					"required":true,
				}
			},
			messages:{
				"conitem":{
					"required":"消费项目名称不能为空",
				}
			}
		});
	});
</script>
<style type="text/css">
   .mybody{
      margin-left: 660px;
      margin-top: 280px;
   }
   #e{
    margin-left:1000px;
   }
   .error{
    color:red;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
<% request.setCharacterEncoding("UTF-8"); %>
<div id="e">
  <a href="${ pageContext.request.contextPath}/percenter">个人中心</a>
  <a href="${ pageContext.request.contextPath}/index.jsp">退出登录</a>
</div>
    <form action="${pageContext.request.contextPath }/changeconto" method="post" class="mybody" id="form">
     <label>消费项目名称</label>
     <input type="text" name="conitem" value="${name }">
     <br>
     <label>消费金额</label>
     <input type="text" name="conmoney" value="${money }">
     <br>
     <label>消费时间</label>
     <input type="text" name="contime" value="${time }">
     <br>
     <input type="text" name="oldmoney" value="${money }" style="display:none">
     <input type="text" name="cid" value="${cid }" style="display:none">
     <input type="submit" value="提交" >
      <input type="button" onclick=a() value="取消" id="cancel">
   </form>
</body>
</html>