package iiif.presentation.v3.language;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;

public class LanguageMap extends HashMap<String, List<String>> {

    public LanguageMap() {
        super(); // Calls the HashMap's default constructor
    }

    // Inherits the functionality of a Map where the key is a String (language code)
    // and the value is a List of Strings (text for that language).

    // You might add convenience methods if needed, but the basic Map functionality
    // should suffice for Jackson serialization.
}