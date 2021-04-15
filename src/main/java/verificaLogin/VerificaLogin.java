package verificaLogin;

import java.util.Scanner;

public class VerificaLogin {

	static Scanner esc;

	public static void main(String[] args) {

		esc = new Scanner(System.in);

		String login, senha;

		System.out.println("Insira login: ");

		login = esc.next();

		System.out.println("Insira senha: ");

		senha = esc.next();

		verificalogin(login, senha);

		if (verificalogin(login, senha) == true) {
			System.out.printf("Usuário %s logado com sucesso.", login);
		} else
			System.out.printf("Usuário não cadastrado");

	}

	/**
	 * Verifica as credenciais.
	 * 
	 * Compara as informações que o usuario inseriu com as que estão no sistema.
	 * 
	 * @param login String login do usuario
	 * @param senha String senha do usuario
	 * @return True or False
	 */
	static boolean verificalogin(String login, String senha) {

		if (login.equals("Claudio") && senha.equals("2")) {
			return true;
		} else {
			return false;
		}
	}

}
