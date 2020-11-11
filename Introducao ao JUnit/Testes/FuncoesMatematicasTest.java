import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FuncoesMatematicasTest {

	@Test
	void testCalcularPotenciaBase0ExpoentePositivo() {
		assertEquals(0, FuncoesMatematicas.calcularPotencia(0, 10));
	}
	
	@Test
	void testCalcularPotenciaBase0ExpoenteNegativo() {
		assertThrows(ArithmeticException.class, () -> {
			FuncoesMatematicas.calcularPotencia(0, -10);
		});
	}
	
	@Test
	void testCalcularPotenciaBasePositivaExpoentePositivo() {
		assertEquals(25, FuncoesMatematicas.calcularPotencia(5, 2));	
	}
	
	@Test
	void testCalcularPotenciaBasePositivaExpoenteNegativo() {
		assertEquals(0.04, FuncoesMatematicas.calcularPotencia(5, -2), 0.1);
	}
	
	@Test
	void testCalcularPotenciaBaseNegativaExpoentePositivo() {
		assertEquals(25, FuncoesMatematicas.calcularPotencia(-5, 2));
	}
	
	@Test
	void testCalcularPotenciaBaseNegativaExpoenteNegativo() {
		assertEquals(-0.008, FuncoesMatematicas.calcularPotencia(-5, -2), 0.1);
	}
	
	@Test
	void testCalcularFatorialPositivo() {
		assertEquals(1, FuncoesMatematicas.calcularFatorial(0));
		assertEquals(1, FuncoesMatematicas.calcularFatorial(1));
		assertEquals(120, FuncoesMatematicas.calcularFatorial(5));
	}
	
	@Test
	void testCalcularFatorialNegativo() {
		assertEquals(1, FuncoesMatematicas.calcularFatorial(-1));
	}

}


