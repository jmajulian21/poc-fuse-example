
package errorresponse;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "codigoError",
    "tipoError",
    "descripcion"
})
public class Error {

    @JsonProperty("codigoError")
    private String codigoError;
    @JsonProperty("tipoError")
    private String tipoError;
    @JsonProperty("descripcion")
    private String descripcion;

    /**
     * 
     * @return
     *     The codigoError
     */
    @JsonProperty("codigoError")
    public String getCodigoError() {
        return codigoError;
    }

    /**
     * 
     * @param codigoError
     *     The codigoError
     */
    @JsonProperty("codigoError")
    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    /**
     * 
     * @return
     *     The tipoError
     */
    @JsonProperty("tipoError")
    public String getTipoError() {
        return tipoError;
    }

    /**
     * 
     * @param tipoError
     *     The tipoError
     */
    @JsonProperty("tipoError")
    public void setTipoError(String tipoError) {
        this.tipoError = tipoError;
    }

    /**
     * 
     * @return
     *     The descripcion
     */
    @JsonProperty("descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * 
     * @param descripcion
     *     The descripcion
     */
    @JsonProperty("descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
