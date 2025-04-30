package iiif.resource;

public class VideoResource extends ContentResource{

    // check the spec
    public static final String TYPE = "video";

    public VideoResource(String identifier) {
        super(identifier);
    }

    public VideoResource() {
        super(null);
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
