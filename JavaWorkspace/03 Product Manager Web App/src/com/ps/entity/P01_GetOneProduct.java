package com.ps.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ps.util.HibernateUtil;

public class P01_GetOneProduct {

	public static void main(String[] args) {
		
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession(); // creates a new instance of session
		
		Product p1=session.get(Product.class, 1);
		System.out.println("hello ");
		session.close();
		factory.close();
		System.out.println(p1);
	}
}
