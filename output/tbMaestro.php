<?php
class tbMaestro{
	private  $idMaestro;
	private  $nombre;
	private  $genero;

	public function getIdMaestro(){
		return $this->idMaestro;
	}
	public  function setIdMaestro($idMaestro){
		$this->idMaestro=$idMaestro;
	}
	public function getNombre(){
		return $this->nombre;
	}
	public  function setNombre($nombre){
		$this->nombre=$nombre;
	}
	public function getGenero(){
		return $this->genero;
	}
	public  function setGenero($genero){
		$this->genero=$genero;
	}
}
?>