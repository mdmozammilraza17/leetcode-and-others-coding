class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        int i = 0;
        while (i <= columnTitle.length()-1)
        {
            res = res * 26 + (columnTitle.charAt(i) - 'A' + 1);
            i ++;
        }
        return res;
    }
}

class Leetcode171
{
    public static void main(String[] args) {
        {
            String columnTitle = "ZY";
            Solution solution = new Solution();
            System.out.println(solution.titleToNumber(columnTitle));
        }
    }
}