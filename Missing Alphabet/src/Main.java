// KPMG coding interview
// String str = "This is a girl"
// Find the missing alphabet in this

import java.util.Arrays;
class Solution
{
    public String missingAlphabet (String str)
    {
        StringBuilder result = new StringBuilder();
        String lowercaseconversion = str.toLowerCase().replaceAll(" ", "");
        char[] chars = lowercaseconversion.toCharArray();
        Arrays.sort(chars);

        for (int c = 'a'; c <= 'z'; c++)
        {
            boolean found = false;
            // Search in sorted array
            for (char ch: chars)
            {
                if (ch == c)
                {
                    found = true;
                    break;
                }
            }
            if (!found)
            {
                result.append((char)c).append(" ");
            }
        }
        return result.toString();

    }
}

public class Main {
    public static void main(String[] args) {
        String str = "This is a girl";
        Solution solution = new Solution();
        String result = solution.missingAlphabet(str);
        System.out.println("Missing Alphabets: "+result);
    }
}