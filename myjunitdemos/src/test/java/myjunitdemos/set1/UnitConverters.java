package myjunitdemos.set1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import myjunitdemos.set.UnitConverter;
class UnitConverters {
    @Test
	void convertMeterToCentimeterTestSuccess() {
		assertEquals(100, UnitConverter.convertMeterToCentimenter(1));
	}
    @Test
	void convertMeterToCentimeterTestFail(){
	     assertNotEquals(200, UnitConverter.convertMeterToCentimenter(1));
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
