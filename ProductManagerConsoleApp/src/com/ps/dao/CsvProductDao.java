package com.ps.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.ps.entity.Product;
import com.publicissapient.training.programs.Person;

public class CsvProductDao implements ProductDao {

	private FileWriter file;
	private PrintWriter out;
	static int i;
	List<Product> pList = new ArrayList<>();

	public CsvProductDao() throws Exception {

//		file=new FileWriter("data.csv", true);
//		out =new PrintWriter(file);
//		out.println("SL No., Name, Email, City");
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.csv"));

		) {
			while (true) {
				try {
					Object obj = in.readObject();
					if (obj instanceof Product) {
						Product p = (Product) obj;
						i=Math.max(this.i, p.getProductId())+1;
						pList.add(p);
					}
				} catch (EOFException e) {
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Integer addNewProduct(Product product) throws DaoException {

		int id = i++;
		product.setProductId(id);
		pList.add(product);
		addToCSV(product);
		
		return id;
	}

	private void addToCSV(Product product) {
		// TODO Auto-generated method stub
		
		try (FileOutputStream file = new FileOutputStream("data.csv");
				ObjectOutputStream out = new ObjectOutputStream(file);) {
			for(int i=0;i<pList.size();i++) {
				System.out.println(pList.get(i));
				out.writeObject(pList.get(i));
			}
			//out.writeObject(product);
			System.out.println("Done!");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public Product getProduct(Integer productId) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Product product) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public Product deleteProduct(Integer productId) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Product> getAllProducts() throws DaoException {

		return pList;
	}

	@Override
	public Collection<Product> getProductsNotInStock() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Product> getDiscontinuedProducts() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Product> getProductsByPriceRange(Double min, Double max) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Product> getProductsByName(String namePattern) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer count() {
		// TODO Auto-generated method stub
		return null;
	}

}
