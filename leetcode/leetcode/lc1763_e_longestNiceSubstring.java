package leetcode;

import java.util.HashSet;

public class lc1763_e_longestNiceSubstring {
    public static void main(String[] args) {

    }
    public String longestNiceSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();

        for (char c : s.toCharArray()) {
            set.add(c);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (set.contains(Character.toUpperCase(c))&&(set.contains(Character.toLowerCase(c)))){
                continue;
            }

            String leftStr = longestNiceSubstring(s.substring(0, i));
            String rightStr = longestNiceSubstring(s.substring(i + 1));
            return leftStr.length() >= rightStr.length() ? leftStr : rightStr;
        }

        return s;
    }
}
