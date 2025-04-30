package iiif.presentation.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import iiif.presentation.v3.language.LanguageMap;

import java.util.List;

@JsonPropertyOrder({
        "@context",
        "id",
        "type",
        "label",
        "metadata",
        "summary",
        "requiredStatement",
        "rights",
        "logo",
        "homepage",
        "seeAlso",
        "service",
        "partOf",
        "collections",
        "manifests",
        "thumbnail",
        "items", // For ordered items in a Collection
        "supplementary"
})
public class Collection {

    @JsonProperty("@context")
    private String context = "http://iiif.io/api/presentation/3/context.json";

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type = "Collection";

    @JsonProperty("label")
    private LanguageMap label;

    @JsonProperty("metadata")
    private List<Metadata> metadata;

    @JsonProperty("summary")
    private LanguageMap summary;

    @JsonProperty("requiredStatement")
    private RequiredStatement requiredStatement;

    @JsonProperty("rights")
    private String rights;

    @JsonProperty("logo")
    private List<Logo> logo;

    @JsonProperty("homepage")
    private Homepage homepage;

    @JsonProperty("seeAlso")
    private List<SeeAlso> seeAlso;

    @JsonProperty("service")
    private List<Service> service;

    @JsonProperty("partOf")
    private List<PartOf> partOf;

    @JsonProperty("collections")
    private List<Collection> collections;

    @JsonProperty("manifests")
    private List<Manifest> manifests;

    @JsonProperty("thumbnail")
    private List<Thumbnail> thumbnail;

    @JsonProperty("items")
    private List<Item> items; // Use a generic Item to hold Manifests or Collections

    @JsonProperty("supplementary")
    private List<Collection> supplementary; // For related collections

    // Extension properties...


    public Collection() {
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

    public RequiredStatement getRequiredStatement() {
        return requiredStatement;
    }

    public void setRequiredStatement(RequiredStatement requiredStatement) {
        this.requiredStatement = requiredStatement;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public List<Logo> getLogo() {
        return logo;
    }

    public void setLogo(List<Logo> logo) {
        this.logo = logo;
    }

    public Homepage getHomepage() {
        return homepage;
    }

    public void setHomepage(Homepage homepage) {
        this.homepage = homepage;
    }

    public List<SeeAlso> getSeeAlso() {
        return seeAlso;
    }

    public void setSeeAlso(List<SeeAlso> seeAlso) {
        this.seeAlso = seeAlso;
    }

    public List<Service> getService() {
        return service;
    }

    public void setService(List<Service> service) {
        this.service = service;
    }

    public List<PartOf> getPartOf() {
        return partOf;
    }

    public void setPartOf(List<PartOf> partOf) {
        this.partOf = partOf;
    }

    public List<Collection> getCollections() {
        return collections;
    }

    public void setCollections(List<Collection> collections) {
        this.collections = collections;
    }

    public List<Manifest> getManifests() {
        return manifests;
    }

    public void setManifests(List<Manifest> manifests) {
        this.manifests = manifests;
    }

    public List<Thumbnail> getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(List<Thumbnail> thumbnail) {
        this.thumbnail = thumbnail;
    }

}