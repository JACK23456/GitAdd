<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/jquery.validate.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<title>Insert title here</title>
<script type="text/javascript">
function a(id){
	if(confirm("你确定要删除吗？")){
		window.location.href="${pageContext.request.contextPath }/deleteadd?name="+id;
	}
}

$(function(){
	$("#form").validate({
		rules:{
			"findadd":{
				"required":true,
			}
		},
		messages:{
			"findadd":{
				"required":"不能为空",
			}
		}
	});
});
</script>
<style type="text/css">
	#a{
	margin-left:400px;
	margin-top:40px;
   }
   #b{
    margin-left:500px;
    margin-top: 200px;
   }
   #c{
    margin-left:900px;
   }
   #d{
    margin-left: 460px;
    margin-top: 300px;
   }
   #e{
    margin-left:1000px;
   }
   .error{
    color:red;
   }
   #f{
   	margin-left:525px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
<div id="f">
	<h3>个人通讯录</h3>
</div>
<div id="e">
  <a href="${ pageContext.request.contextPath}/percenter">个人中心</a>
  <a href="${ pageContext.request.contextPath}/index.jsp">退出登录</a>
</div>
  <table id="a" border="1">
    <tr>
      <th>姓名</th>
      <th>联系方式</th>
      <th>工作地点</th>
      <th>城市</th>
      <th>备注</th>
    </tr>
    <tr>
    <c:if test="${empty addresslist }">
       <label id="b" style="color:red">暂无数据</label>
    </c:if>
    </tr>
    <c:if test="${!empty addresslist }">
    <c:forEach items="${addresslist }" var="add">
    <tr>
      <td>${add.name}</td>
      <td>${add.phone}</td>
      <td>${add.location}</td>
      <td>${add.city }</td>
      <td>${add.remark }</td>
      <td>
        <a id="del" name="${add.name}" onclick=a(this.name) >删除</a>
      </td>
      <td>
        <a id="cha" href="${pageContext.request.contextPath }/changeadd?name=${add.name}&phone=${add.phone}
        &location=${add.location }&city=${add.city}&remark=${add.remark}&aid=${add.aid}">修改</a>
      </td>
    </tr>
    </c:forEach>
        </c:if>
  </table>
  <div id="c">
       <form action="${pageContext.request.contextPath }/findadd" id="form">
          <input type="text" name="findadd" placeholder="输入姓名"><br><br>
          <input type="submit" value="搜索">
       </form>
    </div>
    <div id="d"> 
    <a href="${pageContext.request.contextPath }/insertadd.jsp" >插入数据</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="${pageContext.request.contextPath }/home.jsp" >返回首页</a>
    </div>
</body>
</html>