package infrastructure.web;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.validation.FieldError;

import java.util.List;

/**
 * Created by Damian on 13.08.2017
 */

public class JsonResponse {

    @JsonProperty
    private final JsonResponseType jsonResponseType;

    @JsonProperty
    private final List<String> message;

    public JsonResponse(JsonResponseType jsonResponseType, List<String> message) {
        this.jsonResponseType = jsonResponseType;
        this.message = message;
    }
}
