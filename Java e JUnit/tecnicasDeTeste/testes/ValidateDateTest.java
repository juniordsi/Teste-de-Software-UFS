import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidateDateTest {
	
	ValidateDate validate = new ValidateDate();
	
	@Test
	@DisplayName("Data inválida por dia inválido")
	void DataInvalidaPorDia() {
		assertFalse(validate.validaData(31, 11, 2020));
	}
	
	@Test
	@DisplayName("Data inválida por mês inválido")
	void DataInvalidaPorMes() {
		assertFalse(validate.validaData(01, 13, 2010));
	}
	
	@Test
	@DisplayName("Data inválida por ano inválido")
	void DataInvalidaPorAno() {
		assertFalse(validate.validaData(31, 11, 1000));
	}
	
	@Test
	@DisplayName("Último dia de Fevereiro em ano não bissexto")
	void FevereiroAnoNaoBissexto() {
		assertFalse(validate.validaData(29, 02, 2019));
	}
	
	@Test
	@DisplayName("Primeiro dia útil do ano de 2019")
	void PrimeiroDiaUtilDoAno() {
		assertTrue(validate.validaData(01, 01, 2019));
	}

}
