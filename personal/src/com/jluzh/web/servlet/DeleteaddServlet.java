package com.jluzh.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.service.AddDelService;

public class DeleteaddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String addnamestr = request.getParameter("name");
		String addname = new String(addnamestr.getBytes("ISO8859-1"),"UTF-8");
		AddDelService service=new AddDelService();
		boolean isdeladd=service.deladd(addname);
		if(isdeladd){
		request.setAttribute("isdeladd", isdeladd);
		request.getRequestDispatcher("/address").forward(request, response);
		}else{
			response.sendRedirect(request.getContextPath()+"/deletefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}