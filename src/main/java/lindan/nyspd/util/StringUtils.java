package lindan.nyspd.util;

public class StringUtils {
	public static boolean isNullOrEmpty(String cad) {
		return (cad==null||cad.isEmpty())? true:false;
	}
	/**
	 * 
	 * @param cad
	 * @return string con el primer caracter Uppercase
	 */
	public static String firtsToUpperCase(String cad) {
		/*if(isNullOrEmpty(cad)){
			return "";
		}*/
		
		return cad.substring(0,1).toUpperCase()+cad.substring(1); 
	}
}
