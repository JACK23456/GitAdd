package com.jluzh.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangeconServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String namestr = request.getParameter("name");
		String money = request.getParameter("money");
		String cid=request.getParameter("cid");
		String timestr=request.getParameter("time");
		String time = new String(timestr.getBytes("ISO8859-1"),"UTF-8");
		String name = new String(namestr.getBytes("ISO8859-1"),"UTF-8");
		request.setAttribute("name", name);
		request.setAttribute("money", money);
		request.setAttribute("cid", cid);
		request.setAttribute("time", time);
		request.getRequestDispatcher("/changecon.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}