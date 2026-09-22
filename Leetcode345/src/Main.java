
class Solution {
    public String reverseVowels(String s) {


        char[] charArray = s.toCharArray();
        char [] temp = new char[charArray.length];

        int start = 0;
        int end = s.length()-1;

        while (start <= end)
        {
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            if ((String.valueOf(startChar).matches("[aeiouAEIOU]")) &&
                    (String.valueOf(endChar).matches("[aeiouAEIOU]")))
            {
                temp[start] = charArray[end];
                temp[end] = charArray[start];
                start ++;
                end --;

            }

            else if (!(String.valueOf(startChar).matches("[aeiouAEIOU]")) &&
                    !(String.valueOf(endChar).matches("[aeiouAEIOU]")))
            {
                temp[start] = charArray[start];
                temp[end] = charArray[end];
                start ++;
                end --;
            }
            else if ((String.valueOf(startChar).matches("[aeiouAEIOU]")) &&
                    !(String.valueOf(endChar).matches("[aeiouAEIOU]")))
            {
                temp[end] = charArray[end];
                end --;
            }

            else if (!(String.valueOf(startChar).matches("[aeiouAEIOU]")) &&
                    (String.valueOf(endChar).matches("[aeiouAEIOU]")))
            {
                temp[start] = charArray[start];
                start ++;
            }
        }

        String result = new String(temp);

        return result;
    }

}
class Main
{
    public static void main(String[] args)
    {
        String s = "IceCreAm";
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels(s));
    }
}