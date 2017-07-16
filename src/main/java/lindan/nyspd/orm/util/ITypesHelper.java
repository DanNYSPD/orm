package lindan.nyspd.orm.util;

/**
 * permite obtener el type de dato del lenguaje establecido
 * @author daniel
 *
 */
public interface ITypesHelper {
	
	String getLanguageType(String columnType);
	String getLanguageType(String columnType,int length);
	
	//enum ITypesHelperModel
}
