class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0)
        {
            columnNumber --;
            int remainder = columnNumber % 26;
            char result = (char) ((remainder + 'A'));
            sb.append(result);
            columnNumber = columnNumber / 26;
        }
        return sb.reverse().toString();
    }
}

public class Main {
    public static void main(String[] args) {
        int columnNumber = 701;
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(columnNumber));
    }
}