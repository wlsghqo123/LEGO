<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="./UserJoinAction.us" method="post">
		<label>아이디</label>
		<input type="text" name="user_id" class="join_input">
		
		<label>비밀번호</label>
		<input type="password" name="user_pw" class="join_iput">
		
		<label>이름</label>
		<input type="text" name="user_name" class="join_iput">
		
		<label>생년월일</label>
		<input type="text" name="user_birth" class="join_iput">
		
		<label>이메일</label>
		<input type="text" name="user_email" class="join_iput">
		
		<label>휴대폰번호</label>
		<input type="text" name="user_phone" class="join_iput">
		
		<label>우편번호</label>
		<input type="text" name="postcode" class="join_iput">
		
		<label>도로명주소</label>
		<input type="text" name="road_name_addr" class="join_iput">
		
		<label>지번주소</label>
		<input type="text" name="a_lot_number_addr" class="join_iput">
		
		<label>상세주소</label>
		<input type="text" name="detail_addr" class="join_iput">
		
		<label>기타주소</label>
		<input type="text" name="etc_addr" class="join_iput">
		
		<input type="submit" value="가입하기">
		<input type="reset" value="다시작성">
	</form>
</body>
</html>