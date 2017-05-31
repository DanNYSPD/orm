package lindan.nyspd.orm.models.visualParadigm;

import lindan.nyspd.orm.models.visualParadigm.Enums.Type;

public class DBColumn {
	String Documentation_plain="";
	String Generated="";
	String Id="";
	String IdGenerator="";
	String IdentityIncrement="";
	
	String Length="";
	
	boolean PrimaryKey;
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	String type;/****/
	String Name="";/****/
	boolean Unique;
	
	ForeignKeyConstraints ForeignKeyConstraints;
	
	public String toString() {
		return "--NameColum:"+getName()+" Type:"+getType();
	}
}
