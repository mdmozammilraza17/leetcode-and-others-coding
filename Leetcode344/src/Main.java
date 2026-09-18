class Solution {
    public void reverseString(char[] s)
    {
        int i = 0;
        int j = s.length-1;
        while (i < j)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i ++;
            j --;
        }

    }
}

class Main
{
    public static void main(String[] args)
    {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        Solution solution = new Solution();
        solution.reverseString(s);
    }
}