
package provinciaresponse;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "fecha",
    "hora",
    "provincia"
})
public class ProvinciaResponse {

    @JsonProperty("fecha")
    private String fecha;
    @JsonProperty("hora")
    private String hora;
    @JsonProperty("provincia")
    private Provincia provincia;

    /**
     * 
     * @return
     *     The fecha
     */
    @JsonProperty("fecha")
    public String getFecha() {
        return fecha;
    }

    /**
     * 
     * @param fecha
     *     The fecha
     */
    @JsonProperty("fecha")
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * 
     * @return
     *     The hora
     */
    @JsonProperty("hora")
    public String getHora() {
        return hora;
    }

    /**
     * 
     * @param hora
     *     The hora
     */
    @JsonProperty("hora")
    public void setHora(String hora) {
        this.hora = hora;
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
