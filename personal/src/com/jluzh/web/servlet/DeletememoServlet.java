package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.service.DelMemoService;

public class DeletememoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String memotime = request.getParameter("time");
		DelMemoService service=new DelMemoService();
		boolean isdelmemo=service.delmemo(memotime);
		if(isdelmemo){
		request.setAttribute("isdelmemo", isdelmemo);
		request.getRequestDispatcher("/memo").forward(request, response);
		}else{
			response.sendRedirect(request.getContextPath()+"/deletefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}