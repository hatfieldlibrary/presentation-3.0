package iiif.presentation.v3.validation;

import iiif.presentation.v3.behavior.Behavior;
import java.util.List;

public class IIIFVocabulary {

    public static boolean isValidBehaviorCombination(String type, List<String> behaviors) {
        if (behaviors == null || behaviors.isEmpty()) {
            return true; // No behaviors is often valid
        }

        for (String behavior : behaviors) {
            if (!isValidBehavior(behavior))
                return false;
        }
        if ("Collection".equals(type)) {
            for (String behavior: behaviors){
                if (!Behavior.validCollectionBehaviors().contains(behavior)){
                    return false;
                }
            }
        }
        if ("Manifest".equals(type)) {
            for (String behavior: behaviors){
                if (!Behavior.validManifestBehaviors().contains(behavior)){
                    return false;
                }
            }
        }
        if ("Canvas".equals(type)){
            for (String behavior: behaviors){
                if (!Behavior.validCanvasBehaviors().contains(behavior)){
                    return false;
                }
            }
        }
        if ("Range".equals(type)) {
            for (String behavior: behaviors){
                if (!Behavior.validRangeBehaviors().contains(behavior)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isValidBehavior(String behavior) {
        return Behavior.validValues().contains(behavior);
    }

}
