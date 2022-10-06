package mavenjuit5demo.set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import mavenjuit5demo.set1.UnitConverters;

class UnitConvertersTest5DynamicTest {

	@TestFactory
	Collection dynamicTestWithCollection() {
		return Arrays.asList(
		   DynamicTest.dynamicTest("Meter to Centimeter Convertion",
				   ()->assertEquals(100, UnitConverters.convertMeterToCentimenter(1))),
		   DynamicTest.dynamicTest("Meter to Feet Convertion",
				   ()->assertEquals(3.3, UnitConverters.convertMeterToFeet(1))),
		   DynamicTest.dynamicTest("Meter to Kilometer Convertion", 
				   ()->assertEquals(1, UnitConverters.convertMeterTokilometer(1000)))
	       );
	}

}
