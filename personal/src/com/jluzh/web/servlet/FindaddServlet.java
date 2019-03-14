package com.jluzh.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.entity.Address;
import com.jluzh.service.FindAddService;

public class FindaddServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String addstr = request.getParameter("findadd");
		String add = new String(addstr.getBytes("ISO8859-1"),"UTF-8");
		FindAddService service=new FindAddService();
		List<Address> list=service.findAdd(add);
		request.setAttribute("addresslist", list);
		request.setAttribute("findadd", add);
		request.getRequestDispatcher("/findadd.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}