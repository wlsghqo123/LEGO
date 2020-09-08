package net.user.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserFrontController extends HttpServlet{
	
	//doProcess() get 방식 / post 방식 둘다 한번에 처리
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("UserFrontController - doProcess()");
		
		// 1. 가상주소 계산
					//--------------------------------------------------------------------------------------------------------------------------------------//
						System.out.println("--페이지 주소 계산 시작--");
						
						String requestURI = request.getRequestURI();
						System.out.println("requestURI : "+requestURI);
						
						String contextPath = request.getContextPath();
						System.out.println("contextPath : "+contextPath);
						
						String command = requestURI.substring(contextPath.length());
						System.out.println("command : "+command );
						
						System.out.println("--페이지 주소 계산 완료--");
					//--------------------------------------------------------------------------------------------------------------------------------------//
						
				// 2. 계산된 주소를 사용해 페이지 형태 구분(View/Model)
					//--------------------------------------------------------------------------------------------------------------------------------------//
						System.out.println("--!페이지 구분(View/Model) 시작!--");
						
						//페이지 이동 정보 저장 객체
						Action action = null;
						ActionForward forward = null;
						
						//처리 페이지에 대한 정보 객체(인터페이스 - execute())
						
						if(command.equals("/Main.us")){
							//메인페이지
							//./main.jsp 으로 이동
							System.out.println("/Main.us 주소 요청");
							
							forward = new ActionForward();
							forward.setPath("./main.jsp");
							forward.setRedirect(false);
						}else if(command.equals("/UserJoin.us")){
							//회원가입페이지
							//./user/join.jsp 으로 이동
							System.out.println("/UserJoin.us 주소 요청");
							forward = new ActionForward();
							forward.setPath("./user/join.jsp");
							forward.setRedirect(false);
						}else if(command.equals("/UserJoinAction.us")){
							//회원가입 처리페이지(Model)
							System.out.println("/UserJoinAction.us 주소 요청");
							action = new UserJoinAction();
							try {
								forward = action.execute(request, response);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						System.out.println("--!페이지 구분(View/Model) 완료!--");
					//--------------------------------------------------------------------------------------------------------------------------------------//
				// 3.실제 페이지 이동 동작
					//--------------------------------------------------------------------------------------------------------------------------------------//
						System.out.println("-!!페이지 이동(Redirect(T)/Forward(F) 시작!!-");
						//페이지 이동 정보가 있을 때만 이동
						if(forward != null){
							if(forward.isRedirect()){
								//true(Redirect)
								System.out.println("sendRedirect() 이동 :"+forward.getPath());
								response.sendRedirect(forward.getPath());
							}else{
								//false(Forward)
								System.out.println("forward() 이동 :"+forward.getPath());
								RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
								dis.forward(request, response);
							}
						}
	}
	
	//get방식
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get방식");
		doProcess(request,response);
	}

	//post방식
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post방식");
		doProcess(request,response);
	}
	
}
