<?php
class Laboratorio{
	private  $idLaboratorio;
	private  $descripcion;

	public function getIdLaboratorio(){
		return $this->idLaboratorio;
	}
	public  function setIdLaboratorio($idLaboratorio){
		$this->idLaboratorio=$idLaboratorio;
	}
	public function getDescripcion(){
		return $this->descripcion;
	}
	public  function setDescripcion($descripcion){
		$this->descripcion=$descripcion;
	}
}
?>