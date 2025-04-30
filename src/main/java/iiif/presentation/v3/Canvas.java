package iiif.presentation.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import iiif.presentation.v3.resource.ContentResource;

import java.util.List;
import java.util.Map;

@JsonPropertyOrder({
        "id",
        "type",
        "label",
        "height",
        "width",
        "duration",
        "items",
        "thumbnail",
        "content",
        "otherContent"
})
public class Canvas {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type = "Canvas";

    @JsonProperty("label")
    private String label;

    @JsonProperty("height")
    private int height;

    @JsonProperty("width")
    private int width;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("items")
    private List<AnnotationPage> items;

    @JsonProperty("thumbnail")
    private List<Thumbnail> thumbnail;

    @JsonProperty("content")
    private List<ContentResource> content;

    @JsonProperty("otherContent")
    private Map<String, Object> otherContent;

    public Canvas() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<AnnotationPage> getItems() {
        return items;
    }

    public void setItems(List<AnnotationPage> items) {
        this.items = items;
    }

    public List<Thumbnail> getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(List<Thumbnail> thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<ContentResource> getContent() {
        return content;
    }

    public void setContent(List<ContentResource> content) {
        this.content = content;
    }

    public Map<String, Object> getOtherContent() {
        return otherContent;
    }

    public void setOtherContent(Map<String, Object> otherContent) {
        this.otherContent = otherContent;
    }
}