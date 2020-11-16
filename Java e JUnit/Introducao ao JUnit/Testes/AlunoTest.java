import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

class AlunoTest {

	@Test
	void testAdicionaNotaCorreto() {
		ArrayList<Double> testNotas = new ArrayList<Double>();
		testNotas.add(7.5);
		testNotas.add(8.5);
		testNotas.add(10.0);
		
		Aluno aluno = new Aluno();
		aluno.adicionaNota(7.5);
		aluno.adicionaNota(8.5);
		aluno.adicionaNota(10.0);
		
		assertEquals(testNotas, aluno.getNotas());
	}
	
	@Test
	void testAdicionaNotaErrado() {
		ArrayList<Double> testNotas = new ArrayList<Double>();
		testNotas.add(7.5);
		testNotas.add(8.5);
		testNotas.add(10.0);
		
		Aluno aluno = new Aluno();
		aluno.adicionaNota(7.5);
		aluno.adicionaNota(8.5);
		
		assertNotEquals(testNotas, aluno.getNotas());
	}
	
	@Test
	void testCalcularMediaInteira() {
		Aluno aluno = new Aluno();
		aluno.adicionaNota(8);
		aluno.adicionaNota(8);
		aluno.adicionaNota(5);
		
		assertEquals(7, aluno.calcularMedia());
	}
	
	@Test
	void testCalcularMediaNaoInteira() {
		Aluno aluno = new Aluno();
		aluno.adicionaNota(7.5);
		aluno.adicionaNota(8.5);
		aluno.adicionaNota(10);
		
		assertEquals(8.67, aluno.calcularMedia(), 0.1);
	}

	@Test
	void testAprovado() {
		Aluno aluno = new Aluno();
		aluno.adicionaNota(5);
		aluno.adicionaNota(5);
		aluno.setFrequencia(75);
		
		assertTrue(aluno.aprovado());
	}
	
	@Test
	void testReprovadoPorFrequencia() {
		Aluno aluno = new Aluno();
		aluno.adicionaNota(5);
		aluno.adicionaNota(5);
		aluno.setFrequencia(74.9);
		
		assertFalse(aluno.aprovado());
	}
	
	@Test
	void testReprovadoPorMedia() {
		Aluno aluno = new Aluno();
		aluno.adicionaNota(5);
		aluno.adicionaNota(3);
		aluno.setFrequencia(75);
		
		assertFalse(aluno.aprovado());
	}

}
