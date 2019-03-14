package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.entity.User;
import com.jluzh.service.LoginService;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("Name");
		String password = request.getParameter("Password");
		User user=new User();
		LoginService service = new LoginService();
		user = service.login(name,password);
		boolean check=true;
		if(user==null) check=false;
		String json = "{\"isExist\":"+check+"}";
		response.getWriter().write(json);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}