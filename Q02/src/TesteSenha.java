import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import utils.ValidadorSenhas;

class TesteSenha {

	@Test
	void test() {
		assertEquals(3, ValidadorSenhas.isStrongPassword("Y3a") );
	}
	
	@Test
	void test2() {
		assertEquals(5, ValidadorSenhas.isStrongPassword(" "));
	}
	
	@Test
	void test3() {
		assertEquals(3, ValidadorSenhas.isStrongPassword("teste"));
	}
	
	
	@Test
	void test4() {
		assertEquals(0, ValidadorSenhas.isStrongPassword("AB3$cd"));
	}

}
