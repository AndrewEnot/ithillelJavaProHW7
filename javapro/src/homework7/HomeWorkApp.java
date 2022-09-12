package homework7;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println(findSymbolOccurrence(null, 'o'));
        System.out.println(findWordPosition(null, null));
        System.out.println(stringReverse(null));
        System.out.println(isPalindrome(null));
        System.out.println(isPalindromeToo(null));
    }

    // TASK #1: Method return number of specific symbol in the string
    static int findSymbolOccurrence(String string, char symbol) {
        if (string == null) {
            return 0;
        }
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
        if (source == null || target == null) {
            return 0;
        }
        return source.indexOf(target);
    }

    //TASK #3: Method revers string
    static String stringReverse(String string) {
        if (string == null) {
            return "";
        }
        StringBuilder revers = new StringBuilder(string);
        return revers.reverse().toString();
    }

    //TASK #4: This group of methods detects is received string a Palindrome
    //First variant method created from blank
    static boolean isPalindrome(String string) {
        if (string == null) {
            return false;
        }
        StringBuilder stringNew = new StringBuilder();
        char[] stringArr = string.toCharArray();
        for (int i = stringArr.length - 1; i >= 0; i--) {
            stringNew.append(stringArr[i]);
        }
        return string.equalsIgnoreCase(stringNew.toString());
    }

    //Second variant uses already created in this class method stringReverse
    static boolean isPalindromeToo(String string) {
        if (string == null) {
            return false;
        }
        return string.equalsIgnoreCase(stringReverse(string));
    }
}
