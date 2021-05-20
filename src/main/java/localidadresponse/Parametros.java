
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
    "formato",
    "max",
    "provincia"
})
public class Parametros {

    @JsonProperty("formato")
    private String formato;
    @JsonProperty("max")
    private int max;
    @JsonProperty("provincia")
    private List<String> provincia = new ArrayList<String>();

    /**
     * 
     * @return
     *     The formato
     */
    @JsonProperty("formato")
    public String getFormato() {
        return formato;
    }

    /**
     * 
     * @param formato
     *     The formato
     */
    @JsonProperty("formato")
    public void setFormato(String formato) {
        this.formato = formato;
    }

    /**
     * 
     * @return
     *     The max
     */
    @JsonProperty("max")
    public int getMax() {
        return max;
    }

    /**
     * 
     * @param max
     *     The max
     */
    @JsonProperty("max")
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 
     * @return
     *     The provincia
     */
    @JsonProperty("provincia")
    public List<String> getProvincia() {
        return provincia;
    }

    /**
     * 
     * @param provincia
     *     The provincia
     */
    @JsonProperty("provincia")
    public void setProvincia(List<String> provincia) {
        this.provincia = provincia;
    }

}
