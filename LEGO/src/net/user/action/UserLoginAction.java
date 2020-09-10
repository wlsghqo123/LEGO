package net.user.action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.user.db.UserDAO;

public class UserLoginAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("UserLoginAction - execute() 호출");
		
		//전달받은 정보 저장
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		System.out.println("id : "+id+"pw : "+pw);
		UserDAO udao = new UserDAO();
		int result = udao.loginUser(id,pw);
			//1 : login 
			//-1 : pw err - alert
			//0 : id err - alert
		
		if(result == 0){//비밀번호 오류
			//응답정보의 타입을 html 형식으로 응답
			response.setContentType("text/html; charset=UTF-8");
			
			//출력객체 생성
			PrintWriter out = response.getWriter();
			
			out.print("<script>");
			out.print("alert('비밀번호 오류입니다! 다시 시도하세요!')");
			out.print("history.back();");
			out.print("</script>");
			out.close();
			
			return null;
		}else if(result == -1){//아이디 없음
			//응답정보의 타입을 html 형식으로 응답
			response.setContentType("text/html; charset=UTF-8");
			
			//출력객체 생성
			PrintWriter out = response.getWriter();
			
			out.print("<script>");
			out.print("alert('존재하지 않는 아이디 입니다! 다시 시도하세요!')");
			out.print("history.back();");
			out.print("</script>");
			out.close();
			
			return null;
		}
			//로그인 성공 result == 1
			//ID 값 세션 객체에 저장
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			
			ActionForward forward = new ActionForward();
			forward.setPath("./Main.us");
			forward.setRedirect(true);
		
		return forward;
	}

}
