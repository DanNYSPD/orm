package lindan.nyspd.orm.engine;




public class ClassBase {
	protected String nameClass="";
	/**
	 * Valor en string de esta clase para ser escrita en archivo .java
	 */
	protected String stringValue="";
	
	 
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public String toString() {
		return this.stringValue;
	}
	public void setString(String string) {
		this.stringValue=string;
	}
}
