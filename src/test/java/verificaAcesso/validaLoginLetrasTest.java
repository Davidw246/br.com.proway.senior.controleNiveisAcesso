package verificaAcesso;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class validaLoginLetrasTest {

	@Test
	public void testValidaLoginLetras() {
		validaLoginLetras loginCaracteres = new validaLoginLetras();
		String login = "EltonDavid";
		assertTrue(loginCaracteres.validaLoginCaracteres(login));
	}
	
	@Test
	public void testValidaLoginLetrasCaracter() {
		validaLoginLetras loginCaracteres = new validaLoginLetras();
		String login = "1234567891";
		assertFalse(loginCaracteres.validaLoginCaracteres(login));
	}
	
	@Test
	public void testValidaLoginLetrasMenorQueDez() {
		validaLoginLetras loginCaracteres = new validaLoginLetras();
		String login = "EltonDavi";
		assertFalse(loginCaracteres.validaLoginCaracteres(login));
	}
}
