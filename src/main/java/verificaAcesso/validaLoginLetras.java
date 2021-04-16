package verificaAcesso;

public class validaLoginLetras {

	/**
	 * Método 
	 * 
	 * @param login
	 * @return loginValido boolean
	 */
	public static boolean validaLoginCaracteres(String login) {
		boolean loginValido = true;
		if (login.length() != 10) {
			loginValido = false;
		}
		if (login.substring(0, 9).matches("[A-Z]*")) {
			loginValido = false;
		}
		if (login.substring(9).matches("[0-9]*")) {
			loginValido = false;
		}
		return loginValido;
	}

}