package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    void testStringForDifferentDelimiter() {
    	StringCalculator stringCalculator = new StringCalculator();
    	int result = stringCalculator.add("1,2, ,\n,3,1;7:8|7/6//6");
		assertTrue(result == 41);
		
	}
    @Test
	void testStringForNegativeNubmer() {
    	StringCalculator stringCalculator = new StringCalculator();
		int result = stringCalculator.add("1,2\n,3,-5,7");
		assertTrue(result == 0);
		
	}
    @Test
	public final void IfOneOrMoreNumbersAreGreaterThan1000ThenItnotInSum() {
    	StringCalculator stringCalculator = new StringCalculator();
	    int result = stringCalculator.add("5,1001,7,1278");
	    assertTrue(result == 12);
	}
}
