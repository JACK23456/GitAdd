package com.jluzh.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jluzh.entity.ConsumeItem;
import com.jluzh.entity.User;
import com.jluzh.service.ChangeremainService;
import com.jluzh.service.FreshremainService;

public class RefreshremainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String remainstr = request.getParameter("remain");
		double remain=Double.parseDouble(remainstr);
		HttpSession session=request.getSession();
		User user = (User) session.getAttribute("user");
		String uid = user.getUid();
		FreshremainService service=new FreshremainService();
		List<ConsumeItem> list=service.freshremain(uid);
		double sum=0;
		for (ConsumeItem Item : list) {
			sum+=Item.getMoney();
		}
		remain-=sum;
		ChangeremainService change=new ChangeremainService();
		boolean check=change.changeremain(uid,remain);
		if(check){
			response.sendRedirect(request.getContextPath()+"/property");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}