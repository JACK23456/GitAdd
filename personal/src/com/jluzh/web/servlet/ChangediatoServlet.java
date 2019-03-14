package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.entity.Diary;
import com.jluzh.service.ChangediatoService;

public class ChangediatoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String time=request.getParameter("time");
		String location=request.getParameter("location");
		String accident=request.getParameter("accident");
		String diaid=request.getParameter("diaid");
		String people=request.getParameter("people");
//		String time = new String(timestr.getBytes("ISO8859-1"),"UTF-8");
//		String location = new String(locationstr.getBytes("ISO8859-1"),"UTF-8");
//		String accident = new String(accidentstr.getBytes("ISO8859-1"),"UTF-8");
//		String people = new String(peoplestr.getBytes("ISO8859-1"),"UTF-8");
//		System.out.println(location);
//		System.out.println(accident);
//		System.out.println(people);
		Diary dia=new Diary();
		dia.setTime(time);
		dia.setLocation(location);
		dia.setAccident(accident);
		dia.setDiaid(diaid);
		dia.setPeople(people);
		ChangediatoService service=new ChangediatoService();
		boolean check=service.changedia(dia);
		if(check){
			response.sendRedirect(request.getContextPath()+"/changediasuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/changefail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}