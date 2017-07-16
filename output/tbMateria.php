<?php
class tbMateria{
	private  $idMateria;
	private  $descripcion;
	private  $Clave;
	private  $Estado;

	public function getIdMateria(){
		return $this->idMateria;
	}
	public  function setIdMateria($idMateria){
		$this->idMateria=$idMateria;
	}
	public function getDescripcion(){
		return $this->descripcion;
	}
	public  function setDescripcion($descripcion){
		$this->descripcion=$descripcion;
	}
	public function getClave(){
		return $this->Clave;
	}
	public  function setClave($Clave){
		$this->Clave=$Clave;
	}
	public function getEstado(){
		return $this->Estado;
	}
	public  function setEstado($Estado){
		$this->Estado=$Estado;
	}
}
?>