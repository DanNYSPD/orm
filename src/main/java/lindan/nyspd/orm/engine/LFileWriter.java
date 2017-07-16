package lindan.nyspd.orm.engine;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import lindan.nyspd.orm.engine.java.LanguageTypes.LanguagesExtensions;


/**
 * clase encarda de recibir modelos de clase y escribir el archivo
 * @author daniel
 *
 */
public class LFileWriter {
	String extension=".php";
	private String path="C:/Users/daniel/workspace/eclipseNeon/orm/output/";
	
		public  LFileWriter(Language language,String path) {
		this(language);
		setPath(path);
	}
		/**
		 * 
		 * @param language Lenguaje objetivo a escribir en archivo
		 */
	public LFileWriter(Language language) {
		switch (language) {
		case PHP5:
			extension=LanguagesExtensions.PHP;
			break;
		case JAVA:
			extension=LanguagesExtensions.JAVA;
			break;
		case C_SHARP:
			extension=LanguagesExtensions.C_SHARP;
			break;
		default:
			extension=".unknown";
			break;
		}
	}
	
	/**
	 * recibe una lista de classes y escribe (sobresscribe si existe) cada clase en un archivo
	 * El nombre del archivo es el nombre de la clase. Este metodo es agnosta de lenguajeobjetivo
	 * @param javaClass
	 */
	public void WriteClases(List<? extends ClassBase> javaClass){
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
	
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
