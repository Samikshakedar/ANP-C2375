package myjunitdemos.set1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import myjunitdemos.set.UnitConverter;
class UnitConvertersTest1 {
    @Test
	void convertMeterToCentimeterTestSuccess() {
		assertEquals(100, UnitConvertersTest1.convertMeterToCentimenter(1));
	}
    @Test
	void convertMeterToCentimeterTestFail(){
	     assertNotEquals(200, UnitConvertersTest1.(1));
	}
   
	@Test
    @Disabled
    void convertMeterTocentimeterTestDisabled() {
    }
    @Test
    @Disabled
    void converMeterToCentimeterTestDisplayName() {
    }
    @RepeatedTest(3)
    void convertMeterToCentimeterRepeatedTest() {
    	System.out.println("repeated test");
    }
  
}
