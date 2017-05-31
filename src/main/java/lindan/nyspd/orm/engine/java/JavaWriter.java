package lindan.nyspd.orm.engine.java;

import javax.imageio.ImageTypeSpecifier;

import lindan.nyspd.orm.models.java.JavaClass;
import lindan.nyspd.orm.models.java.JavaClassMember;
import lindan.nyspd.orm.models.java.JavaEnums;
/**
 * En esta version por defecto los modelos sseran publicos
 * @author daniel
 *
 */
public class JavaWriter {
	
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
	private String writeMembers(JavaClassMember classMember) {
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
	private String generateGetter(JavaClassMember classMember){
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
		stringBuilder.append(name);
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
	
	private String generateSetter(JavaClassMember classMember){
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
		stringBuilder.append(name);
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
