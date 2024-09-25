package string;
/*
* Given an array of strings strs[]. The task is to return the longest common prefix among each and every strings
* present in the array. If there’s no prefix common in all the strings, return “-1”.

Examples:

Input: strs[] = [“geeksforgeeks”, “geeks”, “geek”, “geezer”]
Output: gee
Explanation: “gee” is the longest common prefix in all the given strings.


Input: strs[] = [“hello”, “world”]
Output: -1
Explanation: There’s no common prefix in the given strings.

*/

import java.util.Arrays;

public class Problem2 {
    static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "-1";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int minLength = Math.min(first.length(), last.length());

        int i = 0;

        while (i < minLength && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        if (i == 0)
            return "-1";

        return first.substring(0, i);
    }


    public static void main(String[] args) {
        String[] strs = {"geeksforgeeks", "geeks", "geek", "geezer"};

        System.out.println("The longest common prefix is: "
                + longestCommonPrefix(strs));

    }

}
