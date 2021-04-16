package alteraSenha;

import java.util.ArrayList;
import java.util.Random;

public class AlteraSenha {

	public static ArrayList<String> alterarSenha(String email) {
		
		/**
		 * Controla o processo de alteração de senha
		 * 
		 * Verifica se o usuário existe, envia um email para o usuário, Solicita a nova
		 * senha e a salva.
		 * 
		 * @param email E-mail do usuário.
		 * @return Lista de erros se houver
		 */
		
		ArrayList<String> erro = new ArrayList<String>();
		if (verificarUsuario(email)) {
			if (gerenciarCodigo(email)) {
				solicitarNovaSenha(email);
			} else {
				erro.add("Código inválido");
			}
		} else {
			erro.add("Usuário inexistente");
		}
		System.out.println(erro);
		return erro;
	}

	public static boolean gerenciarCodigo(String email) {
		/**
		 * Gerencia a verificação com o código
		 * 
		 * Gera, envia e confere o código de verificação de usuário
		 * 
		 * @param email Email do usuário
		 * @return true se o código informado pelo usuario for igual ao gerado
		 */
		int codigoGerado = gerarCodigo();
		enviarEmail(email, codigoGerado);
		int codigoUsuario = solicitarCodigo();
		return validarCodigo(codigoUsuario, codigoGerado);

	}

	public static void enviarEmail(String email, int codigoGerado) {
		/**
		 * Envia um e-mail
		 * 
		 * Envia o e-mail para o usuário com o código aleatório gerado para a
		 * confirmação.
		 * 
		 * @param email        Email do usuário
		 * @param codigoGerado Código aleatório gerado pelo sistema
		 */
		System.out.println("E-mail enviado");
	}

	public static int solicitarCodigo() {
		/**
		 * Solicita o código para o usuário
		 * 
		 * Carrega o front-end com o campo para o usuário digitar o código
		 * 
		 * @return Código digitado pelo usuário
		 */
		System.out.print("Código verificador de 5 digitos: ");
		int codigo = 12345;
		return codigo;
	}

	public static boolean verificarUsuario(String email) {
		/**
		 * Verifica se o usuário existe no sistema
		 * 
		 * @return boolean
		 */
		String emailExistente = "teste@gmail.com";
		boolean verificacao;
		if (emailExistente == email) {
			verificacao = true;
		} else {
			verificacao = false;
		}
		return verificacao;
	};

	public static int gerarCodigo() {
		/**
		 * Gera um código aleatório
		 * 
		 * Gera o cógigo random para a verificação de usuário
		 * 
		 * @return codigo de 5 digitos
		 */
		Random random = new Random();
		int codigo;
		codigo = random.nextInt(99999);
		if (codigo <= 10000) {
			codigo += 10000;
		}
		return codigo;
	}

	public static boolean validarCodigo(int codigoUsuario, int codigoGerado) {
		/**
		 * Verifica o código de recuperação de senha
		 * 
		 * Compara o código gerado pelo sistema com o código passado pelo usuário
		 * 
		 * @param codigoUsuario int Código informado pelo usuário
		 * @param codigoGerado  int Código gerado pelo sistema
		 * @return Boolean
		 */

		return codigoUsuario == codigoGerado ? true : false;
	}

	public static void solicitarNovaSenha(String email) {
		/**
		 * SOlicita a nova senha para o usuário
		 * 
		 * @param email Email do usuário
		 */
		String senhaNova = "novaSenha";
		salvarSenha(senhaNova);
	}

	public static void salvarSenha(String senha) {
		/**
		 * Salva a senha no banco
		 * 
		 * Criptografa e salva a nova senha no perfil do usuário
		 * 
		 * @param senha Nova senha do perfil
		 */
		System.out.println("Senha cadastrada com sucesso!!!!!!");
	}
}
