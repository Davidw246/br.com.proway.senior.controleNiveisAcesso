package controleNiveisAcesso;

import acessoUsuario.Usuario;

public class Permissao {
	
	String visualizar = "Visualizar";
	String cadastrar = "Cadastrar";
	String editar = "Editar";
	
	/**
	 * Um m�todo que cria o nome da permiss�o
	 * Verifica se o nome se o nome recebido � nulo ou vazio.
	 * 
	 * @param nomeDaPermissao � uma String
	 * @return retorna true ou false
	 */
	public boolean criaNomePermissao(String nomeDaPermissao) {
		if (nomeDaPermissao == null) {
			return false;			
		} else if (nomeDaPermissao.equals("")) {
			return false;
		} else {
			return true;
		}	
	}
	
	/**
	 * M�todo que retorna true caso o perfil esteja autorizado
	 * 
	 * @param perfil
	 * @return true
	 */
	public boolean permissaoVisualizar() {
		return true;
	}
	
	public boolean permissaoCadastrar() {
		return true;
	}
	
	public boolean permissaoEditar() {
		return true;
	}
}
