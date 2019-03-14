package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jluzh.entity.Property;
import com.jluzh.entity.User;
import com.jluzh.service.ChangeremainService;
import com.jluzh.service.DelConService;
import com.jluzh.service.PropertyServcie;

public class DeleteConServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String conname = new String(name.getBytes("ISO8859-1"),"UTF-8");
		String monstr = request.getParameter("money");
		Double mon=Double.parseDouble(monstr);
		DelConService service=new DelConService();
		boolean isdelcon=service.delCon(conname);
		
		if(isdelcon){
		HttpSession session=request.getSession();
		User user = (User) session.getAttribute("user");
		String uid = user.getUid();
		PropertyServcie servicepro =new PropertyServcie();
		Property propertyfirst=servicepro.getInAndRe(uid);
	    double remain=propertyfirst.getRemain();
	    double income=propertyfirst.getIncome();
	    Double newremain=remain+mon;
	    if(income<newremain) {
	    	response.sendRedirect(request.getContextPath()+"/consumeItem");
	    	return;
	    }
	    ChangeremainService change=new ChangeremainService();
		change.changeremain(uid,newremain);
		
		request.setAttribute("isdelcon", isdelcon);
		request.getRequestDispatcher("/consumeItem").forward(request, response);
		}else{
			response.sendRedirect(request.getContextPath()+"/deletefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}