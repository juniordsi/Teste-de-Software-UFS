import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestTest {
	
	@Test
	void nula() {
		assertThrows(Exception.class, () -> {
			Largest.largest(null);
		});
	}
	
	@Test
	void listaVazia() {
		int[] list = {};
		assertThrows(Exception.class, () -> {
			Largest.largest(list);
		});
	}
	
	@Test
	void listaUnitaria() {
		int[] list = {0};
		assertEquals(0, Largest.largest(list));
	}
	
	
	@Test
	void listaComDoisElementos() {
		int[] list = {0,2};
		assertEquals(2,Largest.largest(list));
	}
	
	@Test
	void listaComNElmentosInteiros() {
		int[] list = {-1,0,2,1};
		assertEquals(2, Largest.largest(list));
	}
	
	@Test
	void listaComDuplicidadeDeElementos() {
		int[] list = {-1,2,1,1,2};
		assertEquals(2, Largest.largest(list));
	}

}
