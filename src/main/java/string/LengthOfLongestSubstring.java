package string;

import java.util.*;

public class LengthOfLongestSubstring {
    //abcabcbb abc
    //pwwkewk
    //0123456
    //0022234  begin index
    //1212333  size
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        if (s == null) {
            return result;
        }
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(index, i).indexOf(s.charAt(i)) == -1) {
                int diff = i - index + 1;
                if (result < diff) {
                    result = diff;
                }
            } else {
                index = index + s.substring(index, i).indexOf(s.charAt(i)) + 1;
                int diff = i - index + 1;
                if (result < diff) {
                    result = diff;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
