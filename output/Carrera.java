public class Carrera{
	private int idCarrera;
	private String claveCarrera;
	private String nombreCarrera;
	private int idPlanEstudio;

	public int getIdCarrera(){
		return this.idCarrera;
	}
	public void setIdCarrera(int idCarrera){
		this.idCarrera=idCarrera;
	}
	public String getClaveCarrera(){
		return this.claveCarrera;
	}
	public void setClaveCarrera(String claveCarrera){
		this.claveCarrera=claveCarrera;
	}
	public String getNombreCarrera(){
		return this.nombreCarrera;
	}
	public void setNombreCarrera(String nombreCarrera){
		this.nombreCarrera=nombreCarrera;
	}
	public int getIdPlanEstudio(){
		return this.idPlanEstudio;
	}
	public void setIdPlanEstudio(int idPlanEstudio){
		this.idPlanEstudio=idPlanEstudio;
	}
}