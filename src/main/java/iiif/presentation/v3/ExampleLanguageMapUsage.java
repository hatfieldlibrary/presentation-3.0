package iiif.presentation.v3;

import iiif.presentation.v3.language.LanguageMap;

import java.util.List;

public class ExampleLanguageMapUsage {

    public static void main(String[] args) {
        LanguageMap labelMap = new LanguageMap();
        List<String> englishLabels = List.of("My Object Label");
        List<String> frenchLabels = List.of("L'étiquette de mon objet");
        labelMap.put("en", englishLabels);
        labelMap.put("fr", frenchLabels);

        Manifest manifest = new Manifest();
        manifest.setLabel(labelMap);

        Metadata metadataEntry = new Metadata();
        LanguageMap metadataLabelMap = new LanguageMap();
        metadataLabelMap.put("en", List.of("Title"));
        LanguageMap metadataValueMap = new LanguageMap();
        metadataValueMap.put("en", List.of("The Wonderful Manuscript"));
        metadataValueMap.put("fr", List.of("Le Magnifique Manuscrit"));
        metadataEntry.setLabel(metadataLabelMap);
        metadataEntry.setValue(metadataValueMap);

        manifest.setMetadata(List.of(metadataEntry));
        System.out.println(manifest.getMetadata().get(0).getLabel());
        System.out.println(manifest.getMetadata().get(0).getValue());
    }


}
