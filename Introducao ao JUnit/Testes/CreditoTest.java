import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreditoTest {
	
	Credito credito = new Credito();

	@Test
	void testConcede() {
		assertTrue(credito.concedeCredito(12, true, 5001));
	}
	
	@Test
	void testNaoConcedePorParcelasMaiorQue12() {
		assertFalse(credito.concedeCredito(13, true, 5001));
	}
	
	@Test
	void testNaoConcedePorParcelasMenorQue12MaiorQue0() {
		assertFalse(credito.concedeCredito(0, true, 5001));
	}
	
	@Test
	void testNaoConcedePorParcelasMenorQue0() {
		assertFalse(credito.concedeCredito(-2, true, 5001));
	}
	
	@Test
	void testNaoConcedePorNaoConfiavel() {
		assertFalse(credito.concedeCredito(5, false, 5001));
	}
	
	@Test
	void testNaoConcedePorSalario() {
		assertFalse(credito.concedeCredito(12, true, 2500));
	}
	
	@Test
	void testDefinirCredito2000() {
		assertEquals(20000, credito.definirCredito(12, true, 5001));
	}
	
	@Test
	void testDefinirCredito0() {
		assertEquals(0, credito.definirCredito(13, true, 5000));
	}

}
