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
				},
				"conmoney":{
					"required":true,
					"number":true
				},
			},
			messages:{
				"conitem":{
					"required":"消费项目名称不能为空",
				},
				"conmoney":{
					"required":"消费金额不能为空",
					"number":"请输入数字",
				}
			}
		});
	});
</script>
<style type="text/css">
   #mybody{
      margin-left: 660px;
      margin-top: 280px;
   }
    .error{
    color:red;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg" id="mybody">
   <form action="${pageContext.request.contextPath }/conItemIn" method="post" id="form">
     <label>消费项目名称</label>
     <input type="text" name="conitem">
     <br>
     <label>消费金额</label>
     <input type="text" name="conmoney">
     <br>
     <label>消费时间</label>
     <input type="text" name="contime">
     <br>
     <input type="submit" value="提交">
     <input type="button" onclick=a() value="取消" id="cancel">
   </form>
</body>
</html>