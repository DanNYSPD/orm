package lindan.nyspd.orm.engine.java;

import java.util.ArrayList;
import java.util.List;

import lindan.nyspd.orm.models.java.JavaClass;
import lindan.nyspd.orm.models.java.JavaClassMember;
import lindan.nyspd.orm.models.java.JavaPackage;
import lindan.nyspd.orm.models.visualParadigm.DBColumn;
import lindan.nyspd.orm.models.visualParadigm.DBTable;
import lindan.nyspd.orm.util.ITypesHelper;
import lindan.nyspd.orm.util.Language;
import lindan.nyspd.orm.util.TypesHelperBuilder;

//abstraer en interfaz para varios lenguajes
/**
 * Clase que permite crear clases para java a partir de la definicion de tablas y sus columnas
 * @author daniel
 *
 */
public class ClassHelperJava implements ITypesHelper {
	List<DBTable> schema;
	JavaPackage javaPackage;
	ITypesHelper	iTypesHelper;
	public ClassHelperJava(List<DBTable> schema){
		this.schema=schema;
		
		this.iTypesHelper=TypesHelperBuilder.build(Language.JAVA);
	//iTypesHelper.getLanguageType(datatableType)
		
		
	}
	public List<DBTable> getSchema() {
		return schema;
	}
	

	public void setSchema(List<DBTable> schema) {
		
		this.schema = schema;
	}
	
	public JavaClass createClass(DBTable dbTable) {
		JavaClass javaClass = new JavaClass();
		
		List<DBColumn> columns=dbTable.getModelChildren().getDBColumn();
		List<JavaClassMember> classMembers= new ArrayList<>();
		for (DBColumn dbColumn : columns) {
			classMembers.add(createMemberFromColum(dbColumn));
		}
		
		javaClass.setMembers(classMembers);
		javaClass.setNameClass(dbTable.getName());		
		
		return javaClass;
	}
	public JavaPackage createPackage(){
		javaPackage= new JavaPackage();
		List<JavaClass> javaClasses= new ArrayList<>();
		for (DBTable dbTable : schema) {
			JavaClass javaClass= createClass(dbTable);
			javaClasses.add(javaClass);
			
		}
		
		javaPackage.setClasses(javaClasses);
//		javaPackage.setPackageName(//);
		return javaPackage;
	}
	/**
	 * genera un miembro por la columna que recibe
	 * @param dbColumn
	 * @return
	 */
	public JavaClassMember createMemberFromColum(DBColumn dbColumn) {
		JavaClassMember classMember= new JavaClassMember();
		classMember.setName(  dbColumn.getName());
		String javaType=getLanguageType(dbColumn.getType());
		classMember.setType(javaType);
		
		
		
		return classMember;
		
	}
	/*********metodo implementado (composisicon sobre herencia)***/
	@Override
	public String getLanguageType(String datatableType) {
		return this.iTypesHelper.getLanguageType(datatableType);
		
	}
	@Override
	public String getLanguageType(String datatableType, int length) {
		
		return this.iTypesHelper.getLanguageType(datatableType,length);
	}
	
}
