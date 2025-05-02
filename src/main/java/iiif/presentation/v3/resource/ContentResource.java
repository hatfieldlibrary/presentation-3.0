package iiif.presentation.v3.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import iiif.presentation.v3.Service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@JsonPropertyOrder({
        "id",
        "type",
        "format",
        "height",
        "width",
        "duration",
        "label",
        "language",
        "service"
})
public abstract class ContentResource {

    @JsonProperty("id")
    private URI id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("format")
    private String format;

    @JsonProperty("height")
    private int height;

    @JsonProperty("width")
    private int width;

    @JsonProperty("duration")
    private int duration;

    @JsonProperty("label")
    private String label;

    @JsonProperty("language")
    private String language;

    @JsonProperty("service")
    private List<Service> service; // Can be a List of java.iiif.Service objects

    // For any properties not explicitly defined in the IIIF specification
    @JsonProperty("@context") // While not standard on ContentResource, might be used in extensions
    private String context;
    @JsonProperty("profile") // Might be relevant for some content resources
    private String profile;
    @JsonProperty("processing") // Example of an extension property
    private String processing;

    // what is this? Gemini seems to have invented it...
    private Map<String, Object> otherProperties;

    @JsonCreator
    public ContentResource(@JsonProperty("id") String identifier) {
        if (identifier != null) {
            this.id = URI.create(identifier);
        } else {
            this.id = null;
        }
    }

    public URI getIdentifier() {
        return this.id;
    }

    protected void setIdentifier(URI identifier) {
        this.id = identifier;
    }

    @JsonProperty("type") // Ensure the abstract getType is serialized as "type"
    public abstract String getType();

    protected void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Service> getService() {
        return service;
    }

    public void setService(List<Service> service) {
        this.service = service;
    }

    // Getter and setter for potential extension properties
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getProcessing() {
        return processing;
    }

    public void setProcessing(String processing) {
        this.processing = processing;
    }


    @JsonProperty("otherProperties") // Serialize the map under "otherProperties"
    public Map<String, Object> getOtherProperties() {
        return otherProperties;
    }

    @JsonProperty("otherProperties")
    public void setOtherProperties(Map<String, Object> otherProperties) {
        this.otherProperties = otherProperties;
    }

    public boolean isValid() {

        // Basic required properties check
        if (id == null || type == null ) {
            return false;
        }

        // Validate 'type'
        List<String> validTypes = Arrays.asList("text", "image", "audio", "video");
        if (!validTypes.contains(type)) {
            return false;
        }


        // Validate 'behavior' values
        if (behavior != null) {
            List<String> validBehaviors = Arrays.asList("auto-advance", "continuous", "individuals", "paged", "repeat", "unordered");
            for (String be : behavior) {
                if (!validBehaviors.contains(be)) {
                    return false;
                }
            }
        }

        // 4. Add more complex validation rules as needed
        //    - Check for mutual exclusivity of properties
        //    - Validate the structure and content of nested objects (e.g., metadata)
        //    - Ensure required sub-properties are present

        return true;
    }

}