package com.fil.servelets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fil.dao.database.dao.SupplyDAO;
import com.fil.dao.database.daoImp.SupplyDAOImpl;
import com.fil.dao.database.entity.SupplyEntity;

/**
 * Servlet implementation class DAORunner
 */
@WebServlet("/DAORunner")
public class DAORunner extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DAORunner() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		SupplyDAO dao = new SupplyDAOImpl();
		SupplyEntity entity = new SupplyEntity(4, 12, 4, 2343, new Date(System.currentTimeMillis()));
		dao.addSupplyEntry(entity);
		response.getWriter().append(dao.getAllSupplyList().get(0).toString());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
