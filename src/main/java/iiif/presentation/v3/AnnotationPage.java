package iiif.presentation.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder({
        "id",
        "type",
        "items"
})
public class AnnotationPage {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type = "AnnotationPage";

    @JsonProperty("items")
    private List<Annotation> items;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public List<Annotation> getItems() {
        return items;
    }

    public void setItems(List<Annotation> items) {
        this.items = items;
    }
}