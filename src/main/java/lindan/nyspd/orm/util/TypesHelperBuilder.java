package lindan.nyspd.orm.util;

import lindan.nyspd.orm.engine.Language;
import lindan.nyspd.orm.engine.php5.Php5TypesHelper;

public class TypesHelperBuilder {
	
	public static ITypesHelper build(Language language) {
		ITypesHelper iTypesHelper=null;
		switch (language) {
		case JAVA:
			iTypesHelper = new JavaTypesHelper();
			break;
		case PHP5:
			iTypesHelper = new Php5TypesHelper();	
		default:
			break;
		}
		return iTypesHelper;
	}
}
