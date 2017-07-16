package lindan.nyspd.orm.util;

import lindan.nyspd.orm.engine.java.LanguageTypes;
import lindan.nyspd.orm.models.visualParadigm.Enums.DBColumnTypes;
import lindan.nyspd.util.StringUtils;

public class JavaTypesHelper implements ITypesHelper {

	@Override
	public String getLanguageType(String columnType) {
		
		
		return getLanguageType(columnType, -1);
	}

	@Override
	public String getLanguageType(String columnType, int length) {
		if(StringUtils.isNullOrEmpty(columnType)){
			return "";
		}
		String type="";
		switch (columnType) {
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
	