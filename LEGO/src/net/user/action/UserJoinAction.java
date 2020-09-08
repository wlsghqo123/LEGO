package net.user.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.user.db.UserDAO;
import net.user.db.UserDTO;

public class UserJoinAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		System.out.println("UserJoinAction - execute()  호출");
		
		// 한글 처리
		request.setCharacterEncoding("UTF-8");
		
		//전달받은 정보 저장
		//UserDTO 객체 생성
		UserDTO udto = new UserDTO();
		udto.setUser_id(request.getParameter("user_id"));
		udto.setUser_pw(request.getParameter("user_pw"));
		udto.setUser_name(request.getParameter("user_name"));
		udto.setUser_email(request.getParameter("user_email"));
		udto.setUser_birth(request.getParameter("user_birth"));
		udto.setUser_phone(request.getParameter("user_phone"));
		udto.setPostcode(Integer.parseInt(request.getParameter("postcode")));
		udto.setRoad_name_addr(request.getParameter("road_name_addr"));
		udto.setA_lot_number_addr(request.getParameter("a_lot_number_addr"));
		udto.setDetail_addr(request.getParameter("detail_addr"));
		udto.setEtc_addr(request.getParameter("etc_addr"));
		
		UserDAO udao = new UserDAO();
		udao.addUser(udto);
		
		ActionForward forward = new ActionForward();
		forward.setPath("./Main.us");
		forward.setRedirect(true);
		return forward;
	}

}
