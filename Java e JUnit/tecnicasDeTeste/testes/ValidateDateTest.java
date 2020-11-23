import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateDateTest {
	
	ValidateDate validate = new ValidateDate();
	
	@Test
	void DataInvalidaPorDia() {
		assertFalse(validate.validaData(31, 11, 2020));
	}
	
	@Test
	void DataInvalidaPorMes() {
		assertFalse(validate.validaData(01, 13, 2010));
	}
	
	@Test
	void DataInvalidaPorAno() {
		assertFalse(validate.validaData(31, 11, 1000));
	}
	
	@Test
	void FevereiroAnoNaoBissexto() {
		assertFalse(validate.validaData(29, 02, 2019));
	}
	
	@Test
	void PrimeiroDiaUtilDoAno() {
		assertTrue(validate.validaData(01, 01, 2019));
	}

}
