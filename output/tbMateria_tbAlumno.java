public class tbMateria_tbAlumno{
	private int idMateria;
	private int idAlumno;
	private  calificacion;
	private String estado;
	private int numIntentos;

	public int getIdMateria(){
		return this.idMateria;
	}
	public void setIdMateria(int idMateria){
		this.idMateria=idMateria;
	}
	public int getIdAlumno(){
		return this.idAlumno;
	}
	public void setIdAlumno(int idAlumno){
		this.idAlumno=idAlumno;
	}
	public  getCalificacion(){
		return this.calificacion;
	}
	public void setCalificacion( calificacion){
		this.calificacion=calificacion;
	}
	public String getEstado(){
		return this.estado;
	}
	public void setEstado(String estado){
		this.estado=estado;
	}
	public int getNumIntentos(){
		return this.numIntentos;
	}
	public void setNumIntentos(int numIntentos){
		this.numIntentos=numIntentos;
	}
}