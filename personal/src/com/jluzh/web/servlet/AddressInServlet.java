package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jluzh.entity.Address;
import com.jluzh.entity.User;
import com.jluzh.service.AddressInService;
import com.jluzh.utils.CommonsUtils;

public class AddressInServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String aid=CommonsUtils.getUUID();
		String city=request.getParameter("city");
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String remark=request.getParameter("remark");
		String location=request.getParameter("location");
		HttpSession session=request.getSession();
		User user = (User) session.getAttribute("user");
		String uid = user.getUid();
		Address address=new Address();
		address.setCity(city);
		address.setLocation(location);
		address.setName(name);
		address.setPhone(phone);
		address.setRemark(remark);
		address.setUid(uid);
		address.setAid(aid);
	
		AddressInService servcie=new AddressInService();
		boolean check=servcie.insertAdd(address);
		if(check){
			response.sendRedirect(request.getContextPath()+"/insertaddsuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/insertadd.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}