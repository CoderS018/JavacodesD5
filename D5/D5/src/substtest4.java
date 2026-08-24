public class substtest4 {
    public static void main(String[] args) {
        String str = "abc";
        int count = 0;

        System.out.println("Substrings of \"" + str + "\":");

        // Outer loop determines the start index
        for (int i = 0; i < str.length(); i++) {
            // Inner loop determines the end index (exclusive)
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                System.out.println(sub);
                count++;
            }
        }

        System.out.println("\nTotal substrings: " + count);
    }
}
