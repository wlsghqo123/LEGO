<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>login</h1>
	<div>
		<form action="./UserLoginAction.us" method="post">
			<div>
				<label>아이디</label><br>
				<input type="text" name="user_id">
			</div>
			<div>
				<label>비밀번호</label><br>
				<input type="password" name="user_pw">
			</div>
			<div>
				<input type="submit" value="로그인">
			</div>
		</form>
	</div>
</body>
</html>