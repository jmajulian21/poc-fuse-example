
package localidadresponse;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "cantidad",
    "inicio",
    "localidades",
    "parametros",
    "total"
})
public class LocalidadResponse {

    @JsonProperty("cantidad")
    private int cantidad;
    @JsonProperty("inicio")
    private int inicio;
    @JsonProperty("localidades")
    private List<Localidade> localidades = new ArrayList<Localidade>();
    @JsonProperty("parametros")
    private Parametros parametros;
    @JsonProperty("total")
    private int total;

    /**
     * 
     * @return
     *     The cantidad
     */
    @JsonProperty("cantidad")
    public int getCantidad() {
        return cantidad;
    }

    /**
     * 
     * @param cantidad
     *     The cantidad
     */
    @JsonProperty("cantidad")
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * 
     * @return
     *     The inicio
     */
    @JsonProperty("inicio")
    public int getInicio() {
        return inicio;
    }

    /**
     * 
     * @param inicio
     *     The inicio
     */
    @JsonProperty("inicio")
    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    /**
     * 
     * @return
     *     The localidades
     */
    @JsonProperty("localidades")
    public List<Localidade> getLocalidades() {
        return localidades;
    }

    /**
     * 
     * @param localidades
     *     The localidades
     */
    @JsonProperty("localidades")
    public void setLocalidades(List<Localidade> localidades) {
        this.localidades = localidades;
    }

    /**
     * 
     * @return
     *     The parametros
     */
    @JsonProperty("parametros")
    public Parametros getParametros() {
        return parametros;
    }

    /**
     * 
     * @param parametros
     *     The parametros
     */
    @JsonProperty("parametros")
    public void setParametros(Parametros parametros) {
        this.parametros = parametros;
    }

    /**
     * 
     * @return
     *     The total
     */
    @JsonProperty("total")
    public int getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    @JsonProperty("total")
    public void setTotal(int total) {
        this.total = total;
    }

}
