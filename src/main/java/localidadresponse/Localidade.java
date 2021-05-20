
package localidadresponse;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "categoria",
    "centroide",
    "departamento",
    "id",
    "localidad_censal",
    "municipio",
    "nombre",
    "provincia"
})
public class Localidade {

    @JsonProperty("categoria")
    private String categoria;
    @JsonProperty("centroide")
    private Centroide centroide;
    @JsonProperty("departamento")
    private Departamento departamento;
    @JsonProperty("id")
    private String id;
    @JsonProperty("localidad_censal")
    private LocalidadCensal localidadCensal;
    @JsonProperty("municipio")
    private Municipio municipio;
    @JsonProperty("nombre")
    private String nombre;
    @JsonProperty("provincia")
    private Provincia provincia;

    /**
     * 
     * @return
     *     The categoria
     */
    @JsonProperty("categoria")
    public String getCategoria() {
        return categoria;
    }

    /**
     * 
     * @param categoria
     *     The categoria
     */
    @JsonProperty("categoria")
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * 
     * @return
     *     The centroide
     */
    @JsonProperty("centroide")
    public Centroide getCentroide() {
        return centroide;
    }

    /**
     * 
     * @param centroide
     *     The centroide
     */
    @JsonProperty("centroide")
    public void setCentroide(Centroide centroide) {
        this.centroide = centroide;
    }

    /**
     * 
     * @return
     *     The departamento
     */
    @JsonProperty("departamento")
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * 
     * @param departamento
     *     The departamento
     */
    @JsonProperty("departamento")
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The localidadCensal
     */
    @JsonProperty("localidad_censal")
    public LocalidadCensal getLocalidadCensal() {
        return localidadCensal;
    }

    /**
     * 
     * @param localidadCensal
     *     The localidad_censal
     */
    @JsonProperty("localidad_censal")
    public void setLocalidadCensal(LocalidadCensal localidadCensal) {
        this.localidadCensal = localidadCensal;
    }

    /**
     * 
     * @return
     *     The municipio
     */
    @JsonProperty("municipio")
    public Municipio getMunicipio() {
        return municipio;
    }

    /**
     * 
     * @param municipio
     *     The municipio
     */
    @JsonProperty("municipio")
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    /**
     * 
     * @return
     *     The nombre
     */
    @JsonProperty("nombre")
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre
     *     The nombre
     */
    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return
     *     The provincia
     */
    @JsonProperty("provincia")
    public Provincia getProvincia() {
        return provincia;
    }

    /**
     * 
     * @param provincia
     *     The provincia
     */
    @JsonProperty("provincia")
    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

}
