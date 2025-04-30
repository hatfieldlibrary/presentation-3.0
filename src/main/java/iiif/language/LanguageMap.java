package iiif.language;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class LanguageMap extends java.util.HashMap<String, List<String>> {
    // Inherits the functionality of a Map where the key is a String (language code)
    // and the value is a List of Strings (text for that language).

    // You might add convenience methods if needed, but the basic Map functionality
    // should suffice for Jackson serialization.
}