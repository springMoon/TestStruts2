<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
	href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css"
	rel="stylesheet">
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>
<script
	src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</style>
</head>
<body>
	<div class ="container">
		<form action="LoginAction.action" method="post">
			User : <input type="text" name="username"><br> Password :<input
				type="password" name="password"> <br>
				Age: <input type="text" name="age"><br>
				book1: <input type="text" name="bookList[0]"><br>
				book2: <input type="text" name="bookList[1]"><br>
				book3: <input type="text" name="bookList[2]"><br>
				
				<input type="submit"
				value="submit">
		</form>
	</div>
</body>
</html>