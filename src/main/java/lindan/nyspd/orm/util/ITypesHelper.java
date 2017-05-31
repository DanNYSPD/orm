package lindan.nyspd.orm.util;

/**
 * permite obtener el type de dato del lenguaje establecido
 * @author daniel
 *
 */
public interface ITypesHelper {
	
	String getLanguageType(String datatableType);
	String getLanguageType(String datatableType,int length);
	
	//enum ITypesHelperModel
}
