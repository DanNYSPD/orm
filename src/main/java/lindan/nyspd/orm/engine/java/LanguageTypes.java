package lindan.nyspd.orm.engine.java;

public class LanguageTypes {
	public class JavaTypes{
		public static final String STRING="String";
		public static final String INT="int";
		public static final String BYTE="byte";
		
		public static final String SHORT="short";
		public static final String LONG="long";
		public static final String FLOAT="float";
		public static final String DOUBLE="double";
		public static final String CHAR="char";
		public static final String BOOLEAN="boolean";
	}
	/**
	 * define si es de tipo primitivo o de custom
	 * @author daniel
	 *
	 */
	public enum types{
		PRIMITIVES,
		CUSTOM
	}
	
	public class LanguagesExtensions{
		public static final String JAVA=".java";
		public static final String PHP=".php";
		public static final String C_SHARP=".cs";
		
	}
}
