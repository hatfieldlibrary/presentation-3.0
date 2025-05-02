package iiif.presentation.v3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import iiif.presentation.v3.Metadata;
import iiif.presentation.v3.language.LanguageMap;
import iiif.presentation.v3.validation.IIIFVocabulary;

import java.util.List;

@JsonPropertyOrder({
        "id",
        "type",
        "label",
        "metadata",
        "summary",
        "items",
        "thumbnail",
        "viewingDirection",
        "behavior",
        "startCanvas",
        "partOf"
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Range {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type = "Range";

    @JsonProperty("label")
    private LanguageMap label;

    @JsonProperty("metadata")
    private List<Metadata> metadata;

    @JsonProperty("summary")
    private LanguageMap summary;

    @JsonProperty("items")
    private List<Object> items; // Can be Canvases or other Ranges.  Use Object to avoid needing separate lists

    @JsonProperty("thumbnail")
    private List<Thumbnail> thumbnail;

    @JsonProperty("viewingDirection")
    private String viewingDirection;

    @JsonProperty("behavior")
    private List<String> behavior;

    @JsonProperty("startCanvas")
    private String startCanvas;

    @JsonProperty("partOf")
    private List<PartOf> partOf;

    // Extension properties can be added with @JsonProperty

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

    public List<Metadata> getMetadata() {
        return metadata;
    }

    public void setMetadata(List<Metadata> metadata) {
        this.metadata = metadata;
    }

    public LanguageMap getSummary() {
        return summary;
    }

    public void setSummary(LanguageMap summary) {
        this.summary = summary;
    }

    public List<Object> getItems() {
        return items;
    }

    public void setItems(List<Object> items) {
        this.items = items;
    }

    public List<Thumbnail> getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(List<Thumbnail> thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getViewingDirection() {
        return viewingDirection;
    }

    public void setViewingDirection(String viewingDirection) {
        this.viewingDirection = viewingDirection;
    }

    public List<String> getBehavior() {
        return behavior;
    }

    public void setBehavior(List<String> behavior) {
        this.behavior = behavior;
    }

    public String getStartCanvas() {
        return startCanvas;
    }

    public void setStartCanvas(String startCanvas) {
        this.startCanvas = startCanvas;
    }

    public List<PartOf> getPartOf() {
        return partOf;
    }

    public void setPartOf(List<PartOf> partOf) {
        this.partOf = partOf;
    }

    // Validation method for IIIF Presentation API 3.0 conformance
    public boolean isValid() {
        // Check for required properties
        if (id == null || type == null || items == null) {
            return false;
        }
        // Validate type
        if (!type.equals("Range")) {
            return false;
        }
        // Validate label and summary structure (LanguageMap)
        if (label == null || label.isEmpty()) {
            return false;
        }
        if (summary != null && summary.isEmpty()) {
            return false;
        }
        // Validate items -  Check that items are valid
        if (items != null) {
            for (Object item : items) {
                if (!(item instanceof Canvas || item instanceof Range)) {
                    return false;
                }
            }
        }
        // Validate viewingDirection
        if (viewingDirection != null && !isValidViewingDirection(viewingDirection)) {
            return false;
        }
        // Validate behavior.
        return behavior == null || IIIFVocabulary.isValidBehaviorCombination(type, behavior);
        // If all checks pass, the Range is considered valid
    }

    private boolean isValidViewingDirection(String viewingDirection) {
        return viewingDirection.equals("left-to-right") ||
                viewingDirection.equals("right-to-left") ||
                viewingDirection.equals("top-to-bottom") ||
                viewingDirection.equals("bottom-to-top");
    }
}
