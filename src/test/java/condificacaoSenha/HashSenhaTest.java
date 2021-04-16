package condificacaoSenha;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import verificaLogin.VerificaLogin;

public class HashSenhaTest {
	
		@Test
		public void testHashSenha() {
			HashSenha hash = new HashSenha();
			String senha = "admin";
			assertEquals(hash.senhaUsuario, senha);
		}
	}