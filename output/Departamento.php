<?php
class Departamento{
	private  $idDepartamento;
	private  $descripcionDepartamento;
	private  $Column;

	public function getIdDepartamento(){
		return $this->idDepartamento;
	}
	public  function setIdDepartamento($idDepartamento){
		$this->idDepartamento=$idDepartamento;
	}
	public function getDescripcionDepartamento(){
		return $this->descripcionDepartamento;
	}
	public  function setDescripcionDepartamento($descripcionDepartamento){
		$this->descripcionDepartamento=$descripcionDepartamento;
	}
	public function getColumn(){
		return $this->Column;
	}
	public  function setColumn($Column){
		$this->Column=$Column;
	}
}
?>