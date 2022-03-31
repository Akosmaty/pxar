/*
 * Click `Run` to execute the snippet below!
 */

import java.util.List;
import java.util.Map;

class BeforeProblem {
    public static Map<String, List<String>> bodyParts = Map.of(
            "head", List.of("brain", "ear", "nose"),
            "torso", List.of("kidney", "heart", "lungs"),
            "legs", List.of("knee", "toe")
    );
}

class Before {
    public static void main(String[] args) {
        // Put your solution here, for example:
        System.out.println(BeforeProblem.bodyParts);

    }
}