package lindan.nyspd.orm.models.java;

import java.util.ArrayList;
import java.util.List;

public class JavaClassMember {
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public boolean isGetter() {
		return getter;
	}
	public void setGetter(boolean getter) {
		this.getter = getter;
	}
	public boolean isSetter() {
		return setter;
	}
	public void setSetter(boolean setter) {
		this.setter = setter;
	}
	public boolean isConstructor() {
		return constructor;
	}
	public void setConstructor(boolean constructor) {
		this.constructor = constructor;
	}
	public boolean isFinal() {
		return isFinal;
	}
	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	public List<String> getMembersAnottations() {
		return membersAnottations;
	}
	public void setMembersAnottations(List<String> membersAnottations) {
		this.membersAnottations = membersAnottations;
	}
	String type="";
	String name="";
	String scope="";
	boolean getter=true;
	boolean setter=true;
	boolean constructor=true;
	boolean isFinal=false;
	/**
	 * Anotaciones del atributo (dependeran del framerowk)
	 */
	List<String> membersAnottations= new ArrayList<String>();
}
