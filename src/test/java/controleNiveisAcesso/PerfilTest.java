package controleNiveisAcesso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfilTest {

	@Test
	public void testCriaNomePerfil() {
		String perfil = "Gerente de RH";
		Perfil nomeDoPerfil = new Perfil();
		assertTrue(nomeDoPerfil.criaNomePerfil(perfil));
	}

	@Test
	public void testCriaNomePerfilFalse() {
		String perfil = "";
		Perfil nomeDoPerfil = new Perfil();
		assertFalse(nomeDoPerfil.criaNomePerfil(perfil));
	}
	
	@Test
	public void testValidacaoPerfilTrue() {
		String perfil = "Colaborador";
		Perfil permissaoDeAcesso = new Perfil();
		assertTrue(permissaoDeAcesso.validacaoPerfil(perfil));
	}
	
	@Test
	public void testValidacaoPerfilFalse() {
		String perfil = "Jose";
		Perfil permissaoDeAcesso = new Perfil();
		assertFalse(permissaoDeAcesso.validacaoPerfil(perfil));
	}

}
