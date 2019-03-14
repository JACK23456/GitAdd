<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
  function a(){
	  window.location.href="${pageContext.request.contextPath }/address";
  }
  function b(id){
		if(confirm("你确定要删除吗？")){
			window.location.href="${pageContext.request.contextPath }/deletefindadd?name="+id+"&findadd=${findadd}";
		}
	}
</script>
<style type="text/css">
	#a{
	margin-left:600px;
	margin-top:100px;
   }
   #b{
    margin-left:500px;
    padding-top: 200px;
   }
   #c{
    margin-left:1000px;
	margin-top:100px;
   }
   #f{
   	margin-left:755px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
<div id="f">
	<h3>通讯录</h3>
</div>
   <table id="a" border="1">
      <tr>
      <th>姓名</th>
      <th>联系方式</th>
      <th>工作地点</th>
      <th>城市</th>
      <th>备注</th>
      </tr>
   
    <c:if test="${empty addresslist }">
      <label id="b" style="color:red">暂无数据</label>
    </c:if>
    <c:if test="${!empty addresslist }">
       <c:forEach items="${addresslist }" var="add">
        <tr>
          <td>${add.name}</td>
          <td>${add.phone}</td>
          <td>${add.location}</td>
          <td>${add.city }</td>
          <td>${add.remark }</td>
      <td>
         <a id="del" name="${add.name}" onclick=b(this.name) >删除</a>
      </td>
      <td>
        <a id="cha" href="${pageContext.request.contextPath }/changeadd?name=${add.name}&phone=${add.phone}
        &location=${add.location }&city=${add.city}&remark=${add.remark}&aid=${add.aid}">修改</a>
      </td>
        </tr>
       </c:forEach>
    </c:if>
    </table>
     <input type="button" onclick=a() value="返回" id="c">
</body>
</html>