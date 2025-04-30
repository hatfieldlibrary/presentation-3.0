package iiif.resource;

public class AudioResource extends ContentResource {

    // check the spec
    public static final String TYPE = "audio";

    public AudioResource(String identifier) {
        super(identifier);
    }

    public AudioResource() {
        super(null);
    }

    @Override
    public String getType() {
        return TYPE;
    }
}
