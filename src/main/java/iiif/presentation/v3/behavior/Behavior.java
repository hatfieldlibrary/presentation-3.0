package iiif.presentation.v3.behavior;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Behavior {
    AUTO_ADVANCE("auto-advance"),
    NO_AUTO_ADVANCE("no-auto-advance"),
    NO_NAV("no-nav"),
    CONTINUOUS("continuous"),
    INDIVIDUALS("individuals"),
    PAGED("paged"),
    NON_PAGED("non-paged"),
    FACING_PAGES("facing-pages"),
    MULTI_PART("multi-part"),
    HIDDEN("hidden"),
    REPEAT("repeat"),
    NO_REPEAT("no-repeat"),
    UNORDERED("unordered"),
    TOGETHER("together"),
    SEQUENCE("sequence"),
    THUMBNAIL_NAV("thumbnail-nav");

    private final String value;

    Behavior(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static List<String> validValues() {
        return Arrays.asList(
                AUTO_ADVANCE.getValue(),
                NO_AUTO_ADVANCE.getValue(),
                NO_NAV.getValue(),
                CONTINUOUS.getValue(),
                INDIVIDUALS.getValue(),
                PAGED.getValue(),
                FACING_PAGES.getValue(),
                REPEAT.getValue(),
                NO_REPEAT.getValue(),
                UNORDERED.getValue(),
                TOGETHER.getValue(),
                THUMBNAIL_NAV.getValue(),
                SEQUENCE.getValue()
        );
    }
    public static List<String> validManifestBehaviors(){
        return Collections.unmodifiableList(Arrays.asList(
                AUTO_ADVANCE.getValue(),
                CONTINUOUS.getValue(),
                INDIVIDUALS.getValue(),
                PAGED.getValue(),
                REPEAT.getValue(),
                NO_REPEAT.getValue(),
                UNORDERED.getValue()
        ));
    }
    public static List<String> validCollectionBehaviors(){
        return Collections.unmodifiableList(Arrays.asList(
                AUTO_ADVANCE.getValue(),
                NO_AUTO_ADVANCE.getValue(),
                CONTINUOUS.getValue(),
                INDIVIDUALS.getValue(),
                MULTI_PART.getValue(),
                PAGED.getValue(),
                REPEAT.getValue(),
                NO_REPEAT.getValue(),
                UNORDERED.getValue()
        ));
    }
    public static List<String> validCanvasBehaviors(){
        return Collections.unmodifiableList(Arrays.asList(
                AUTO_ADVANCE.getValue(),
                NO_AUTO_ADVANCE.getValue(),
                NON_PAGED.getValue(),
                FACING_PAGES.getValue()
//                    HIDDEN.getValue()
        ));
    }
    public static List<String> validRangeBehaviors(){
        return Collections.unmodifiableList(Arrays.asList(
                AUTO_ADVANCE.getValue(),
                NO_AUTO_ADVANCE.getValue(),
                NO_NAV.getValue(),
                CONTINUOUS.getValue(),
                INDIVIDUALS.getValue(),
                PAGED.getValue(),
                NON_PAGED.getValue(),
                SEQUENCE.getValue(),
                THUMBNAIL_NAV.getValue(),
                UNORDERED.getValue()
        ));
    }
}