import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String sArr [] = s.split(" ");
        if (pattern.length() != sArr.length)
        {
            return false;
        }
        for (int i = 0; i < sArr.length; i++)
        {

            char patterChar = pattern.charAt(i);
            String sString = sArr[i];

            if ((map.containsKey(patterChar) && !map.get(patterChar).equals(sString)) ||
                    !map.containsKey(patterChar) && map.values().contains(sString))
            {
                return false;
            }
            map.put(patterChar, sString);
        }
        return true;
    }
}

class Main
{
    public static void main(String[] args)
    {
        String pattern = "abba";
        String s = "dog cat cat fish";
        Solution solution = new Solution();
        System.out.println(solution.wordPattern(pattern, s));
    }
}