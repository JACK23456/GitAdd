<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/jquery.validate.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<title>Insert title here</title>
<script type="text/javascript">
function a(id,mon){
	if(confirm("你确定要删除吗？")){
		window.location.href="${pageContext.request.contextPath }/deletecon?name="+id+"&money="+mon;
	}
}

$(function(){
	$("#form").validate({
		rules:{
			"findcon":{
				"required":true,
			}
		},
		messages:{
			"findcon":{
				"required":"不能为空",
			}
		}
	});
});
</script>
<style type="text/css">
	#a{
	margin-left:430px;
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
    margin-left: 480px;
    margin-top: 150px;
   }
   .error{
    color:red;
   }
   #f{
   	margin-left:530px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
<div id="f">
	<h3>消费记录</h3>
</div>
     <table id="a" border="1">
      <tr>
        <th>消费项目名称</th>
        <th>消费金额</th>
        <th>消费时间</th>
      </tr>
   
    <c:if test="${empty conitemlist }">
      <label id="b" style="color:red">暂无数据</label>
    </c:if>
    <c:if test="${!empty conitemlist }">
       <c:forEach items="${conitemlist }" var="con">
        <tr>
          <td>${con.consumename }</td>
          <td>${con.money }</td>
          <td>${con.time }</td>
          <td>
             <a id=${con.money } onclick=a(this.name,this.id) name=${con.consumename } >删除</a>
          </td>
           <td>
        <a id="cha" href="${pageContext.request.contextPath }/changecon?name=${con.consumename}&money=${con.money}
        &time=${con.time}&cid=${con.cid}">修改</a>
      </td>
        </tr>
       </c:forEach>
    </c:if>
    </table>
    <div id="c">
       <form action="${pageContext.request.contextPath }/findcon" id="form">
          <input type="text" name="findcon" placeholder="输入消费项目名称"><br><br>
          <input type="submit" value="搜索">
       </form>
    </div>
    <div id="d"> 
    <a href="${pageContext.request.contextPath }/insertconitem.jsp" >插入数据</a>
    &nbsp;&nbsp;&nbsp;&nbsp;
    <a href="${pageContext.request.contextPath }/property" >返回</a>
    </div>
</body>
</html>