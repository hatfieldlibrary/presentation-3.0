package iiif.presentation.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
        "id",
        "type",
        "label",
        "format",
        "language"
})
public class Homepage {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type = "Text";

    @JsonProperty("label")
    private String label;

    @JsonProperty("format")
    private String format;

    @JsonProperty("language")
    private String language;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}