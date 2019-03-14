package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jluzh.entity.Memo;
import com.jluzh.entity.User;
import com.jluzh.service.MemoInService;
import com.jluzh.utils.CommonsUtils;

public class MemoInServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String accident=request.getParameter("accident");
		String time=request.getParameter("time");
		String location=request.getParameter("location");
		String mid = CommonsUtils.getUUID();
		HttpSession session=request.getSession();
		User user = (User) session.getAttribute("user");
		String uid = user.getUid();
		Memo memo=new Memo();
		memo.setUid(uid);
		memo.setAccident(accident);
		memo.setTime(time);
		memo.setLocation(location);
		memo.setMid(mid);
		
		MemoInService servcie=new MemoInService();
		boolean check=servcie.insertMemo(memo);
		if(check){
			response.sendRedirect(request.getContextPath()+"/insertmemosuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/insertmemo.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}