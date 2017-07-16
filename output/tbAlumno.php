<?php
class tbAlumno{
	private  $idAlumno;
	private  $nombre;
	private  $primerApellido;
	private  $segundoApellido;
	private  $sexo;
	private  $noControl;
	private  $Column;
	private  $idCarrera;

	public function getIdAlumno(){
		return $this->idAlumno;
	}
	public  function setIdAlumno($idAlumno){
		$this->idAlumno=$idAlumno;
	}
	public function getNombre(){
		return $this->nombre;
	}
	public  function setNombre($nombre){
		$this->nombre=$nombre;
	}
	public function getPrimerApellido(){
		return $this->primerApellido;
	}
	public  function setPrimerApellido($primerApellido){
		$this->primerApellido=$primerApellido;
	}
	public function getSegundoApellido(){
		return $this->segundoApellido;
	}
	public  function setSegundoApellido($segundoApellido){
		$this->segundoApellido=$segundoApellido;
	}
	public function getSexo(){
		return $this->sexo;
	}
	public  function setSexo($sexo){
		$this->sexo=$sexo;
	}
	public function getNoControl(){
		return $this->noControl;
	}
	public  function setNoControl($noControl){
		$this->noControl=$noControl;
	}
	public function getColumn(){
		return $this->Column;
	}
	public  function setColumn($Column){
		$this->Column=$Column;
	}
	public function getIdCarrera(){
		return $this->idCarrera;
	}
	public  function setIdCarrera($idCarrera){
		$this->idCarrera=$idCarrera;
	}
}
?>