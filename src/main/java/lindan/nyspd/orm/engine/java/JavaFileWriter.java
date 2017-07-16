package lindan.nyspd.orm.engine.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import lindan.nyspd.orm.engine.java.models.JavaClass;

/**
 * Clase encargada de escribir archivos tipoJava
 * @author daniel
 *
 */
public class JavaFileWriter {
	final String extension=".java";
	private String path="C:/Users/daniel/workspace/eclipseNeon/orm/output/";
	public void WriteClases(List<JavaClass> javaClass){
		javaClass.forEach(x->{
			writeClass(x.toString(), x.getNameClass());
		});
	}
	public void writeClass(String classString,String name) {
		try(BufferedWriter writer = new BufferedWriter( new FileWriter( path+name+extension));){			
			writer.write( classString);		
			writer.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
