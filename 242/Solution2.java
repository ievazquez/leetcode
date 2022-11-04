//Given two strings s and t, return true if t is an anagram of s, and false
//otherwise.
//
// An Anagram is a word or phrase formed by rearranging the letters of a
//different word or phrase, typically using all the original letters exactly once.
//
//
// Example 1:
// Input: s = "anagram", t = "nagaram"
//Output: true
//
// Example 2:
// Input: s = "rat", t = "car"
//Output: false
//
//
// Constraints:
//
//
// 1 <= s.length, t.length <= 5 * 10⁴
// s and t consist of lowercase English letters.
//
//
//
// Follow up: What if the inputs contain Unicode characters? How would you
//adapt your solution to such a case?
//
// Related Topics Hash Table String Sorting 👍 7394 👎 246


import java.util.HashMap;
import java.util.LinkedHashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> a = new HashMap<Character, Integer>();
        Map<Character, Integer> b = new HashMap<Character, Integer>();
        for (char c: s.toCharArray()) {
            if (a.containsKey(c)) {
                a.put(c,a.get(c) + 1);
            } else {
                a.put(c, 1);
            }
        }
        for (char c: t.toCharArray()) {
            if (b.containsKey(c)) {
                b.put(c,b.get(c) + 1);
            } else {
                b.put(c, 1);
            }
        }

        return a.equals(b);
    }
}
//leetcode submit region end(Prohibit modification and deletion)