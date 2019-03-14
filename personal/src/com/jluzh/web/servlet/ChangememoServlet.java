package com.jluzh.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangememoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String timestr = request.getParameter("time");
		String locationstr = request.getParameter("location");
		String accidentstr = request.getParameter("accident");
		String mid=request.getParameter("mid");
		String time = new String(timestr.getBytes("ISO8859-1"),"UTF-8");
		String location = new String(locationstr.getBytes("ISO8859-1"),"UTF-8");
		String accident = new String(accidentstr.getBytes("ISO8859-1"),"UTF-8");
		request.setAttribute("time", time);
		request.setAttribute("location", location);
		request.setAttribute("accident", accident);
		request.setAttribute("mid", mid);
		request.getRequestDispatcher("/changememo.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}