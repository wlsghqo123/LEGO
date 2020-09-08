<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>join</h1>
	<div>
	<form action="./UserJoinAction.us" method="post">
		<div>
		<label>아이디</label><br>
		<input type="text" name="user_id" class="join_input">
		</div>
		<div>
		<label>비밀번호</label><br>
		<input type="password" name="user_pw" class="join_input">
		</div>
		<div>
		<label>이름</label><br>
		<input type="text" name="user_name" class="join_input">
		</div>
		<div>
		<label>생년월일</label><br>
		<input type="text" name="user_birth" class="join_input">
		</div>
		<div>
		<label>이메일</label><br>
		<input type="text" name="user_email" class="join_input">
		</div>
		<div>
		<label>휴대폰번호</label><br>
		<input type="text" name="user_phone" class="join_input">
		</div>
		<div>
		<label>우편번호</label><br>
		<input type="text" name="postcode" class="join_input">
		</div>
		<div>
		<label>도로명주소</label><br>
		<input type="text" name="road_name_addr" class="join_input">
		</div>
		<div>
		<label>지번주소</label><br>
		<input type="text" name="a_lot_number_addr" class="join_input">
		</div>
		<div>
		<label>상세주소</label><br>
		<input type="text" name="detail_addr" class="join_input">
		</div>
		<div>
		<label>기타주소</label><br>
		<input type="text" name="etc_addr" class="join_input">
		</div>
		<div>
		<input type="submit" value="가입하기">
		<input type="reset" value="다시작성">
		</div>
	</form>
	</div>
</body>
</html>