import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ValidateDateTest {
	
	ValidateDate validate = new ValidateDate();
	
	@Test
	@DisplayName("Data inv�lida por dia inv�lido")
	void DataInvalidaPorDia() {
		assertFalse(validate.validaData(31, 11, 2020));
	}
	
	@Test
	@DisplayName("Data inv�lida por m�s inv�lido")
	void DataInvalidaPorMes() {
		assertFalse(validate.validaData(01, 13, 2010));
	}
	
	@Test
	@DisplayName("Data inv�lida por ano inv�lido")
	void DataInvalidaPorAno() {
		assertFalse(validate.validaData(31, 11, 1000));
	}
	
	@Test
	@DisplayName("�ltimo dia de Fevereiro em ano n�o bissexto")
	void FevereiroAnoNaoBissexto() {
		assertFalse(validate.validaData(29, 02, 2019));
	}
	
	@Test
	@DisplayName("Primeiro dia �til do ano de 2019")
	void PrimeiroDiaUtilDoAno() {
		assertTrue(validate.validaData(01, 01, 2019));
	}

}
