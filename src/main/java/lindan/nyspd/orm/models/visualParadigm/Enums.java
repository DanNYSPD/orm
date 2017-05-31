package lindan.nyspd.orm.models.visualParadigm;
/**
 * 
 * @author daniel
 *
 */
public class Enums {
	public enum Type{
		INT,
		VARCHAR,
		CHAR
		
		
	}
	public class TAGS{
		public static final String Models="Models"; 
		public static final String DBTable="DBTable";
		public static final String ModelChildren="ModelChildren";
		public static final String DBColumn="DBColumn";
		public static final String ForeignKeyConstraints="ForeignKeyConstraints";
		public static final String DBForeignKeyConstraint="DBForeignKeyConstraint";
	}
	public class DBTableAttributes{
		//para esta version solo id y nombre
		public static final String Id="Id";
		public static final String Name="Name";
		public static final String DataModel="DataModel";
		public static final String Documentation_plain="Documentation_plain";
		
	}
	
	public class DBColumnAttributes{
		//para esta version solo id y nombre
		public static final String Id="Id";
		public static final String Name="Name";
		
		public static final String Documentation_plain="Documentation_plain";
		
		
		public static final String Length="Length";
		public static final String PrimaryKey="PrimaryKey";
		public static final String Type="Type";
		
	}
	
	public class DBColumnTypes{
		public static final String INT="int";
		public static final String SMALLINT="smallint";
		public static final String BIGINT="bigint";
		public static final String INTEGER="integer";
		public static final String VARCHAR="varchar";
		public static final String TEXT="text";
		public static final String CHAR="char";
		public static final String NCHAR="nchar";
		public static final String BOOL="bool";
		public static final String NUMERIC="numeric";
		public static final String FLOAT="float";
		public static final String DOUBLE="double";
		public static final String DECIMAL="decimal";
		public static final String REAL="real";
		public static final String FLOAT4="float4";
		public static final String FLOAT8="float8";
		public static final String DATETIME="datetime";
		public static final String DATE="date";
		public static final String TIME="time";
		public static final String YEAR="year";
		
	}
}
