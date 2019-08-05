package com.ps.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ps.entity.Product;

public final class HibernateUtil {

	private HibernateUtil() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		
		
		Configuration cfg = new Configuration();// empty configuration object
		cfg.configure(); // reads and initializes itself from hibernate.cfg.xml
		
		cfg.addAnnotatedClass(Product.class);
		return cfg.buildSessionFactory();
	}
}
