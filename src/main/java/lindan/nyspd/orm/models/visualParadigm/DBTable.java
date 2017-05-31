package lindan.nyspd.orm.models.visualParadigm;

import java.util.List;

public class DBTable {
	String DataModel="";
	String documentation_plain="";
	
	String OrmSyncState="";
	String PmAuthor="";
	
	String Name="";
	ModelChildren modelChildren;
	String Id="";
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public DBTable() {
		super();
		modelChildren = new ModelChildren();
	}
	public void setName(String name) {
		Name = name;
	}
	public ModelChildren getModelChildren() {
		return modelChildren;
	}
	public void setModelChildren(ModelChildren modelChildren) {
		this.modelChildren = modelChildren;
	}
	
	
	public String toString(){
		return "Tablename :"+getName()+modelChildren.toString();
		
	}
}
