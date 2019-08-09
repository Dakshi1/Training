package com.ps.web;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ps.dao.DaoException;
import com.ps.dao.DaoFactory;
import com.ps.dao.ProductDao;
import com.ps.entity.Product;

@WebServlet("/add-product")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			// Responsibilities of a controller servlet
			// 1. Read the input from the request (if any)
			Product p=new Product();
			String input = request.getParameter("productName");
			p.setProductName(input);
			input = request.getParameter("quantityPerUnit");
			p.setQuantityPerUnit(input);
			input = request.getParameter("unitPrice");
			Double d=Double.valueOf(input);
			p.setUnitPrice(d);
			input = request.getParameter("units_in_stock");
			int i=Integer.parseInt(input);
			p.setUnitsInStock(i);
			input = request.getParameter("units_on_order");
			i=Integer.parseInt(input);
			p.setUnitsOnOrder(i);
			input = request.getParameter("reorderLevel");
			i=Integer.parseInt(input);
			p.setReorderLevel(i);
			input = request.getParameter("discontinued");
			Boolean b=Boolean.valueOf(input);
			p.setDiscontinued(false);
			
			
			// 2. Get the model data from service/dao
			ProductDao dao = DaoFactory.getProductDao("hibernate");
			int x=dao.addNewProduct(p);
			
		} catch (DaoException | NumberFormatException e) {
			// report the error to the user in a user-friendly manner
			throw new ServletException(e);
		}
	}

}
