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
				"time":{
					"required":true,
				}
			},
			messages:{
				"time":{
					"required":"消费项目名称不能为空",
				}
			}
		});
	});
</script>
<style type="text/css">
   #mybody{
      margin-left: 700px;
      margin-top: 330px;
   }
    .error{
    color:red;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg" id="mybody">
    <form action="${pageContext.request.contextPath }/memoIn" method="post" id="form">
     <label>时间</label>
     <input type="text" name="time">
     <br>
     <label>事件</label>
     <input type="text" name="accident">
     <br>
     <label>地点</label>
     <input type="text" name="location">
     <br>
     <input type="submit" value="提交">
     <input type="button" onclick=a() value="取消" id="cancel">
   </form>
</body>
</html>