package controleNiveisAcesso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermissaoTest {

	@Test
	public void testCriaNomePermissao() {
		String permissao = "Visualizar";
		Permissao nomeDaPermissao = new Permissao();
		assertTrue(nomeDaPermissao.criaNomePermissao(permissao));
		
	}

	@Test
	public void testCriaNomePermissaoFalse() {
		String permissao = "";
		Permissao nomeDaPermissao = new Permissao();
		assertFalse(nomeDaPermissao.criaNomePermissao(permissao));
		
	}
}
