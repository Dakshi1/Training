package com.publicissapient.tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.publicissapient.assignments.Assignment2;


public class Test1 {

	@BeforeClass
	public static void init() {
		System.out.println("init() called");
	}
	
	@AfterClass
	public static void destroy() {
		System.out.println("destroy() called");
	}
	
	@Before
	public void setup() {
		System.out.println("setup() called");
	}
	
	@After
	public void tearDown() {
		System.out.println("tearDown() called\n");
	}
	@Test
	public void UTC_01_01() {
		System.out.println("UTC_01_01() called");
		boolean actual = Assignment2.isValidDate(2018, 12, 07);
		boolean expected = true;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void UTC_01_02() {
		System.out.println("UTC_01_01() called");
		boolean actual = Assignment2.isValidDate(2018, 13, 07);
		boolean expected = false;
		Assert.assertEquals(expected, actual);
	}
}
