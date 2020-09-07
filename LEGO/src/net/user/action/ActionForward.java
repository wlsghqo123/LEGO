package net.user.action;

public class ActionForward {
	//페이지 이동시 마다 이동정보를 저장하는 객체
	//(이동할 페이지 주소, 이동할 방식)
	
	private String path; // 이동할 페이지 주소
	private boolean isRedirect; //이동할 방식
	//true : sendRedirect 방식 이동
	//flase : forward 방식 이동
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
	
	
	
}
