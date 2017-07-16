package lindan.nyspd.orm;

import java.util.ArrayList;
import java.util.List;

import lindan.nyspd.orm.engine.java.JavaMapper;
import lindan.nyspd.orm.engine.java.models.JavaClass;
import lindan.nyspd.orm.engine.java.models.JavaPackage;
import lindan.nyspd.orm.engine.LFileWriter;
import lindan.nyspd.orm.engine.Language;
import lindan.nyspd.orm.engine.java.IJavaClassToString;
import lindan.nyspd.orm.engine.java.JavaClassToString;
import lindan.nyspd.orm.engine.java.JavaFileWriter;
import lindan.nyspd.orm.models.visualParadigm.DBTable;

/**
 * Falta agregar para java anotaciones JPA (javax.persistence)
 * Falta agregar sql automaticos para opciones basicas:
 *  insertar uno (add)
 *  consultar todos getAll
 *  consultar uno get
 *  eliminar	delete
 */
public class AppJava 
{
    public static void main( String[] args )
    {
      System.out.println( "Hello Daniel, this is your firt xml reader program" );
      //  new ReadXML().readXML("C:/Users/daniel/workspace/eclipseNeon/orm/resources/xmlP.xml");
      List<DBTable> scheme=  new ReadXML().generateSchemeFromXML("C:/Users/daniel/workspace/eclipseNeon/orm/resources/xmlP.xml");
      
      
      JavaMapper helperJava= new JavaMapper(scheme);
      
      JavaPackage javaPackage=helperJava.createPackage();
      IJavaClassToString javaWriter = new JavaClassToString();
      javaWriter.setStringToPackage(javaPackage);
      
      LFileWriter fileWriter= new LFileWriter(Language.JAVA);
      fileWriter.WriteClases(javaPackage.getClasses());
      
    
      
    }
}
