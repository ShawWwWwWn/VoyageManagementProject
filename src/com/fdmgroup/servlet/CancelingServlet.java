package com.fdmgroup.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.fdmgroup.controller.AuthenticationController;
import com.fdmgroup.dao.PackageDaoJpaImpl;
import com.fdmgroup.model.Package;
import com.fdmgroup.model.User;

/**
 * Servlet implementation class CancelingServlet
 */
@WebServlet("/cancel")
public class CancelingServlet extends HttpServlet {
	
	private static Logger log = Logger.getLogger(CancelingServlet.class);
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancelingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PackageDaoJpaImpl packDao = new PackageDaoJpaImpl();
		
		HttpSession session = request.getSession();
		
		User user = (User) session.getAttribute("user");
		
		List<Package> bookedPackageList = user.getpList();
		
		int pID = Integer.parseInt(request.getParameter("pID"));
		
		Package foundPackage = packDao.findPackageById(pID);		
		
			packDao.pCancel(pID);;
			
			user.getpList().remove(foundPackage);
			session.setAttribute("user", user);
			
			request.setAttribute("finishmessage", "You have cancelled your booking! ");
			request.getRequestDispatcher("WEB-INF/views/PostBookingViewer.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
