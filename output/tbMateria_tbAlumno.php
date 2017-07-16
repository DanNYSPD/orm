<?php
class tbMateria_tbAlumno{
	private  $idMateria;
	private  $idAlumno;
	private  $calificacion;
	private  $estado;
	private  $numIntentos;

	public function getIdMateria(){
		return $this->idMateria;
	}
	public  function setIdMateria($idMateria){
		$this->idMateria=$idMateria;
	}
	public function getIdAlumno(){
		return $this->idAlumno;
	}
	public  function setIdAlumno($idAlumno){
		$this->idAlumno=$idAlumno;
	}
	public function getCalificacion(){
		return $this->calificacion;
	}
	public  function setCalificacion($calificacion){
		$this->calificacion=$calificacion;
	}
	public function getEstado(){
		return $this->estado;
	}
	public  function setEstado($estado){
		$this->estado=$estado;
	}
	public function getNumIntentos(){
		return $this->numIntentos;
	}
	public  function setNumIntentos($numIntentos){
		$this->numIntentos=$numIntentos;
	}
}
?>