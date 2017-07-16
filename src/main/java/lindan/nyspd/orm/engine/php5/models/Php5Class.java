package lindan.nyspd.orm.engine.php5.models;

import java.util.ArrayList;
import java.util.List;

import lindan.nyspd.orm.engine.ClassBase;


/**
 * clase que modela una clase de php, contiene los atirbutos(classMember) y anotaciones
 * @author daniel
 *
 */
public class Php5Class extends ClassBase {
	 List<Php5ClassMember> members;
	 List<String> classAnottations= new ArrayList<String>();
	public List<Php5ClassMember> getMembers() {
		return members;
	}
	public void setMembers(List<Php5ClassMember> members) {
		this.members = members;
	}
	public List<String> getClassAnottations() {
		return classAnottations;
	}
	public void setClassAnottations(List<String> classAnottations) {
		this.classAnottations = classAnottations;
	}
}
