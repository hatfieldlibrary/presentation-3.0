package iiif.presentation.v3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import iiif.presentation.v3.language.LanguageMap;

import java.util.List;

@JsonPropertyOrder({
        "id",
        "type",
        "profile",
        "label",
        "service"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Service {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("profile")
    private String profile;

    @JsonProperty("label")
    private LanguageMap label; // Services can have multilingual labels

    @JsonProperty("service")
    private List<Service> service; // Can be a List of nested java.iiif.Service objects

    public Service() {
    }

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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public LanguageMap getLabel() {
        return label;
    }

    public void setLabel(LanguageMap label) {
        this.label = label;
    }

    public List<Service> getService() {
        return service;
    }

    public void setService(List<Service> service) {
        this.service = service;
    }
}