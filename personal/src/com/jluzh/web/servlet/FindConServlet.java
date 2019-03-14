package com.jluzh.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.entity.ConsumeItem;
import com.jluzh.service.FindConService;

public class FindConServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String constr = request.getParameter("findcon");
		String con = new String(constr.getBytes("ISO8859-1"),"UTF-8");
		FindConService service=new FindConService();
		List<ConsumeItem> list=service.findCon(con);
		request.setAttribute("findcon", con);
		request.setAttribute("conitemlist", list);
		request.getRequestDispatcher("/findcon.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}