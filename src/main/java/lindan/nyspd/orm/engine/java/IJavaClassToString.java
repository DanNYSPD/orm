package lindan.nyspd.orm.engine.java;

import lindan.nyspd.orm.engine.IClassToString;
import lindan.nyspd.orm.engine.java.models.JavaClass;
import lindan.nyspd.orm.engine.java.models.JavaClassMember;
import lindan.nyspd.orm.engine.java.models.JavaPackage;

public interface IJavaClassToString  {

	
	void setStringToPackage(JavaPackage javaPackage);
	void setString(JavaClass javaClass);

	String writeClass(JavaClass javaClass);

	String writeMembers(JavaClassMember classMember);

	String generateGetter(JavaClassMember classMember);

	String generateSetter(JavaClassMember classMember);
	
}