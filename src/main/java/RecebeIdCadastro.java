package br.com.proway.senior.com.controle2;

import java.util.ArrayList;


/**
 * Recebe Id de cadastro
 * 
 * Recebe Id de cadastro e outros dados para retornar um ID de acesso ao
 * sistema. O id recebido � do tipo int, enquanto os demais dados (nome e
 * e-mail) s�o Strings.
 * 
 *   
 * @author Vanderlei
 *  
 *
 */

public class RecebeIdCadastro {

	final static ArrayList<Integer> id = new ArrayList<Integer>();
	final static ArrayList<String> nome = new ArrayList<String>();
	final static ArrayList<String> email = new ArrayList<String>();

	/*
	 * Para fins de verifica��o e teste, optamos por popular as vari�veis com 5
	 * observa��es e dessa forma podemos rodar os m�todos deste programa e efetuar os testes.
	 */

	public static ArrayList<Integer> PopulaDadosId(ArrayList<Integer> id) {
		// Popula os dados id
		id.add(0);
		id.add(1);
		id.add(2);
		id.add(3);
		id.add(4);
		return id;

		
	}// fim PopulaDadosId
	
	public static void PopulaDadosNome(ArrayList<String> nome) {
			// Popula os dados nome
			
		nome.add("Guilherme");
		nome.add("David W");
		nome.add("Tharlys");
		nome.add("Vanderlei");
		nome.add("Elton");
		
		}// fim PopulaDadosNome

		public static void PopulaDadosEmail(ArrayList<String> email) {
			// Popula os dados e-mail
		email.add("guilherme@companyname.com");
		email.add("david.w@companyname.com");
		email.add("tharlys@companyname.com");
		email.add("vanderlei@companyname.com");
		email.add("elton@companyname.com");
	}// fim PopulaDadosEmail
	
		/*
		 * Compara a lista de Id recebido e compara com uma lista padr�o com as informa��es esperadas.
		 */
		public static boolean EqualsId(){

			ArrayList<Integer> listaIdRecebida = new ArrayList(); 
			listaIdRecebida = PopulaDadosId(id);
						
			ArrayList<Integer> comparaListaId = new ArrayList(); // lista gen�rica simulando os valores esperados
			comparaListaId.add(0);
			comparaListaId.add(1);
			comparaListaId.add(2);
			comparaListaId.add(3);
			comparaListaId.add(4);
			
			boolean listasIguais = true;
			return comparaListaId.equals(listaIdRecebida);					
	        
	    }
		
	public static boolean ValidaId(boolean b) {

		/*
		 * O m�todo ValidaId verifica se os Ids recebidos s�o v�lidos.
		 * 
		 */

		boolean idValido = true;

		for (int i = 0; i < id.size(); i++) {
			if (id.contains(null)) {
				idValido = false;
			}
			//System.out.println("Rela��o de id dos colaboradores recebidos: " + id);
		}
		return idValido;
		
		// Verifica se um Id est� na lista recebida 

	}// Fim m�todo ValidaId

	public static boolean ValidaNome(boolean b) {

		/*
		 * O m�todo ValidaNome verifica se os nomes dos colaboradores s�o v�lidos e
		 * lista a rela��o na tela.
		 */

		boolean nomeValido = true;

		for (int i = 0; i < nome.size(); i++) {
			if (nome.contains(null)) {
				nomeValido = false;
			}
			System.out.println("Rela��o de nomes dos colaboradores recebidos: " + nome);
		}

		return nomeValido;

	}// fim m�todo ValidaNome

	public static boolean ValidaEmail(boolean b) {
		/*
		 * O m�todo ValidaEmail verifica se os endere�os de e-mail dos colaboradores s�o
		 * v�lidos e lista a rela��o na tela.
		 */

		boolean emailValido = true;

		for (int i = 0; i < email.size(); i++) {
			if (email.contains(null)) {
				emailValido = false;
			}
			System.out.println("Rela��o de e-mails dos colaboradores recebidos: " + email);
		}

		return emailValido;

	}// Fim m�todo ValidaEmail
}// Fim classe RecebeIdCadastro