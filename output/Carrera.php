<?php
class Carrera{
	private  $idCarrera;
	private  $claveCarrera;
	private  $nombreCarrera;
	private  $idPlanEstudio;

	public function getIdCarrera(){
		return $this->idCarrera;
	}
	public  function setIdCarrera($idCarrera){
		$this->idCarrera=$idCarrera;
	}
	public function getClaveCarrera(){
		return $this->claveCarrera;
	}
	public  function setClaveCarrera($claveCarrera){
		$this->claveCarrera=$claveCarrera;
	}
	public function getNombreCarrera(){
		return $this->nombreCarrera;
	}
	public  function setNombreCarrera($nombreCarrera){
		$this->nombreCarrera=$nombreCarrera;
	}
	public function getIdPlanEstudio(){
		return $this->idPlanEstudio;
	}
	public  function setIdPlanEstudio($idPlanEstudio){
		$this->idPlanEstudio=$idPlanEstudio;
	}
}
?>