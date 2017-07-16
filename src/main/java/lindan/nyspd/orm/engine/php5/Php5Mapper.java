package lindan.nyspd.orm.engine.php5;

import java.util.ArrayList;
import java.util.List;

import lindan.nyspd.orm.engine.Language;
import lindan.nyspd.orm.engine.php5.models.Php5Class;
import lindan.nyspd.orm.engine.php5.models.Php5ClassMember;
import lindan.nyspd.orm.engine.php5.models.PhpNameSpace;

import lindan.nyspd.orm.models.visualParadigm.DBColumn;
import lindan.nyspd.orm.models.visualParadigm.DBTable;
import lindan.nyspd.orm.util.ITypesHelper;
import lindan.nyspd.orm.util.TypesHelperBuilder;

/**
 * clase que ese encarga de recibir una lista de DBTable y covertirlo a clases php
 * @author daniel
 *
 */
public class Php5Mapper implements ITypesHelper{
	private List<DBTable> scheme;
	private ITypesHelper	iTypesHelper;
	private PhpNameSpace phpNameSpace;
	
	public Php5Mapper(List<DBTable> scheme) {
		super();
		this.scheme = scheme;
		this.iTypesHelper=TypesHelperBuilder.build(Language.PHP5);
	}
	
	/*
	 * apartir de la lsita de DBTable genera una clasephp por cada dbtable y las devuelve un objeto 
	 * phpNameScpace que inclute las clases 
	 */
	public PhpNameSpace createModels(){
		phpNameSpace= new PhpNameSpace();
		List<Php5Class> phpClasses= new ArrayList<>();
		for (DBTable dbTable : scheme) {
			Php5Class phpClass= createClass(dbTable);
			phpClasses.add(phpClass);
			
		}
		
		phpNameSpace.setClasses(phpClasses);

		return phpNameSpace;
	}
	/**
	 * recibe una dbtable y lo convierte a clase
	 * @param dbTable
	 * @return
	 */
	public Php5Class createClass(DBTable dbTable) {
		Php5Class php5Class = new Php5Class();
		
		List<DBColumn> columns=dbTable.getModelChildren().getDBColumn();
		List<Php5ClassMember> classMembers= new ArrayList<>();
		for (DBColumn dbColumn : columns) {
			classMembers.add(createMemberFromColum(dbColumn));
		}
		
		php5Class.setMembers(classMembers);
		php5Class.setNameClass(dbTable.getName());		
		
		return php5Class;
	}
/**
 * genera un miembro de clase por la columna que recibe
 * @param dbColumn
 * @return
 */
public Php5ClassMember createMemberFromColum(DBColumn dbColumn) {
	Php5ClassMember classMember= new Php5ClassMember();
	classMember.setName(  dbColumn.getName());
	String phpType=getLanguageType(dbColumn.getType());
	classMember.setType(phpType);
	
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
