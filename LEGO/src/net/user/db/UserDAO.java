package net.user.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UserDAO {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql = "";
	
	//기본생성자 - UserDAO 객체 생성 시 자동으로 DB 연결하는 생성자
	public UserDAO(){
		try {
			getConn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//getConn() - DB 연결 메서드
	private Connection getConn() throws Exception{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/lego");
		con = ds.getConnection();
		System.out.println("DB 연결 & 드라이버 로드 성공 : "+con);
		return con;
	}
	
	//closeDB() - DB 연결 해제 메서드
	public void closeDB(){
		try {
			if(rs != null)rs.close();
			if(pstmt != null)pstmt.close();
			if(con != null)con.close();
			System.out.println("DB 연결 해제 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB 연결 해제 실패");
			e.printStackTrace();
		}
	}
	
	//addUser() - 회원 가입 메서드
	public void addUser(UserDTO udto){
		System.out.println("UserDAO - addUser() 호출");
			
			try{
			sql = "insert into user values(null,?,?,?,?,?,?,?,?,?,?,?,now())";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, udto.getUser_id());
			pstmt.setString(2, udto.getUser_pw());
			pstmt.setString(3, udto.getUser_name());
			pstmt.setString(4, udto.getUser_email());
			pstmt.setString(5, udto.getUser_phone());
			pstmt.setString(6, udto.getUser_birth());
			pstmt.setInt(7, udto.getPostcode());
			pstmt.setString(8,udto.getRoad_name_addr());
			pstmt.setString(9, udto.getA_lot_number_addr());
			pstmt.setString(10, udto.getDetail_addr());
			pstmt.setString(11, udto.getEtc_addr());
			pstmt.executeUpdate();
			
			System.out.println("회원 가입 성공!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			closeDB();
		}
		
	}
	//deleteUser() - 회원 탈퇴 메서드
	
	//modifyUser() - 회원 정보 수정 메서드
	
	//loginUser() - 로그인 메서드
	public int loginUser(String id,String pw){
		int result = -1; //1 : 로그인 성공 / 0 : 아이디 없음 / -1 : 비밀번호 틀림 
		System.out.println("dao id : "+id+" dao pw : "+pw);
		try {
			sql = "select user_pw from user where user_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				//패스워드 존재 : 아이디 있음
				if(pw.equals(rs.getString("user_pw"))){
					//비밀번호 일치
					result = 1;
				}else{
					//비밀번호 틀림
					result = -1;
				}
			}else{
				//패스워드 없음 : 아이디 없음
				result = 0;
			}
			System.out.println("아이디 비밀번호 체크(1:로그인성공/-1:비밀번호틀림/0:아이디없음) : "+result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	//getUser() - 회원정보 조회 메서드
	
	//getUserList() - 회원리스트 조회 메서드
}
