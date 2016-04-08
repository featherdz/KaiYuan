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
					<form action="insert.action" method="post">
					<label>用&nbsp;&nbsp;户：</label>
					<input type="text" name="tname"  />
					<label>密&nbsp;&nbsp;码：</label>
					<input type="password" name="tpassword" />
					<input type="submit" class="login-sub" value="新增" />
					</form>
				</div>
			</div>
		
</body>
</html>