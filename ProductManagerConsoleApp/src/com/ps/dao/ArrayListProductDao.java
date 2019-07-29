package com.ps.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.ps.entity.Product;

public class ArrayListProductDao implements ProductDao {

	private List<Product> product_list=new ArrayList<>();
	static int id;
	Product p;
	
	public ArrayListProductDao() throws DaoException {
		// TODO Auto-generated constructor stub
		
		addNewProduct(new Product("Tea", "15", 20.00, 12));
		addNewProduct(new Product("Coffee", "105", 2.00, 102));
		addNewProduct(new Product("Juice", "155", 27.00, 120));
		
	}
	@Override
	public Integer addNewProduct(Product product) throws DaoException {
		// TODO Auto-generated method stub
		if(product.getProductName().contentEquals(""))
			throw new DaoException("Product name cannot be empty");
		int id=this.id++;
		product.setProductId(id);
		product_list.add(product);
		return id;
	}

	@Override
	public Product getProduct(Integer productId) throws DaoException {
		// TODO Auto-generated method stub
		
		p=new Product();
		p.setProductId(productId);
		int index=Collections.binarySearch(product_list, p, (p1, p2) ->{
			
			return p1.getProductId()-p2.getProductId();
		});
		return product_list.get(index);
	}

	@Override
	public void updateProduct(Product product) throws DaoException {
		// TODO Auto-generated method stub
		p=new Product();
		p.setProductId(product.getProductId());
		int index=Collections.binarySearch(product_list, p, (p1, p2) ->{
			
			return p1.getProductId()-p2.getProductId();
		});
	}

	@Override
	public Product deleteProduct(Integer productId) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Product> getAllProducts() throws DaoException {
		// TODO Auto-generated method stub
		
		return product_list;
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
