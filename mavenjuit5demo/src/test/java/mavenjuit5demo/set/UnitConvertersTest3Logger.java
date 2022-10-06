package mavenjuit5demo.set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitConvertersTest3Logger {

	static FileHandler handler;
	static Logger log=Logger.getLogger("Unit converter logger details");
         
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		handler=new FileHandler("testLogger.log",true);
		log.addHandler(handler);
		log.info("Before all anotations got executed");
	}
    @AfterAll
	static void tearDownAfterClass() throws Exception {
		log.info("After all annotation got executed");
	}
	@BeforeEach
	void setUp() throws Exception {
	     log.info("Before Each annotation got executed");	
	}
	@AfterEach
	void tearDown() throws Exception{
	     log.info("AfterEach annotation got executed");	
	}
	@Test
	void test() {
		log.info("test");
	}
    @Test
    void test1() {
    	log.info("test1");
    }
}
