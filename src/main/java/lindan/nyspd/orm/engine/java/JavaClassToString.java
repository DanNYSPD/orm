package lindan.nyspd.orm.engine.java;

import javax.imageio.ImageTypeSpecifier;

import lindan.nyspd.orm.engine.java.models.JavaClass;
import lindan.nyspd.orm.engine.java.models.JavaClassMember;
import lindan.nyspd.orm.engine.java.models.JavaEnums;
import lindan.nyspd.orm.engine.java.models.JavaPackage;
import lindan.nyspd.util.StringUtils;
/**
 * En esta version por defecto los modelos sseran publicos
 * CLase encargada de convertir los objeto JavaClass en string
 * @author daniel
 *
 */
public class JavaClassToString implements IJavaClassToString {
	
	public void setStringToPackage(JavaPackage javaPackage) {
      for (JavaClass j: javaPackage.getClasses()){
    	  IJavaClassToString javaWriter = new JavaClassToString();
    	  javaWriter.setString(j);    	  
    	  System.out.println(j.toString());    	  
      }
	}
	
	/* (non-Javadoc)
	 * @see lindan.nyspd.orm.engine.java.IJavaClassToString#setString(lindan.nyspd.orm.models.java.JavaClass)
	 */
	@Override
	public void setString(JavaClass javaClass) {
		String classString=writeClass(javaClass);
		javaClass.setString(classString);
	}
	
	/* (non-Javadoc)
	 * @see lindan.nyspd.orm.engine.java.IJavaClassToString#writeClass(lindan.nyspd.orm.models.java.JavaClass)
	 */
	@Override
	public String writeClass(JavaClass javaClass) {
		StringBuilder stringBuilder= new StringBuilder();
		String name=javaClass.getNameClass();
		
		stringBuilder.append("public class ");
		stringBuilder.append(name);
		stringBuilder.append('{');
		stringBuilder.append('\n');
		
		javaClass.getMembers().forEach(x->{
			stringBuilder.append(writeMembers(x));
			stringBuilder.append("\n");
		});	
		stringBuilder.append("\n");
		javaClass.getMembers().forEach(x->{
			
			stringBuilder.append(generateGetter(x));
			stringBuilder.append("\n");
			
			stringBuilder.append(generateSetter(x));
			stringBuilder.append("\n");
			
		});
		
		
		stringBuilder.append('}');
		return stringBuilder.toString();
	}
	/* (non-Javadoc)
	 * @see lindan.nyspd.orm.engine.java.IJavaClassToString#writeMembers(lindan.nyspd.orm.models.java.JavaClassMember)
	 */
	@Override
	public String writeMembers(JavaClassMember classMember) {
		StringBuilder stringBuilder= new StringBuilder();
		String name=classMember.getName();
		String type=classMember.getType();
		String scope=classMember.getScope();
		if(scope.length()==0){
			scope=JavaEnums.Scope.PRIVATE;			
		}
		stringBuilder.append("\t");
		stringBuilder.append(scope);
		stringBuilder.append(' ');
		stringBuilder.append(type);
		stringBuilder.append(' ');
		stringBuilder.append(name);
		stringBuilder.append(';');
		
		return stringBuilder.toString();		
	}
	/* (non-Javadoc)
	 * @see lindan.nyspd.orm.engine.java.IJavaClassToString#generateGetter(lindan.nyspd.orm.models.java.JavaClassMember)
	 */
	@Override
	public String generateGetter(JavaClassMember classMember){
		StringBuilder stringBuilder = new StringBuilder();
		String name=classMember.getName();
		String type=classMember.getType();
		
		/***header**/
		stringBuilder.append("\t");
		stringBuilder.append(JavaEnums.Scope.PUBLIC);
		stringBuilder.append(' ');
		stringBuilder.append(type);
		stringBuilder.append(' ');
		stringBuilder.append("get");
		stringBuilder.append(StringUtils.firtsToUpperCase(name));
		stringBuilder.append("()");
		stringBuilder.append('{');
		/***body**/
		
		stringBuilder.append("\n");
		stringBuilder.append("\t\t");
		
		stringBuilder.append("return this."+name);
		stringBuilder.append(';');
		stringBuilder.append("\n");
		
		stringBuilder.append("\t");
		stringBuilder.append('}');
		
		return stringBuilder.toString();
		
	}
	
	/* (non-Javadoc)
	 * @see lindan.nyspd.orm.engine.java.IJavaClassToString#generateSetter(lindan.nyspd.orm.models.java.JavaClassMember)
	 */
	@Override
	public String generateSetter(JavaClassMember classMember){
		StringBuilder stringBuilder = new StringBuilder();
		String name=classMember.getName();
		String type=classMember.getType();
		
		/***header**/
		stringBuilder.append("\t");
		stringBuilder.append(JavaEnums.Scope.PUBLIC);
		stringBuilder.append(' ');
		
		stringBuilder.append("void");
		stringBuilder.append(' ');
		stringBuilder.append("set");
		stringBuilder.append(StringUtils.firtsToUpperCase(name));
		stringBuilder.append("(");
		stringBuilder.append(type);
		stringBuilder.append(' ');
		stringBuilder.append(name);
		stringBuilder.append(")");
		stringBuilder.append('{');
		/***body**/
		
		stringBuilder.append("\n");
		stringBuilder.append("\t\t");
		
		stringBuilder.append("this."+name);
		stringBuilder.append('=');
		stringBuilder.append(name);
		stringBuilder.append(';');
		stringBuilder.append("\n");
		
		stringBuilder.append("\t");
		stringBuilder.append('}');
		
		return stringBuilder.toString();
		
	}
}
