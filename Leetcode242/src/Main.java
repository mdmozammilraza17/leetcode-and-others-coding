import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
        {
            return false;
        }
        char [] sChar = s.toCharArray();
        char [] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        int i = 0;
        int j = 0;
        while (i < sChar.length && j < tChar.length)
        {
            char sStore = sChar[i];
            char tStore = tChar[j];

            if (sStore == tStore)
            {
                i ++;
                j ++;
            }
            else
            {
                return false;
            }

        }
        return true;
    }
}

class Main
{
    public static void main(String[] args)
    {
        String s = "anagram";
        String t = "nagaram";
        Solution solution = new Solution();
        System.out.println(solution.isAnagram(s, t));
    }
}