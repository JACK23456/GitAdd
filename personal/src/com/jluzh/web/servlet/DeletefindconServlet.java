package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.service.DelConService;

public class DeletefindconServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String findconstr = request.getParameter("findcon");
		String addnamestr = request.getParameter("name");
		String conname = new String(addnamestr.getBytes("ISO8859-1"),"UTF-8");
		String findcon = new String(findconstr.getBytes("ISO8859-1"),"UTF-8");
		DelConService service=new DelConService();
		boolean isdelcon=service.delCon(conname);
		if(isdelcon){
		request.setAttribute("isdelcon", isdelcon);
		request.setAttribute("findcon", findcon);
		request.getRequestDispatcher("/findcon").forward(request, response);
		}else{
			response.sendRedirect(request.getContextPath()+"/deletefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}