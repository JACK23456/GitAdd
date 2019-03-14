package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jluzh.entity.ConsumeItem;
import com.jluzh.entity.Property;
import com.jluzh.entity.User;
import com.jluzh.service.ChangecontoService;
import com.jluzh.service.ChangeremainService;
import com.jluzh.service.PropertyServcie;

public class ChangecontoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String time=request.getParameter("contime");
		String name=request.getParameter("conitem");
		String money=request.getParameter("conmoney");
		String cid=request.getParameter("cid");
		double mon = Double.parseDouble(money);
//		String time = new String(timestr.getBytes("ISO8859-1"),"UTF-8");
//		String name = new String(namestr.getBytes("ISO8859-1"),"UTF-8");
		ConsumeItem con=new ConsumeItem();
		con.setConsumename(name);
		con.setMoney(mon);
		con.setTime(time);
		con.setCid(cid);
		ChangecontoService service=new ChangecontoService();
		boolean check=service.changecon(con);
		
		HttpSession session=request.getSession();
		User user = (User) session.getAttribute("user");
		String uid = user.getUid();
		PropertyServcie servicepro =new PropertyServcie();
		Property propertyfirst=servicepro.getInAndRe(uid);
	    double remain=propertyfirst.getRemain();
	    String oldmoneystr = request.getParameter("oldmoney");
	    double oldmoney=Double.parseDouble(oldmoneystr);
	    double remoney=oldmoney+remain;
	    double newmon=remoney-mon;
	    ChangeremainService change=new ChangeremainService();
		change.changeremain(uid,newmon);
	    
		if(check){
			response.sendRedirect(request.getContextPath()+"/changeconsuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/changefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}