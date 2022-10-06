package mavenjuit5demo.set;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UnitConvertersTest4Assumptions {

	@Test 
	void assumptionTest() {
		boolean serverStatus=true;
		assumeTrue(serverStatus);
		
	}
	@Test
	void assertionTest() {
		boolean serverStatus=true;
		assertTrue(serverStatus);
	}

}
