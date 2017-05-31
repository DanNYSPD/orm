package lindan.nyspd.orm.util;

import lindan.nyspd.orm.models.visualParadigm.Enums.DBColumnTypes;
import lindan.nyspd.util.StringUtils;

public class TypesHelperJava implements ITypesHelper {

	@Override
	public String getLanguageType(String datatableType) {
		
		
		return getLanguageType(datatableType, -1);
	}

	@Override
	public String getLanguageType(String datatableType, int length) {
		if(StringUtils.isNullOrEmpty(datatableType)){
			return "";
		}
		String type="";
		switch (datatableType) {
		case DBColumnTypes.VARCHAR:
			type= LanguageTypes.JavaTypes.STRING;
			break;
		case DBColumnTypes.INT:
		case DBColumnTypes.INTEGER:
			type=LanguageTypes.JavaTypes.INT;
			
		default:
			break;
		}
		
		return type;
	}
	
	
	
	
}
	