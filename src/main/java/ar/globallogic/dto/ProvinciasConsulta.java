package ar.globallogic.dto;

import java.util.List;

import com.google.gson.Gson;

import ar.globallogic.dto.type.Provincia;

public class ProvinciasConsulta {
	private Integer cantidad;
	private List<Provincia> provincias;
	
	public ProvinciasConsulta convertJsonToObject(String body) {
		Gson g = new Gson(); 
		ProvinciasConsulta prov = g.fromJson(body,ProvinciasConsulta.class);
		return prov;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public List<Provincia> getProvincias() {
		return provincias;
	}
	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}
}
