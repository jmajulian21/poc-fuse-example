package ar.globallogic.dto;

import java.util.List;

import ar.globallogic.dto.type.Municipio;

public class MunicipiosConsulta {
	private Integer cantidad;
	private List<Municipio> municipios;
	
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public List<Municipio> getMunicipios() {
		return municipios;
	}
}
