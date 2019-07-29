package com.ps.main;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Scanner;

import com.ps.dao.ArrayListProductDao;
import com.ps.dao.DaoException;
import com.ps.dao.DaoFactory;
import com.ps.dao.ProductDao;
import com.ps.entity.Product;
import com.ps.util.KeyboardUtil;

/**
 * 
 * @author daksuri
 * branched from vinod kumar
 */


public class Main {

	ProductDao dao;

	public Main() throws Exception {
		try {
			dao = DaoFactory.getProductDao("csv");
		} catch (DaoException e) {
			System.out.println("Something went wrong!!");
			System.out.println("This stack trace may help you understand the error:");
			System.out.println("------------------------------------------------------------------");
			e.printStackTrace(System.out);
			System.out.println("------------------------------------------------------------------");
			System.out.println("BYE!!!");
			System.exit(0);
		}
	}

	private int menu() {
		try {
			System.out.println("---------------------------------");
			System.out.println("Product Manager App - v1.0");
			System.out.println("---------------------------------");
			System.out.println("1. List all products");
			System.out.println("2. Search a product by id");
			System.out.println("3. Search products by name");
			System.out.println("4. Search products by price range");
			System.out.println("5. List out-of-stock products");
			System.out.println("6. List products that are no longer sold");
			System.out.println("7. Add a new product");
			System.out.println("8. Edit product details");
			System.out.println("0. Exit");

			int choice = KeyboardUtil.getInt("Enter your choice: ");
			return choice;
		} catch (Exception e) {
			return -1;
		}
	}

	private void start() throws DaoException {

		THE_LOOP: while (true) {
			int choice = menu();
			switch (choice) {
			case 1:
				displayAllProducts();
				break;
			case 2:
				searchAndDisplayProductById();
				break;
			case 3:
				searchAndDisplayProductByName();
				break;
			case 4:
				searchAndDisplayProductByPriceRange();
				break;
			case 5:
				displayProductsNotInStock();
				break;
			case 6:
				displayDiscontinuedProducts();
				break;
			case 7:
				acceptAndAddProductDetails();
				break;
			case 8:
				searchAndEditProductDetails();
				break;
			case 0:
				System.out.println("Thank you for usin the Product Manager App.");
				break THE_LOOP;
			case -1:
				System.out.println("Invalid value for choice. Must be numeric.");
			default:
				System.out.println("Invalid choice. Please enter a number between 0 and 8.");
			}
		}
	}

	private void searchAndEditProductDetails() {
		System.out.println("searchAndEditProductDetails not implemented yet!");
	}

	private void acceptAndAddProductDetails() throws DaoException {
		//System.out.println("acceptAndAddProductDetails not implemented yet!");
		//new Product("Coffee", "105", 2.00, 102)
		Scanner sc=new Scanner(System.in);
		String pName=sc.nextLine();
		String quantityPerUnit=sc.nextLine();
		Double unitPrice=sc.nextDouble();
		Integer unitsInStock=sc.nextInt();
		dao.addNewProduct(new Product(pName, quantityPerUnit, unitPrice, unitsInStock));
		
	}

	private void displayDiscontinuedProducts() {
		System.out.println("displayDiscontinuedProducts not implemented yet!");
	}

	private void displayProductsNotInStock() {
		System.out.println("displayProductsNotInStock not implemented yet!");
	}

	private void searchAndDisplayProductByPriceRange() {
		System.out.println("searchAndDisplayProductByPriceRange not implemented yet!");
	}

	private void searchAndDisplayProductByName() {
		System.out.println("searchAndDisplayProductByName not implemented yet!");
	}

	private void searchAndDisplayProductById() throws DaoException {
		//System.out.println("searchAndDisplayProductById not implemented yet!");
		int id=KeyboardUtil.getInt("Enter id ");
		System.out.println(dao.getProduct(id));
	}

	private void displayAllProducts() throws DaoException {
		
		ArrayList<Product> arrayList=(ArrayList<Product>) dao.getAllProducts();
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().start();
	}
}
