package lindan.nyspd.orm.engine.java.models;

import java.util.ArrayList;
import java.util.List;

public class JavaPackage {
	String packageName="";
	List<JavaClass> classes=new ArrayList<>();
	
	
	public JavaPackage(String packageName, List<JavaClass> classes) {
		super();
		this.packageName = packageName;
		this.classes = classes;
	}
	public JavaPackage() {
		super();
		
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public List<JavaClass> getClasses() {
		return classes;
	}
	public void setClasses(List<JavaClass> classes) {
		this.classes = classes;
	}
	
}
