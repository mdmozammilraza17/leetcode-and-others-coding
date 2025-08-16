import java.util.Arrays;

class Solution
{
    public String longestomonPrefix (String strs[])
    {
        // Use String Builder for because we need to append together in the same string
        StringBuilder result = new StringBuilder();

        // Sort so we can consider with first and last element lexicographical
        Arrays.sort(strs);

        // First element after sort
        char[] first =   strs[0].toCharArray();

        // Last element after sort
        char[] last = strs[strs.length-1].toCharArray();

        // Iterate
        for (int i=0; i<first.length; i++)
        {
            // Compare
            if (first[i] != last[i])
            {
                break;
            }
            result.append(first[i]).toString();
        }
        return result.toString();
    }
}

public class Main
{
    public static void main(String[] args) {
        String strs [] = {"flower","flow","flight"};
        Solution solution = new Solution();
        String longestPrefix = solution.longestomonPrefix(strs);
        System.out.println(longestPrefix);
    }
}