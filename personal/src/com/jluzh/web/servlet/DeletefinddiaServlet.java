package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.service.DelDiaService;

public class DeletefinddiaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String finddiastr = request.getParameter("finddia");
		String diatimestr = request.getParameter("time");
		String dianame = new String(diatimestr.getBytes("ISO8859-1"),"UTF-8");
		String finddia = new String(finddiastr.getBytes("ISO8859-1"),"UTF-8");
		DelDiaService service=new DelDiaService();
		boolean isdeldia=service.deldia(dianame);
		if(isdeldia){
		request.setAttribute("isdeldia", isdeldia);
		request.setAttribute("finddia", finddia);
		request.getRequestDispatcher("/finddia").forward(request, response);
		}else{
			response.sendRedirect(request.getContextPath()+"/deletefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}