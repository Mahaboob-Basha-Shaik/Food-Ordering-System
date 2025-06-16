package com.tap;

import java.io.IOException;

import com.tap.dao.UserDAO;
import com.tap.daoimpl.UserDAOImpl;
import com.tap.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/updateProfile")
public class UpdateProfileServlet extends HttpServlet {

	private UserDAO userDAO = new UserDAOImpl();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("loggedInUser") == null) {
			response.sendRedirect("login.jsp?message=Please+login+first");
			return;
		}

		User user = (User) session.getAttribute("loggedInUser");

		// Get updated values
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");

		// Update user object
		user.setName(name);
		user.setEmail(email);
		user.setPhone(phone);
		user.setAddress(address);

		// Save to DB
		userDAO.updateUser(user);

		// Update session
		session.setAttribute("loggedInUser", user);

		// Redirect back to profile
		response.sendRedirect("profile");
	}
}
