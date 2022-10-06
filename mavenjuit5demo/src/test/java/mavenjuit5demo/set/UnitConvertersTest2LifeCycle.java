package mavenjuit5demo.set;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitConverters1LifeCycle {
    @BeforeAll
	static void setUpBeforeClass() throws Exception {
	    System.out.println("before all annotation method");	
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all annotation method");
	}
	@BeforeEach
	void setUp() throws Exception {
	     System.out .println("Before Each annotation method");	
	}
	@AfterEach
	void tearDown() throws Exception{
	     System.out.println("AfterEach annotation method");	
	}
	@Test
	void test() {
		System.out.println("test method");
	}
    @Test
    void test1() {
    	System.out.println("test1 method");
    }
}
