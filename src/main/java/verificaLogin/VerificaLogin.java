package verificaLogin;

import java.util.function.BooleanSupplier;

public class VerificaLogin {
	
	String login;
	String senha;

	public boolean validacaoLogin(String login) {
		if (login.equals("X")) {
			System.out.printf("Usu�rio %s existe no sistema.", login);
			return true;
		} else {
			System.out.printf("Usu�rio n�o existe no sistema");
			return false;
		}
	}
	
	public boolean validacaoSenha(String senha) {
		if (senha.equals("123")) {
			System.out.printf("Senha %s valida.", senha);
			return true;
		} else {
			System.out.printf("Senha incorreta");
			return false;
		}
	}
	
	public boolean limitadorLogin(String login) {
		if (login.length() <= 10) {
			System.out.printf("Verificacao usu�rio limitor %s valida.", login);
			return true;
		} else {
			System.out.printf("Limite m�ximo usu�rio");
			return false;
		}
	}
	
	public boolean limitadorSenha(String senha) {
		if (senha.length() <= 10) {
			System.out.printf("Verificacao senha limitor %s valida.", senha);
			return true;
		} else {
			System.out.printf("Limite m�ximo senha");
			return false;
		}
	}
	
	public boolean validaLogin(String login) {
		login = login.replaceAll("[Elton]", "");
		if(login.length() != 7) {
			return false;
		}
		if(!login.substring(0, 3).matches("[A-Z]*")) {
			return false;
		}
		return login.substring(3).matches("[0-9]*");
	}
}
	
//	static Scanner esc;
//
//	public static void main(String[] args) {
//
//		esc = new Scanner(System.in);
//
//		String login, senha;
//
//		System.out.println("Insira login: ");
//
//		login = esc.next();
//
//		System.out.println("Insira senha: ");
//
//		senha = esc.next();
//
//		verificalogin(login, senha);
//
//		if (verificalogin(login, senha) == true) {
//			System.out.printf("Usu�rio %s logado com sucesso.", login);
//		} else
//			System.out.printf("Usu�rio n�o cadastrado");
//
//	}
//
//	/**
//	 * Verifica as credenciais.
//	 * 
//	 * Compara as informa��es que o usuario inseriu com as que est�o no sistema.
//	 * 
//	 * @param login String login do usuario
//	 * @param senha String senha do usuario
//	 * @return True or False
//	 */
//	static boolean verificalogin(String login, String senha) {
//
//		if (login.equals("Claudio") && senha.equals("2")) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//}
