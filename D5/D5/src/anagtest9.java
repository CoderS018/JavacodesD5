import java.util.Arrays;
import java.util.Scanner;
public class anagtest9 {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first word/phrase: ");
        String first = scanner.nextLine();
        System.out.print("Enter the second word/phrase: ");
        String second = scanner.nextLine();
        if (isAnagram(first, second)) {
            System.out.println("\"" + first + "\" and \"" + second + "\" are anagrams.");
        } else {
            System.out.println("\"" + first + "\" and \"" + second + "\" are NOT anagrams.");
        }
        scanner.close();
    }
}

