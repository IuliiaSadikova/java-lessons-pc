package algorithms.hw_1007;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    public static void main(String[] args) {

        String text = "Каждый охотник желает знать где сидит фазан";
        Map<Character, Integer> map = letterFrequency(text);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }



    }

    public static Map<Character, Integer> letterFrequency(String text) {
        Map<Character, Integer> map = new HashMap<>();
        String textWithLowerCase = text.toLowerCase();
        for (int i = 0; i < textWithLowerCase.length(); i++) {
            char letter = textWithLowerCase.charAt(i);
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }
        return map;
    }

}
