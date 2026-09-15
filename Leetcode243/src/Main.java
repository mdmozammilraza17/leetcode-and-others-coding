class Solution
{
    public int shortestDistance (String [] wordDict, String word1, String word2)
    {
        int word1Index = -1;
        int word2Index = -2;
        int minDistance = Integer.MAX_VALUE;
        for (int i=0; i<wordDict.length; i ++)
        {
            if (wordDict[i].equals(word1))
            {
                word1Index = i;
            }
            if (wordDict[i].equals(word2))
            {
                word2Index = i;
            }
            if (word1Index != -1 && word2Index != 1)
            {
                minDistance = Math.min(
                        minDistance,
                        Math.abs(word1Index - word2Index)
                );
            }
        }
        return minDistance;
    }
}

class Main
{
    public static void main(String[] args)
    {
        String wordDict [] = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "makes";
        String word2 = "coding";
        Solution solution = new Solution();
        System.out.println(solution.shortestDistance(wordDict, word1, word2));
    }
}