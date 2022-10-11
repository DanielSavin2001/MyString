import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringTest {

	@Test
	void test() {
		char[] hello = {'h','e','l','l','o'};
		String myString = new String(hello);
		assertArrayEquals(hello,myString.toCharArray());
		assertEquals(5,myString.length());
		assertEquals('h',myString.charAt(0));
		
		char[] repObject = myString.toCharArray();
		repObject[0] = 'b';
		assertEquals('h', myString.charAt(0));
		
		hello[0] = 'x';
		assertEquals('h', myString.charAt(0));
	}

}
