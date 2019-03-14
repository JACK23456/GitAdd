package com.jluzh.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jluzh.entity.User;
import com.jluzh.service.RegistService;
import com.jluzh.utils.CommonsUtils;

public class RegistinfoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name= request.getParameter("name");
		String password = request.getParameter("password");
		User user=new User();
		user.setUsername(name);
		user.setPassword(password);
		String uuid = CommonsUtils.getUUID();
		user.setUid(uuid);
		RegistService service = new RegistService();
		boolean regist = service.registInfo(user);
		if(regist){
			response.sendRedirect(request.getContextPath()+"/registsuccess.jsp");
		}else{
			response.sendRedirect(request.getContextPath()+"/registfail.jsp");
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}