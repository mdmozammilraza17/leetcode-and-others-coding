import java.util.HashMap;
import java.util.Map;
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
        {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {

            char sChar = s.charAt(i);
            char tChar = t.charAt(j);

            if (map.containsKey(sChar))
            {
                if (map.get(sChar) != tChar)
                {
                    return false;
                }
            }
            else
            {
                if (map.containsValue(tChar))
                {
                    return false;
                }
                map.put(sChar, tChar);
            }

            i ++;
            j ++;
        }
        return true;
    }
}

class Leetcode205
{
    public static void main(String[] args) {
        {
            String s = "badc";
            String t = "baba";
            Solution solution = new Solution();
            System.out.println(solution.isIsomorphic(s, t));
        }
    }
}