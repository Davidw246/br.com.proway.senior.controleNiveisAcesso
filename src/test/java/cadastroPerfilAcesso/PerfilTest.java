package cadastroPerfilAcesso;

import static org.junit.Assert.*;

import org.junit.Test;

public class PerfilTest {

	@Test
	public void testLogarPerfil() {
		Perfil meuPerfil = new Perfil();
		String nome = "CLAUDIO";
		String senha = "1234";
		assertTrue(meuPerfil.logarPerfil(nome, senha));
	}

	@Test
	public void testLogarPerfilFalse() {
		Perfil meuPerfil = new Perfil();
		String nome = "Claudio";
		String senha = "12345";
		assertFalse(meuPerfil.logarPerfil(nome, senha));

	}

	@Test
	public void testLogarPerfilVazio() {
		Perfil meuPerfil = new Perfil();
		String nome = "";
		String senha = "";
		assertFalse(meuPerfil.logarPerfil(nome, senha));
	}

	@Test
	public void testLogarPerfilNull() {
		Perfil meuPerfil = new Perfil();
		String nome = null;
		String senha = null;
		assertFalse(meuPerfil.logarPerfil(nome, senha));
	}
}