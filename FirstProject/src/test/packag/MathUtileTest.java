package test.packag;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
class MathUtileTest {
	private final MathUtiles mathUtile=new MathUtiles();

	@ParameterizedTest
	@ValueSource(ints= {4,2,6,10})
	void testisEven() {
		assertTrue(mathUtile.isEven(5));
	}

}
