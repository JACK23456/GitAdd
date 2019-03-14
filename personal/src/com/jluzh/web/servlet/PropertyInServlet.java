package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jluzh.entity.Property;
import com.jluzh.entity.User;
import com.jluzh.service.PropertyInService;
import com.jluzh.utils.CommonsUtils;

public class PropertyInServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String incomestr = request.getParameter("income");
//		String remainstr = request.getParameter("remain");
		double income = Double.parseDouble(incomestr);
//		double remain = Double.parseDouble(remainstr);
		String pid = CommonsUtils.getUUID();
		HttpSession session=request.getSession();
		User user = (User) session.getAttribute("user");
		String uid = user.getUid();
		PropertyInService service=new PropertyInService();
		Property pro=new Property();
		pro.setIncome(income);
		pro.setRemain(income);
		pro.setUid(uid);
		pro.setPid(pid);
		boolean check=service.proin(pro);
		if(check){
			response.sendRedirect(request.getContextPath()+"/insertprosuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/insertpro.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}