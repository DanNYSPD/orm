package lindan.nyspd.orm.models.java;

import java.util.ArrayList;
import java.util.List;

public class JavaClass {
	/**
	 * Añadir lista de import 
	 * Añadir atributo package?
	 */
	
	String nameClass="";
	List<JavaClassMember> members;
	List<String> classAnottations= new ArrayList<String>();
	
	boolean isFinal=false;
	
	String parent="";
	boolean isChild=false;
	
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
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
