<?php
class Salone{
	private  $idSalon;
	private  $numSalon;
	private  $claveSalon;

	public function getIdSalon(){
		return $this->idSalon;
	}
	public  function setIdSalon($idSalon){
		$this->idSalon=$idSalon;
	}
	public function getNumSalon(){
		return $this->numSalon;
	}
	public  function setNumSalon($numSalon){
		$this->numSalon=$numSalon;
	}
	public function getClaveSalon(){
		return $this->claveSalon;
	}
	public  function setClaveSalon($claveSalon){
		$this->claveSalon=$claveSalon;
	}
}
?>