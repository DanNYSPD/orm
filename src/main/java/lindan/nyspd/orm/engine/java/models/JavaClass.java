package lindan.nyspd.orm.engine.java.models;

import java.util.ArrayList;
import java.util.List;

import lindan.nyspd.orm.engine.ClassBase;

public class JavaClass extends ClassBase{
	/**
	 * Añadir lista de import 
	 * Añadir atributo package?
	 */
	
	
	
	
	
	List<JavaClassMember> members;
	List<String> classAnottations= new ArrayList<String>();
	
	boolean isFinal=false;
	
	String parent="";
	/*
	 * Extiende de otra clase
	 */
	boolean isChild=false;
	
	String packageName="";
	
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	
	
	public List<JavaClassMember> getMembers() {
		return members;
	}
	public void setMembers(List<JavaClassMember> members) {
		this.members = members;
	}
	public List<String> getClassAnottations() {
		return classAnottations;
	}
	public void setClassAnottations(List<String> classAnottations) {
		this.classAnottations = classAnottations;
	}

}
