import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreditoTest {
	
	Credito credito = new Credito();

	@Test
	void testConcede() {
		//assertTrue(credito.concedeCredito(12, true, 2500));
		//assertFalse(credito.concedeCredito(12, true, 5001));
		assertFalse(credito.concedeCredito(12, true, 2500));
		assertTrue(credito.concedeCredito(12, true, 5001));
		
		//assertTrue(credito.concedeCredito(13, true, 2500));
		assertFalse(credito.concedeCredito(13, true, 5001));
	}
	
	@Test
	void testNaoConcedePorParcelas() {
		
	}
	
	@Test
	void testConcedeNaoConfiavel() {
		
	}
	
	@Test
	void testDefinirCredito() {
		// assertEquals(20000, credito.definirCredito(12, true, 2500));
		//assertEquals(20000, credito.definirCredito(13, true, 5000));
		assertEquals(0, credito.definirCredito(13, true, 5000));
		assertEquals(20000, credito.definirCredito(12, true, 5001));
	}

}
