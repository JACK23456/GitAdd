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
		window.location.href="${pageContext.request.contextPath }/deletediary?time="+id;
	}
}

$(function(){
	$("#form").validate({
		rules:{
			"finddia":{
				"required":true,
			}
		},
		messages:{
			"finddia":{
				"required":"不能为空",
			}
		}
	});
});
</script>
<style type="text/css">
	#a{
	margin-left:450px;
	margin-top:40px;
   }
   #b{
    margin-left:490px;
    padding-top: 200px;
   }
   #c{
    margin-left:900px;
   }
   #d{
    margin-left: 485px;
    margin-top: 300px;
   }
   .error{
    color:red;
   }
    #e{
    margin-left:1000px;
   }
    #f{
   	margin-left:525px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
<div id="f">
	<h3>个人日记</h3>
</div>
<div id="e">
  <a href="${ pageContext.request.contextPath}/percenter">个人中心</a>
  <a href="${ pageContext.request.contextPath}/index.jsp">退出登录</a>
</div>
   <table id="a" border="1">
      <tr>
        <th>时间</th>
        <th>事件</th>
        <th>地点</th>
        <th>人物</th>
      </tr>
   
    <c:if test="${empty diarylist }">
     <label id="b" style="color:red">暂无数据</label>
    </c:if>
    <c:if test="${!empty diarylist }">
       <c:forEach items="${diarylist }" var="dia">
        <tr>
          <td>${dia.time }</td>
          <td>${dia.accident }</td>
          <td>${dia.location }</td>
          <td>${dia.people }</td>
           <td>
         <a id="del" onclick=a(this.name) name=${dia.time }>删除</a>
      </td>
        <td>
        <a id="cha" href="${pageContext.request.contextPath }/changedia?time=${dia.time}&accident=${dia.accident}
        &location=${dia.location}&people=${dia.people}&diaid=${dia.diaid}">修改</a>
      </td>
        </tr>
       </c:forEach>
    </c:if>
    </table>
    <div id="c">
       <form action="${pageContext.request.contextPath }/finddia" id="form">
          <input type="text" name="finddia" placeholder="输入时间"><br><br>
          <input type="submit" value="搜索">
       </form>
    </div>
    <div id="d"> 
    <a href="${pageContext.request.contextPath }/insertdia.jsp" >插入数据</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="${pageContext.request.contextPath }/home.jsp" >返回首页</a>
    </div>
</body>
</html>