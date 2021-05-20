package ar.globallogic.dto;

import java.util.List;

import ar.globallogic.dto.type.Localidad;

public class LocalidadesConsulta {
	private Integer cantidad;
	private List<Localidad> localidades;
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public List<Localidad> getLocalidad() {
		return localidades;
	}
	public void setLocalidades(List<Localidad> localidades) {
		this.localidades = localidades;
	}	
}
