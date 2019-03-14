package com.jluzh.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangeaddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String namestr = request.getParameter("name");
		String phonestr = request.getParameter("phone");
		String locationstr = request.getParameter("location");
		String citystr = request.getParameter("city");
		String remarkstr = request.getParameter("remark");
		String aid=request.getParameter("aid");
		String phone=new String(phonestr.getBytes("ISO8859-1"),"UTF-8");
		String name=new String(namestr.getBytes("ISO8859-1"),"UTF-8");
		String location=new String(locationstr.getBytes("ISO8859-1"),"UTF-8");
		String city=new String(citystr.getBytes("ISO8859-1"),"UTF-8");
		String remark=new String(remarkstr.getBytes("ISO8859-1"),"UTF-8");
		request.setAttribute("name", name);
		request.setAttribute("phone", phone);
		request.setAttribute("location", location);
		request.setAttribute("city", city);
		request.setAttribute("remark", remark);
		request.setAttribute("aid", aid);
		request.getRequestDispatcher("/changeadd.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}