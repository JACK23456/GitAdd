package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangeperServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uid = request.getParameter("uid");
		String usernamestr = request.getParameter("username");
		String username = new String(usernamestr.getBytes("ISO8859-1"),"UTF-8");
		request.setAttribute("uid", uid);
		request.setAttribute("username", username);
		request.getRequestDispatcher("/changeper.jsp").forward(request, response);;
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}