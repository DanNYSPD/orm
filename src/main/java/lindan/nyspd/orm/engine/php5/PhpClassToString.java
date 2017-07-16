package lindan.nyspd.orm.engine.php5;

import lindan.nyspd.orm.engine.java.IJavaClassToString;
import lindan.nyspd.orm.engine.java.JavaClassToString;
import lindan.nyspd.orm.engine.java.models.JavaClass;
import lindan.nyspd.orm.engine.java.models.JavaEnums;
import lindan.nyspd.orm.engine.php5.models.Php5Class;
import lindan.nyspd.orm.engine.php5.models.Php5ClassMember;
import lindan.nyspd.orm.engine.php5.models.PhpEnums;
import lindan.nyspd.orm.engine.php5.models.PhpNameSpace;
import lindan.nyspd.util.StringUtils;

/**
 * classe que convierte un objeto Phpclass a string(serializa a string en codigo). 
 * @author daniel
 *
 */
public class PhpClassToString implements IPhpClassToString{

	

	@Override
	public void setStringToPackage(PhpNameSpace phpNameSpace) {
		for (Php5Class j: phpNameSpace.getClasses()){
				
	    	  this.setString(j);    	  
	    	  System.out.println(j.toString());    	  
	      }
		
	}

	@Override
	public void setString(Php5Class phpClass) {
		String classString=writeClass(phpClass);
		phpClass.setString(classString);
		
	}

	@Override
	public String writeClass(Php5Class phpClass) {
		StringBuilder stringBuilder= new StringBuilder();
		String name=phpClass.getNameClass();
		
		
		stringBuilder.append("<?php");
		stringBuilder.append("\n");
		
		stringBuilder.append("class ");
		stringBuilder.append(name);
		stringBuilder.append('{');
		stringBuilder.append('\n');
		
		phpClass.getMembers().forEach(x->{
			stringBuilder.append(writeMembers(x));
			stringBuilder.append("\n");
		});	
		stringBuilder.append("\n");
		phpClass.getMembers().forEach(x->{
			
			stringBuilder.append(generateGetter(x));
			stringBuilder.append("\n");
			
			stringBuilder.append(generateSetter(x));
			stringBuilder.append("\n");
			
		});
		
		
		stringBuilder.append('}');
		
		
		stringBuilder.append("\n");
		stringBuilder.append("?>");
		return stringBuilder.toString();
		
	}

	@Override
	public String writeMembers(Php5ClassMember classMember) {
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
		stringBuilder.append('$');
		stringBuilder.append(name);
		stringBuilder.append(';');
		
		return stringBuilder.toString();
	}

	@Override
	public String generateGetter(Php5ClassMember classMember) {
		StringBuilder stringBuilder = new StringBuilder();
		String name=classMember.getName();
		String type=classMember.getType();
	
		/***header**/
		stringBuilder.append("\t");
		stringBuilder.append(PhpEnums.Scope.PUBLIC);
		stringBuilder.append(" function ");
		//stringBuilder.append(type);
		
		stringBuilder.append("get");
		stringBuilder.append(StringUtils.firtsToUpperCase(name));
		stringBuilder.append("()");
		stringBuilder.append('{');
		/***body**/
		
		stringBuilder.append("\n");
		stringBuilder.append("\t\t");
		
		stringBuilder.append("return $this->"+name);
		stringBuilder.append(';');
		stringBuilder.append("\n");
		
		stringBuilder.append("\t");
		stringBuilder.append('}');
		
		
		
		return stringBuilder.toString();
		
	}

	@Override
	public String generateSetter(Php5ClassMember classMember) {
		StringBuilder stringBuilder = new StringBuilder();
		String name=classMember.getName();
		String type=classMember.getType();
		
		/***header**/
		stringBuilder.append("\t");
		stringBuilder.append(JavaEnums.Scope.PUBLIC);
		stringBuilder.append(' ');
		
		
		stringBuilder.append(" function ");
		stringBuilder.append("set");
		stringBuilder.append(StringUtils.firtsToUpperCase(name));
		stringBuilder.append("(");
		stringBuilder.append(type);
		stringBuilder.append('$');
		stringBuilder.append(name);
		stringBuilder.append(")");
		stringBuilder.append('{');
		/***body**/
		
		stringBuilder.append("\n");
		stringBuilder.append("\t\t");
		
		stringBuilder.append("$this->"+name);
		stringBuilder.append('=');
		stringBuilder.append('$');
		stringBuilder.append(name);
		stringBuilder.append(';');
		stringBuilder.append("\n");
		
		stringBuilder.append("\t");
		stringBuilder.append('}');
		
		return stringBuilder.toString();
	}

	
}
