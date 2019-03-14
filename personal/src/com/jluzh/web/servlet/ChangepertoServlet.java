package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.entity.User;
import com.jluzh.service.ChangepertoService;

public class ChangepertoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String uid=request.getParameter("uid");
		ChangepertoService service=new ChangepertoService();
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setUid(uid);
		boolean check = service.changeperto(user);
		if(check){
			response.sendRedirect(request.getContextPath()+"/changepersuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/changefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}