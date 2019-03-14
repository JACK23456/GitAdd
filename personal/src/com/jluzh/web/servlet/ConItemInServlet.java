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
import com.jluzh.service.ChangeremainService;
import com.jluzh.service.ConItemInService;
import com.jluzh.service.PropertyServcie;
import com.jluzh.utils.CommonsUtils;

public class ConItemInServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String moneystr=request.getParameter("conmoney");
		double moneydou=Double.parseDouble(moneystr);
		String time=request.getParameter("contime");
		String consumename=request.getParameter("conitem");
		String cid = CommonsUtils.getUUID();
		HttpSession session=request.getSession();
		User user = (User) session.getAttribute("user");
		String uid = user.getUid();
		ConsumeItem conItem=new ConsumeItem();
		conItem.setUid(uid);
		conItem.setMoney(moneydou);
		conItem.setTime(time);
		conItem.setConsumename(consumename);
		conItem.setCid(cid);
		
		ConItemInService servciecon=new ConItemInService();
		boolean check=servciecon.insertConItem(conItem);
		
		boolean checkpro=true;
		PropertyServcie servicepro =new PropertyServcie();
		Property propertyfirst=servicepro.getInAndRe(uid);
		if(propertyfirst==null){
			checkpro=false;
			response.sendRedirect(request.getContextPath()+"/insertconerror.jsp");
			return;
		}
	    double remain=propertyfirst.getRemain();
	    remain-=moneydou;
	    
		ChangeremainService change=new ChangeremainService();
		change.changeremain(uid,remain);
		if(check){
			response.sendRedirect(request.getContextPath()+"/insertconsuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/insertconitem.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}