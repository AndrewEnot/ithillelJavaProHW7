package homework7;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println(findSymbolOccurrence("Apoolo", 'o'));
        System.out.println(findWordPosition("Agrigate", "polo"));
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("Allo"));
        System.out.println(isPalindromeToo("Eye"));
    }

    // TASK #1: Method return number of specific symbol in the string
    static int findSymbolOccurrence(String string, char symbol) {
        int result = 0;
        for (char c : string.toCharArray()) {
            if (c == symbol) {
                result += 1;
            }
        }
        return result;
    }

    //TASK #2: Method returns index of first symbol of substring 'target' in string 'source'
    static int findWordPosition(String source, String target) {
        if (source.contains(target)) {
            return source.indexOf(target);
        }
        return -1;
    }

    //TASK #3: Method revers string
    static String stringReverse(String string) {
        StringBuilder revers = new StringBuilder();
        for (char c : string.toCharArray()) {
            revers.append(c);
        }
        return revers.reverse().toString();
    }

    //TASK #4: This group of methods detects is received string a Palindrome
    //First variant method created from blank
    static boolean isPalindrome(String string) {
        StringBuilder stringNew = new StringBuilder();
        char[] stringArr = string.toCharArray();
        for (int i = stringArr.length - 1; i >= 0; i--) {
            stringNew.append(stringArr[i]);
        }
        return string.equalsIgnoreCase(stringNew.toString());
    }

    //Second variant uses already created in this class method stringReverse
    static boolean isPalindromeToo(String string) {
        return string.equalsIgnoreCase(stringReverse(string));
    }
}
