<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
  var re=${property.remain};
  if(re<0){
	  alert("余额不足啦！！");
  }else{
	  document.getElementById("g").style="none";
  }
  function a(id){
		if(confirm("你确定要删除吗？")){
			window.location.href="${pageContext.request.contextPath }/deletepro?income="+id;
		}
	}
</script>
<style type="text/css">
   	#a{
	margin-left:460px;
	margin-top:40px;
   }
   #b{
    margin-left:480px;
    margin-top: 200px;
   }
   #d{
    margin-left: 405px;
    margin-top: 300px;
   }
   #e{
    margin-left:1000px;
   }
   #f{
     margin-left:900px;
   }
    #h{
   	margin-left:525px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
<div id="h">
	<h3>个人财物</h3>
</div>
<div id="e">
  <a href="${ pageContext.request.contextPath}/percenter">个人中心</a>
  <a href="${ pageContext.request.contextPath}/index.jsp">退出登录</a>
</div>
   <table id="a" border="1">
    <tr>
      <th>收入<th>
      <th>剩余金额</th>
    </tr>
    <c:if test="${empty property }">
      <label id="b" style="color:red">暂无数据</label>
    </c:if>
    <c:if test="${!empty property }">
    <tr>
      <td>${property.income }</td>
      <td></td>
      <td>${property.remain}</td>
        <td>
        <a id="del" onclick=a(this.name) name=${property.income }>删除</a>
      </td>
       <td>
        <a id="cha" href="${pageContext.request.contextPath }/changepro?income=${property.income }&remain=${property.remain}&pid=${property.pid}">修改</a>
      </td>
    </tr>
    </c:if>
  </table>
  <a href="${pageContext.request.contextPath }/consumeItem" id="f">消费记录</a>
  <div id="d">
   <a href="${pageContext.request.contextPath }/insertpro.jsp" id="g">插入资金数据</a>
   &nbsp;&nbsp;&nbsp;&nbsp;
   <a href="${pageContext.request.contextPath }/insertconitem.jsp">插入消费记录</a>
   &nbsp;&nbsp;&nbsp;&nbsp;
   <a href="${pageContext.request.contextPath }/home.jsp">返回首页</a>
   </div>
</body>
</html>