<?php
class tbPlanEstudio{
	private  $idPlanEstudio;
	private  $descripcionPlan;

	public function getIdPlanEstudio(){
		return $this->idPlanEstudio;
	}
	public  function setIdPlanEstudio($idPlanEstudio){
		$this->idPlanEstudio=$idPlanEstudio;
	}
	public function getDescripcionPlan(){
		return $this->descripcionPlan;
	}
	public  function setDescripcionPlan($descripcionPlan){
		$this->descripcionPlan=$descripcionPlan;
	}
}
?>