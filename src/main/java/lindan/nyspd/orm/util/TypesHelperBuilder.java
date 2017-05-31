package lindan.nyspd.orm.util;

public class TypesHelperBuilder {
	
	public static ITypesHelper build(Language language) {
		ITypesHelper iTypesHelper=null;
		switch (language) {
		case JAVA:
			iTypesHelper = new TypesHelperJava();
			break;

		default:
			break;
		}
		return iTypesHelper;
	}
}
