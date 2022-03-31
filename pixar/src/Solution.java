/*
 * Click `Run` to execute the snippet below!
 */

import java.util.List;
import java.util.Map;

class Problem {
    public static Map<String, List<String>> bodyParts = Map.of(
            "head", List.of("brain", "ear", "nose"),
            "torso", List.of("kidney", "heart", "lungs"),
            "legs", List.of("knee", "toe")
    );
}

class Solution {
    public static void main(String[] args) {
        // Put your solution here, for example:
        System.out.println("Body Parts: ");
        Problem.bodyParts.forEach((bodyPart, subParts) ->
        {
            System.out.println("\n" + bodyPart + ":");
            int subPartsSize = subParts.size();
            for (int i = 0; i < subPartsSize; i++) {
                String actuallSubPart = subParts.get(i);
                if (i < subPartsSize - 2) {
                    System.out.print(actuallSubPart + ", ");
                } else if (i == subPartsSize - 2) {
                    System.out.print(actuallSubPart + " end ");
                } else if (i == subPartsSize - 1) {
                    System.out.print(actuallSubPart + "\n ");

                }

            }
        });
    }
}