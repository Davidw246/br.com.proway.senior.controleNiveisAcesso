package alteraSenha;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlteraSenhaTest {

	@Test
	public void testVerificaUsuario() {
		AlteraSenha1 minhaSenha = new AlteraSenha1();
		String nome = "Claudio";
		assertTrue(minhaSenha.verificarUsuario(nome));
	}

	@Test
	public void testEnviarEmail() {
		AlteraSenha1 minhaSenha = new AlteraSenha1();
		String email = "exemplo@gmail.com";
		assertTrue(minhaSenha.enviarEmail(email));
	}

	@Test
	public void testGerarCodigo() {
		AlteraSenha1 minhaSenha = new AlteraSenha1();
		int gerarCodigo = 12345;
		equals(minhaSenha.gerarCodigo(gerarCodigo));
	}

}