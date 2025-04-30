package iiif.presentation.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import iiif.presentation.v3.language.LanguageMap;

@JsonPropertyOrder({
        "id",
        "type",
        "label"
})
public class Item { // A generic item within a Collection

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type; // Can be "Manifest" or "Collection"

    @JsonProperty("label")
    private LanguageMap label;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LanguageMap getLabel() {
        return label;
    }

    public void setLabel(LanguageMap label) {
        this.label = label;
    }
}