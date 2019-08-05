package com.ps.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.ps.entity.Product;
public class ArrayListProductDao implements ProductDao {

	List<Product> pList=new ArrayList<Product>();
	public ArrayListProductDao() {
		
		Product p=new Product("productName", "String quantityPerUnit", 5.0, 10);
		pList.add(p);
		p=new Product("productName", "String quantityPerUnit", 5.0, 10);pList.add(p);
		p=new Product("productName", "String quantityPerUnit", 5.0, 10);pList.add(p);
	}
	@Override
	public Collection<Product> getAllProducts() throws DaoException {

		
		
		return pList;
	}

	@Override
	public Collection<Product> getProductsNotInStock() throws DaoException {


		return null;
	}

	@Override
	public Collection<Product> getDiscontinuedProducts() throws DaoException {


		return null;
	}

	@Override
	public Collection<Product> getProductsByPriceRange(Double min, Double max) throws DaoException {


		return null;
	}

	@Override
	public Collection<Product> getProductsByName(String namePattern) throws DaoException {


		return null;
	}

	@Override
	public Integer count() {


		return null;
	}

	@Override
	public Integer addNewProduct(Product product) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Product product) throws DaoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer deleteProduct(Product product) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getProduct(Integer productId) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	
}
