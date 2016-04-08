<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>featherdz</title>
</head>
<body>
		
			<div>
				<div>
					<a href="login.jsp">新增</a>
					<table>
						<tr>
							<th>编号</th>
							<th>用户名</th>
							<th>密码</th>
						</tr>
						<c:forEach items="${ts}" var="ts">
						<tr>
							<td>${ts.id }</td>
							<td class="list_data_text">${ts.tname }</td>
							<td >${ts.tpassword }</td>
							<td ><a href="selectid.action?id=${ts.id }"  >修改</a></td>
							<td ><a href="delete.action?id=${ts.id}" >删除</a></td>
						</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		
</body>
</html>