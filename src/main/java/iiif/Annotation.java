package iiif;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder({
        "id",
        "type",
        "motivation",
        "target",
        "body"
})
public class Annotation {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type = "Annotation";

    @JsonProperty("motivation")
    private String motivation;

    @JsonProperty("target")
    private String target;

    @JsonProperty("body")
    private List<Body> body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public List<Body> getBody() {
        return body;
    }

    public void setBody(List<Body> body) {
        this.body = body;
    }
}