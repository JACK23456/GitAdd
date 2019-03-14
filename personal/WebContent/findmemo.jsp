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
	  window.location.href="${pageContext.request.contextPath }/memo";
  }
  function b(id){
		if(confirm("你确定要删除吗？")){
			window.location.href="${pageContext.request.contextPath }/deletefindmemo?time="+id+"&findmemo=${findmemo}";
		}
	}
</script>
<style type="text/css">
	#a{
	margin-left:600px;
	margin-top:100px;
   }
   #b{
    margin-left:425px;
    padding-top: 200px;
   }
   #c{
    margin-left:1000px;
	margin-top:100px;
   }
   #f{
   	margin-left:680px;
   }
</style>
</head>
<body background="${ pageContext.request.contextPath}/image/1.jpg">
<div id="f">
	<h3>备忘录</h3>
</div>
   <table id="a" border="1">
      <tr>
         <th>时间</th>
        <th>事件</th>
        <th>地点</th>
      </tr>
   
    <c:if test="${empty memolist }">
      <label id="b" style="color:red">暂无数据</label>
    </c:if>
    <c:if test="${!empty memolist }">
       <c:forEach items="${memolist }" var="memo">
        <tr>
          <td>${memo.time }</td>
          <td>${memo.accident }</td>
          <td>${memo.location }</td>
      <td>
       <a id="del" name="${memo.time}" onclick=b(this.name) >删除</a>
      </td>
       <td>
        <a id="cha" href="${pageContext.request.contextPath }/changememo?time=${memo.time}&accident=${memo.accident}&location=${memo.location}&mid=${memo.mid}">修改</a>
      </td>
        </tr>
       </c:forEach>
    </c:if>
    </table>
     <input type="button" onclick=a() value="返回" id="c">
</body>
</html>