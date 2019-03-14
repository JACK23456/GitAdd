package com.jluzh.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.entity.Property;
import com.jluzh.service.ChangeprotoService;

public class ChangeprotoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String incomestr =request.getParameter("income");
		String remoneystr = request.getParameter("remoney");
		String inmoneystr = request.getParameter("inmoney");
		String pid = request.getParameter("pid");
		double changein=Double.parseDouble(incomestr);
		double incomeone=Double.parseDouble(inmoneystr);
		double remainone=Double.parseDouble(remoneystr);
		double income=incomeone+changein;
		double remain=remainone+changein;
		
		Property pro=new Property();
		pro.setIncome(income);
		pro.setPid(pid);
		pro.setRemain(remain);
		ChangeprotoService service=new ChangeprotoService();
		boolean check=service.changeproto(pro);
		if(check){
			response.sendRedirect(request.getContextPath()+"/changeprosuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/changefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}