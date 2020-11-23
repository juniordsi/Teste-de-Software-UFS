import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CreditoTest {
	
	Credito credito = new Credito();
	
	@Test
	@DisplayName("N� de parcelas menor que 12, confi�vel, sal�rio maior que R$ 5.000,00")
	void test1() {
		assertEquals(20000, credito.definirCredito(11, true, 5001));
	}
	
	@Test
	@DisplayName("N� de parcelas menor que 12, confi�vel, sal�rio menor ou igual a R$ 5.000,00")
	void test2() {
		assertEquals(0, credito.definirCredito(11, true, 4999));
	}
	
	@Test
	@DisplayName("N� de parcelas menor que 12, n�o confi�vel, sal�rio menor ou igual a R$ 5.000,00")
	void test3() {
		assertEquals(0, credito.definirCredito(11, false, 4999));
	}
	
	@Test
	@DisplayName("N� de parcelas menor que 12, n�o  confi�vel, sal�rio maior que R$ 5.000,00")
	void test4() {
		assertEquals(0, credito.definirCredito(11, false, 5000));
	}
	
	@Test
	@DisplayName("N� de parcelas maior que 12, confi�vel, sal�rio maior que R$ 5.000,00")
	void test5() {
		assertEquals(0, credito.definirCredito(13, true, 5001));
	}
	
	@Test
	@DisplayName("N� de parcelas maior que 12, n�o confi�vel, sal�rio maior que R$ 5.000,00")
	void test6() {
		assertEquals(0, credito.definirCredito(13, false, 5000));
	}
	
	@Test
	@DisplayName("N� de parcelas maior que 12, confi�vel, sal�rio menor ou igual a R$ 5.000,00")
	void test7() {
		assertEquals(0, credito.definirCredito(13, true, 4999));
	}

}
