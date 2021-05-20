
package errorresponse;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "error"
})
public class ErrorResponse {

    @JsonProperty("error")
    private Error error;

    /**
     * 
     * @return
     *     The error
     */
    @JsonProperty("error")
    public Error getError() {
        return error;
    }

    /**
     * 
     * @param error
     *     The error
     */
    @JsonProperty("error")
    public void setError(Error error) {
        this.error = error;
    }

}
