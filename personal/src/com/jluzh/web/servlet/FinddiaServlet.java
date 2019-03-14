package com.jluzh.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.entity.Diary;
import com.jluzh.service.FindDiaService;

public class FinddiaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String dia = request.getParameter("finddia");
		FindDiaService service=new FindDiaService();
		List<Diary> list=service.finddia(dia);
		request.setAttribute("diarylist", list);
		request.getRequestDispatcher("/finddia.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}