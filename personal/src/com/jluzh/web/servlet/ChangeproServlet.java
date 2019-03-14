package com.jluzh.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangeproServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String remainstr = request.getParameter("remain");
		double remain=Double.parseDouble(remainstr);
		String incomestr = request.getParameter("income");
		double income=Double.parseDouble(incomestr);
		String pid=request.getParameter("pid");
		request.setAttribute("remain", remain);
		request.setAttribute("income", income);
		request.setAttribute("pid", pid);
		request.getRequestDispatcher("/changepro.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}