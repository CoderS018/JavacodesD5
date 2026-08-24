import java.util.HashMap;
import java.util.Map;
public class duptest8 {
    public static void findDuplicates(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            if (ch == ' ') continue;
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Duplicate characters in \"" + str + "\":");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() + " times");
            }
        }
    }
    public static void main(String[] args) {
        String word = "programming";
        findDuplicates(word);
    }
}
    