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
import com.jluzh.service.ConItemService;

public class ConsumeItemServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
	    ConItemService conItem = new ConItemService();
	    HttpSession session=request.getSession();
		User user = (User) session.getAttribute("user");
		String uid = user.getUid();
		List<ConsumeItem> conItemList = conItem.getConItemList(uid);
		request.setAttribute("conitemlist", conItemList);
		request.getRequestDispatcher("/conitem.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}