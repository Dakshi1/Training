package com.ps.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ps.entity.Product;

public final class HibernateUtil {

	
	private static SessionFactory factory;
	private HibernateUtil() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		
		if(factory!=null)
			return factory;
		Configuration cfg = new Configuration();// empty configuration object
		cfg.configure(); // reads and initializes itself from hibernate.cfg.xml
		
		cfg.addAnnotatedClass(Product.class);
		factory= cfg.buildSessionFactory();
		return factory;
	}
}
