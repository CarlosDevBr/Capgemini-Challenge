import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TesteAnagrama {

	@Test
	void test() {
		assertEquals(2, Anagrama.subString("ovo"));
	}
	
	@Test
	void test2() {
		assertEquals(3, Anagrama.subString("ifailuhkqq"));
	}
	
	@Test
	void test3() {
		assertEquals(0, Anagrama.subString("duq"));
	}
	
	@Test
	void test4() {
		assertEquals(2,Anagrama.subString("capgemini"));
	}

}
