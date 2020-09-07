package net.user.db;

import java.util.Date;

public class UserDTO {
	private int user_no;									//회원번호 / pk
	private String user_id;							//회원아이디
	private String user_pw;							//회원패스워드 
	private String user_name;						//회원이름
	private String user_birth;						//회원생년월일
	private String user_email;						//회원이메일
	private String user_phone;						//회원휴대폰번호
	private int postcode;								//우편번호
	private String road_name_addr;				//도로명주소
	private String a_lot_number_addr;		//지번주소
	private String detail_addr;						//상세주소
	private String etc_addr;							//기타주소
	private Date join_date;							//가입날짜
	
	//setter & getter
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(String user_birth) {
		this.user_birth = user_birth;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	public String getRoad_name_addr() {
		return road_name_addr;
	}
	public void setRoad_name_addr(String road_name_addr) {
		this.road_name_addr = road_name_addr;
	}
	public String getA_lot_number_addr() {
		return a_lot_number_addr;
	}
	public void setA_lot_number_addr(String a_lot_number_addr) {
		this.a_lot_number_addr = a_lot_number_addr;
	}
	public String getDetail_addr() {
		return detail_addr;
	}
	public void setDetail_addr(String detail_addr) {
		this.detail_addr = detail_addr;
	}
	public String getEtc_addr() {
		return etc_addr;
	}
	public void setEtc_addr(String etc_addr) {
		this.etc_addr = etc_addr;
	}
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	//toString
	@Override
	public String toString() {
		return "UserDTO [user_no=" + user_no + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_name="
				+ user_name + ", user_birth=" + user_birth + ", user_email=" + user_email + ", user_phone=" + user_phone
				+ ", postcode=" + postcode + ", road_name_addr=" + road_name_addr + ", a_lot_number_addr="
				+ a_lot_number_addr + ", detail_addr=" + detail_addr + ", etc_addr=" + etc_addr + ", join_date="
				+ join_date + "]";
	}
	
	
}
