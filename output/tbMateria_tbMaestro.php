<?php
class tbMateria_tbMaestro{
	private  $idMateria;
	private  $idMaestro;

	public function getIdMateria(){
		return $this->idMateria;
	}
	public  function setIdMateria($idMateria){
		$this->idMateria=$idMateria;
	}
	public function getIdMaestro(){
		return $this->idMaestro;
	}
	public  function setIdMaestro($idMaestro){
		$this->idMaestro=$idMaestro;
	}
}
?>