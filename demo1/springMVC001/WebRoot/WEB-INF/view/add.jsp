<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<form name="addForm" action="${pageContext.request.contextPath}/saveGoodsController" method="post">
  <table border=1 cellspacing=0>
      <tr style="background:#ccc;"><td colspan="2">新增</td></tr>
      <tr><td>商品编号</td><td><input type="text" name="gid"/></td></tr>
      <tr><td>商品名称</td><td><input type="text" name="gname"/></td></tr>
      <tr><td>商品价格</td><td><input type="text" name="gprice"/></td></tr>
      <tr style="text-align:center;background:#ccc;"><td colspan="2">
      <input type="submit" value="新增"/></td></tr>
  </table>
</form>