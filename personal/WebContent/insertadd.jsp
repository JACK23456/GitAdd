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
				"name":{
					"required":true
				}
			},
			messages:{
				"name":{
					"required":"用户名不能为空"
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
<body background="${ pageContext.request.contextPath}/image/1.jpg"  id="mybody">
   <form action="${pageContext.request.contextPath }/addressIn" method="post" id="form">
     <label>姓名</label>
     <input type="text" name="name">
     <br>
     <label>联系方式</label>
     <input type="text" name="phone">
     <br>
     <label>工作地点</label>
     <input type="text" name="location">
     <br>
     <label>城市</label>
     <input type="text" name="city">
     <br>
     <label>备注</label>
     <input type="text" name="remark">
     <br>
     <input type="submit" value="提交">
     <input type="button" onclick=a() value="取消" id="cancel">
   </form>
</body>
</html>