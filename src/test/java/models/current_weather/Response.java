package models.current_weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Response {
    @JsonProperty("request")
    private Request request;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("current")
    private Current current;
}
