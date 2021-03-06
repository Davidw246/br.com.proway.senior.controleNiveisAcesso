package verificaAcesso;
import java.util.ArrayList;

public class VerificaAcesso {
	ArrayList<String> listaPermissaoIndividual = new ArrayList<String>();
	ArrayList<ArrayList<String>> listaPacotes = new ArrayList<ArrayList<String>>();
	ArrayList<String> listaPermissaoPacotes = new ArrayList<String>();
	
	/**
	 * Verifica se o pacote existe na lista de pacotes.
	 * 
	 * Realiza verifica??o se o pacote informado existe na lista de pacotes,
	 * retorna booelan true caso existir e false se o contr?rio.
	 * 
	 * @param pack ArrayList<String> referente ao pacote informado.
	 * @return boolean true se o pacote existe e false se o contr?rio.
	 */
	public boolean packageExists(ArrayList<String> pack){
		if(listaPacotes.indexOf(pack) > listaPacotes.size() || listaPacotes.indexOf(pack) < 0 ){
			return false;
		}
		return true;
	}
	
	/**
	 * Verifica se a permiss?o informada existe na lista de pacotes
	 * informada. 
	 * 
	 * Realiza a verifica??o de existencia de um parametro String permission dentro de um parametro
	 * ArrayList pack e retorna um boolean.
	 *  
	 * @param pack ArrayList<> primeiro parametro, referente a lista de pacotes
	 * @param permission String segundo parametro, referente a permiss?o
	 * @return boolean true se existit false caso contr?rio
	 */
	public boolean checkPermissionOnPackage(ArrayList<String> pack, String permission){
		for(int i = 0; i < pack.size(); i++) {
			if(pack.get(i).equals(permission)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Verifica se a permiss?o existe na lista de permiss?es do pacote.
	 * 
	 * Realiza verifica??o se a permiss?o informada existe na lista de permiss?es do pacote,
	 * retorna booelan true caso existir e false se o contr?rio.
	 * 
	 * @param permission String referente a permiss?o informada.
	 * @return boolean true se a permiss?o existe e false se o contr?rio.
	 */
	public boolean permissionExistsPack(String permission){
		if(listaPermissaoPacotes.indexOf(permission) > listaPermissaoPacotes.size() || listaPermissaoPacotes.indexOf(permission) < 0){
			return false;
		} 
		return true;
	}
	
	/**
	 * Verifica se a permiss?o existe na lista de permiss?es individual.
	 * 
	 * Realiza verifica??o se a permiss?o informada existe na lista de permiss?es individual,
	 * retorna booelan true caso existir e false se o contr?rio.
	 * 
	 * @param permission String referente a permiss?o informada.
	 * @return boolean true se a permiss?o existe e false se o contr?rio.
	 */
	public boolean permissionExistsIndividual(String permission){
		if(listaPermissaoIndividual.indexOf(permission) > listaPermissaoIndividual.size() || listaPermissaoIndividual.indexOf(permission) < 0){
			return false;
		} 
		return true;
	}
}
