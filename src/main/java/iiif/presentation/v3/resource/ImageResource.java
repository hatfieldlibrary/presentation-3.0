package iiif.presentation.v3.resource;

public class ImageResource extends ContentResource {

    // check the spec
    public static final String TYPE = "image";

    public ImageResource(String identifier) {
        super(identifier);
    }

    public ImageResource() {
        super(null);
    }

    @Override
    public String getType() {
        return TYPE;
    }

}
