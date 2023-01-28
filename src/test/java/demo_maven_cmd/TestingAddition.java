package demo_maven_cmd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit5.TestAddition;

public class TestingAddition {
	
	
	
	TestAddition obj;
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
	}
	@BeforeEach
	public void init() {
	 obj= new TestAddition();
	}
	@Test
	public void test() {
	
		//System.out.println(obj.testAddition(15,30));
		assertEquals(45, obj.testAddition(15,30));
	}
	
	
	@Test
	@DisplayName("Name Test case")
	public void display() {
		assumeTrue(true);
		System.out.print("Hello");
	}
	@Test
	@DisplayName("Substraction Check")
	public void subs() {
		
		assertEquals(10, obj.testSubstraction(20,10));
	}
	@Test
	@DisplayName("I am after all")
	public void ck() {
		assertNotNull(obj.check(-9));
	}
	
		
	}

