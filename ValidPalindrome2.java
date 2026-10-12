
class ValidPalindrome2 {

    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    static boolean validPalindrome2(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                    return isPalindrome(s, left + 1, right)
    || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome2("abca")); // true
        System.out.println(validPalindrome2("abc"));  // false
        System.out.println(validPalindrome2("aba"));  // true
    }
}
