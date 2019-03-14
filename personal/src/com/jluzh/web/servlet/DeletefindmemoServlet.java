package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.service.DelMemoService;

public class DeletefindmemoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String findmemostr = request.getParameter("findmemo");
		String memotimestr = request.getParameter("time");
		String memotime = new String(memotimestr.getBytes("ISO8859-1"),"UTF-8");
		String findmemo = new String(findmemostr.getBytes("ISO8859-1"),"UTF-8");
		DelMemoService service=new DelMemoService();
		boolean isdelmemo=service.delmemo(memotime);
		if(isdelmemo){
		request.setAttribute("isdelmemo", isdelmemo);
		request.setAttribute("findmemo", findmemo);
		request.getRequestDispatcher("/findmemo").forward(request, response);
		}else{
			response.sendRedirect(request.getContextPath()+"/deletefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}