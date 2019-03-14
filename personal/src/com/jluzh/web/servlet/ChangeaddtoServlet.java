package com.jluzh.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.entity.Address;
import com.jluzh.service.ChangeaddtoService;

public class ChangeaddtoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String city=request.getParameter("city");
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String remark=request.getParameter("remark");
		String location=request.getParameter("location");
		String aid=request.getParameter("aid");
//		String phone=new String(phonestr.getBytes("ISO8859-1"),"UTF-8");
//		String city = new String(citystr.getBytes("ISO8859-1"),"UTF-8");
//		String name = new String(namestr.getBytes("ISO8859-1"),"UTF-8");
//		String remark = new String(remarkstr.getBytes("ISO8859-1"),"UTF-8");
//		String location = new String(locationstr.getBytes("ISO8859-1"),"UTF-8");
		Address address=new Address();
		address.setAid(aid);
		address.setCity(city);
		address.setLocation(location);
		address.setName(name);
		address.setPhone(phone);
		address.setRemark(remark);
		ChangeaddtoService service=new ChangeaddtoService();
		boolean check=service.changeadd(address);
		if(check){
			response.sendRedirect(request.getContextPath()+"/changeaddsuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/changefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}