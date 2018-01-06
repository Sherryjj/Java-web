<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form name="listForm" id="f001" method="post">
  <table border=1 cellspacing=0 width=600px>
  <tr style="background:#ccc;text-align:center;">
      <td colspan="4"><input type="text" name="gname"/>
      <input type="button" value="查询" onclick="query()"/>
      <input type="button" value="新增" onclick="save()"/>
  </td></tr>
    <tr style="background:#ccc;"><td>商品编号</td><td>商品名称</td><td>商品价格</td><td>操作</td></tr>
    <c:forEach items="${goodsList}" var="data">
      <tr>
         <td>${data.gid}</td><td>${data.gname}</td><td>${data.gprice}</td>
         <td>
            <a href="${pageContext.request.contextPath}/deleteGoodsController/${data.gid}">删除</a>
            <a href="${pageContext.request.contextPath}/loadUpdateController/${data.gid}">修改</a>
         </td>
      </tr>
    </c:forEach>
  </table>
</form>
<script>
   function query(){
       document.listForm.action="${pageContext.request.contextPath}/queryByNameController";
       document.listForm.submit();
   }
   function save(){
	   document.listForm.action="${pageContext.request.contextPath}/loadAddController";
       document.listForm.submit();
   }
</script>