package controleNiveisAcesso;

public class Perfil {

	String colaborador = "Colaborador";
	String operacional = "Operacional";
	String admin = "Admin";

	Permissao permissaoDeAcesso = new Permissao();
	
	/**
	 * Um método que cria o nome do perfil. Verifica se o nome se o nome recebido é
	 * nulo ou vazio.
	 * 
	 * @param nomeDoPerfil é uma String
	 * @return retorna true ou false
	 */
	public boolean criaNomePerfil(String nomeDoPerfil) {
		boolean validacao;

		if (nomeDoPerfil == null) {
			validacao = false;
		} else if (nomeDoPerfil.equals("")) {
			validacao = false;
		} else {
			validacao = true;
		}

		return validacao;
	}

	/**
	 * Método que retorna verdadeiro com a verificacão do perfil
	 * pré-estabelecida
	 * 
	 * @param perfil
	 * @return true
	 */
	public boolean validacaoPerfil(String perfil) {
		boolean validacao;

		if (perfil.equalsIgnoreCase(this.colaborador)) {
			validacao = true;
			permissaoDeAcesso.permissaoVisualizar();
		} else if (perfil.equalsIgnoreCase(this.operacional)) {
			validacao = true;
			permissaoDeAcesso.permissaoVisualizar();
			permissaoDeAcesso.permissaoCadastrar();
		} else if (perfil.equalsIgnoreCase(this.admin)) {
			validacao = true;
			permissaoDeAcesso.permissaoVisualizar();
			permissaoDeAcesso.permissaoEditar();
			permissaoDeAcesso.permissaoCadastrar();
		} else {
			validacao = false;
		}

		return validacao;
	}

	/*
	public boolean perfilOperacional(String perfil) {
		boolean validacao;

		Permissao permissaoDeAcesso = new Permissao();

		if (perfil.equalsIgnoreCase(this.operacional)) {
			validacao = true;
			permissaoDeAcesso.permissaoVisualizar(perfil);
			permissaoDeAcesso.permissaoCadastrar(perfil);
		} else {
			validacao = false;
		}

		return validacao;
	}

	public boolean perfilAdmin(String perfil) {
		boolean validacao;

		Permissao permissaoDeAcesso = new Permissao();

		if (perfil.equalsIgnoreCase(this.admin)) {
			validacao = true;
			permissaoDeAcesso.permissaoVisualizar(perfil);
			permissaoDeAcesso.permissaoEditar(perfil);
			permissaoDeAcesso.permissaoCadastrar(perfil);
		} else {
			validacao = false;
		}

		return validacao;
	}
	*/
}
