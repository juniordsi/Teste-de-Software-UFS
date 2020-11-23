import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LargestTest {
	
	@Test
	@DisplayName("Entrada nula")
	void entradaNula() {
		assertThrows(Exception.class, () -> {
			Largest.largest(null);
		});
	}
	
	@Test
	@DisplayName("Lista vazia")
	void listaVazia() {
		int[] list = {};
		assertNotEquals(0 ,Largest.largest(list));
	}
	
	@Test
	@DisplayName("Lista unitária")
	void listaUnitaria() {
		int[] list = {1};
		assertEquals(1, Largest.largest(list));
	}
	
	@Test
	@DisplayName("Lista ordenada - Dois números inteiros")
	void listaComDoisElementosOrdenados() {
		int[] list = {0,1};
		assertEquals(1,Largest.largest(list));
	}
	
	@Test
	@DisplayName("Lista ordenada - N números inteiros")
	void listaComNElementosOrdenados() {
		int[] list = {0,1,2,3};
		assertEquals(1,Largest.largest(list));
	}
	
	@Test
	@DisplayName("Lista não ordenada - Dois números inteiros")
	void listaComDoisElementosNaoOrdenados() {
		int[] list = {1,0};
		assertEquals(1,Largest.largest(list));
	}

	@Test
	@DisplayName("Lista com duplicidade de elementos")
	void listaComDuplicidadeDeElementos() {
		int[] list = {-1,2,1,1,2};
		assertEquals(2, Largest.largest(list));
	}

}
