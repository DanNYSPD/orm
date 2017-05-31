package lindan.nyspd.orm;

import java.util.List;

import lindan.nyspd.orm.engine.java.ClassHelperJava;
import lindan.nyspd.orm.engine.java.JavaWriter;
import lindan.nyspd.orm.models.java.JavaClass;
import lindan.nyspd.orm.models.java.JavaPackage;
import lindan.nyspd.orm.models.visualParadigm.DBTable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Daniel, this is your firt xml reader program" );
      //  new ReadXML().readXML("C:/Users/daniel/workspace/eclipseNeon/orm/resources/xmlP.xml");
      List<DBTable> scheme=  new ReadXML().generateSchemeFromXML("C:/Users/daniel/workspace/eclipseNeon/orm/resources/xmlP.xml");
      
      ClassHelperJava helperJava= new ClassHelperJava(scheme);
      
      JavaPackage javaPackage=helperJava.createPackage();
      
      for (JavaClass j: javaPackage.getClasses()){
    	  JavaWriter javaWriter = new JavaWriter();
    	  String classString=javaWriter.writeClass(j);
    	  System.out.println(classString);
      }
    //  javaPackage.getClasses().forEach(action);
      
    
      
    }
}
