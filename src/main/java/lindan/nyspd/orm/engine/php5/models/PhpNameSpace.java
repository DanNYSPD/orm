package lindan.nyspd.orm.engine.php5.models;

import java.util.ArrayList;
import java.util.List;


/**
 * clase modelo (entidad) de un php namespace,, contiene una lista de clases acosciadas
 * @author daniel
 *
 */
public class PhpNameSpace {

	String packageName="";
	List<Php5Class> classes=new ArrayList<>();
	
	
	public PhpNameSpace(String packageName, List<Php5Class> classes) {
		super();
		this.packageName = packageName;
		this.classes = classes;
	}
	public PhpNameSpace() {
		super();
		
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public List<Php5Class> getClasses() {
		return classes;
	}
	public void setClasses(List<Php5Class> classes) {
		this.classes = classes;
	}
}
