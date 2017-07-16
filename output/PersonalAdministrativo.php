<?php
class PersonalAdministrativo{
	private  $idPersonalAdministrativo;
	private  $descripcion;

	public function getIdPersonalAdministrativo(){
		return $this->idPersonalAdministrativo;
	}
	public  function setIdPersonalAdministrativo($idPersonalAdministrativo){
		$this->idPersonalAdministrativo=$idPersonalAdministrativo;
	}
	public function getDescripcion(){
		return $this->descripcion;
	}
	public  function setDescripcion($descripcion){
		$this->descripcion=$descripcion;
	}
}
?>