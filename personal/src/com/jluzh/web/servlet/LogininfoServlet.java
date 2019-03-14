package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jluzh.entity.User;
import com.jluzh.service.LoginService;

public class LogininfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name= request.getParameter("Name");
		String password = request.getParameter("Password");
		LoginService service = new LoginService();
		User user = service.login(name,password);

		HttpSession session=request.getSession();
		boolean check=true;
		if(user==null) check=false;
		if(check){
			String uid = service.getUidbyName(name);
			user.setUid(uid);
			session.setAttribute("user", user);
			response.sendRedirect(request.getContextPath()+"/home.jsp");
		}else{
			request.setAttribute("logincheck",check);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}