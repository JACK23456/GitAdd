package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.entity.Memo;
import com.jluzh.service.ChangememotoService;

public class ChangememotoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String time=request.getParameter("time");
		String location=request.getParameter("location");
		String accident=request.getParameter("accident");
		String mid=request.getParameter("mid");
//		String time = new String(timestr.getBytes("ISO8859-1"),"UTF-8");
//		String location = new String(locationstr.getBytes("ISO8859-1"),"UTF-8");
//		String accident = new String(accidentstr.getBytes("ISO8859-1"),"UTF-8");
		Memo memo=new Memo();
		memo.setAccident(accident);
		memo.setLocation(location);
		memo.setTime(time);
		memo.setMid(mid);
		ChangememotoService service=new ChangememotoService();
		boolean check=service.changememo(memo);
		if(check){
			response.sendRedirect(request.getContextPath()+"/changememosuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/changefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}