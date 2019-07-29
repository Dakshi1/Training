package com.publicissapient.training.dao;

import java.util.Collection;

import com.publicissapient.training.entity.Product;

public class ArrayListProductDao implements ProductDao {

	//ArrayList
	@Override
	public Integer addNewProduct(Product product) throws DaoException {
		
		
		return null;
	}

	@Override
	public Integer getProduct(Integer productId) throws DaoException {
		
		
		return null;
	}

	@Override
	public void updateProduct(Product product) throws DaoException {
		

	}

	@Override
	public Integer deleteProduct(Product product) throws DaoException {
		
		
		return null;
	}

	@Override
	public Collection<Product> getAllProducts() throws DaoException {


		return null;
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

}
