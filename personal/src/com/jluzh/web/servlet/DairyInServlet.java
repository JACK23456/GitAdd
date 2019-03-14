package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jluzh.entity.Diary;
import com.jluzh.entity.User;
import com.jluzh.service.DiaryInService;
import com.jluzh.utils.CommonsUtils;

public class DairyInServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String accident=request.getParameter("accident");
		String time=request.getParameter("time");
		String location=request.getParameter("location");
		String people=request.getParameter("people");
		String diaid = CommonsUtils.getUUID();
		HttpSession session=request.getSession();
		User user = (User) session.getAttribute("user");
		String uid = user.getUid();
		Diary diary=new Diary();
		diary.setAccident(accident);
		diary.setLocation(location);
		diary.setTime(time);
		diary.setUid(uid);
		diary.setPeople(people);
		diary.setDiaid(diaid);
		
		DiaryInService servcie=new DiaryInService();
		boolean check=servcie.insertDia(diary);
		if(check){
			response.sendRedirect(request.getContextPath()+"/insertdiasuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/insertdia.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}