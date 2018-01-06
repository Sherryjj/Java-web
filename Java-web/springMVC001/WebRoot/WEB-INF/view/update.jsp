<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<form name="updateForm" action="${pageContext.request.contextPath}/updateController" method="post">
  <table border=1 cellspacing=0>
      <tr style="background:#ccc;"><td colspan="2">修改</td></tr>
      <tr><td>商品编号</td><td><input type="text" disabled name="gid" value="${goods.gid }"/>
          <input type="hidden" name="gid" value="${goods.gid}"/>"
      </td></tr>
      <tr><td>商品名称</td><td><input type="text" name="gname" value="${goods.gname }"/></td></tr>
      <tr><td>商品价格</td><td><input type="text" name="gprice" value="${goods.gprice }"/></td></tr>
      <tr style="text-align:center;background:#ccc;"><td colspan="2">
      <input type="submit" value="修改"/></td></tr>
  </table>
</form>