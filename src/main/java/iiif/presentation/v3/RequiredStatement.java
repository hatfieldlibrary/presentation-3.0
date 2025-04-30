package iiif.presentation.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import iiif.presentation.v3.language.LanguageMap;

@JsonPropertyOrder({
        "label",
        "value"
})
public class RequiredStatement {

    @JsonProperty("label")
    private LanguageMap label;

    @JsonProperty("value")
    private LanguageMap value;

    public LanguageMap getLabel() {
        return label;
    }

    public void setLabel(LanguageMap label) {
        this.label = label;
    }

    public LanguageMap getValue() {
        return value;
    }

    public void setValue(LanguageMap value) {
        this.value = value;
    }
}
