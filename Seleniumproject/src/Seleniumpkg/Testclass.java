package Seleniumpkg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Testclass {
	@BeforeClass
	public static void aclass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public static void bclass() {
		System.out.println("After Class");
	}
	@After
	public void after() {
		System.out.println("After Annotation 3");
	}
	@Before
	public void before() {
		System.out.println("Before Annotation 1");
	}
	@Test
	public void dd() {
		System.out.println("Test annotation 2");
	}
	@Ignore
	@Test
	public void dd2() {
		System.out.println("Test annotation 2.0");
	}
	
	
}
