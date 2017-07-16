public class tbAlumno{
	private int idAlumno;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String sexo;
	private String noControl;
	private int Column;
	private int idCarrera;

	public int getIdAlumno(){
		return this.idAlumno;
	}
	public void setIdAlumno(int idAlumno){
		this.idAlumno=idAlumno;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getPrimerApellido(){
		return this.primerApellido;
	}
	public void setPrimerApellido(String primerApellido){
		this.primerApellido=primerApellido;
	}
	public String getSegundoApellido(){
		return this.segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido){
		this.segundoApellido=segundoApellido;
	}
	public String getSexo(){
		return this.sexo;
	}
	public void setSexo(String sexo){
		this.sexo=sexo;
	}
	public String getNoControl(){
		return this.noControl;
	}
	public void setNoControl(String noControl){
		this.noControl=noControl;
	}
	public int getColumn(){
		return this.Column;
	}
	public void setColumn(int Column){
		this.Column=Column;
	}
	public int getIdCarrera(){
		return this.idCarrera;
	}
	public void setIdCarrera(int idCarrera){
		this.idCarrera=idCarrera;
	}
}