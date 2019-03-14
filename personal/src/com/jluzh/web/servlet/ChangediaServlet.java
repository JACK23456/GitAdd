package com.jluzh.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangediaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String timestr = request.getParameter("time");
		String locationstr = request.getParameter("location");
		String accidentstr = request.getParameter("accident");
		String peoplestr = request.getParameter("people");
		String diaid=request.getParameter("diaid");
		String accident = new String(accidentstr.getBytes("ISO8859-1"),"UTF-8");
		String location = new String(locationstr.getBytes("ISO8859-1"),"UTF-8");
		String people = new String(peoplestr.getBytes("ISO8859-1"),"UTF-8");
		String time = new String(timestr.getBytes("ISO8859-1"),"UTF-8");
		request.setAttribute("time", time);
		request.setAttribute("location", location);
		request.setAttribute("accident", accident);
		request.setAttribute("people", people);
		request.setAttribute("diaid", diaid);
		request.getRequestDispatcher("/changedia.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}