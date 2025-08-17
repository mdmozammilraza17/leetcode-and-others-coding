class Solution
{
    public int searchInsert (int nums[], int target)
    {
        int start = 0;
        int end = nums.length-1;
        int mid = (start + end) / 2;
        while (nums[mid] < target)
        {
            if (nums[mid] < target)
            {
                end = mid;
            }
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        int nums [] = {1,3,5,6};
        int target = 5;
        Solution solution = new Solution();
        solution.searchInsert(nums, target);
    }
}