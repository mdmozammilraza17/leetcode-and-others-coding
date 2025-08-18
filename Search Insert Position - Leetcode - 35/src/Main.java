class Solution
{
    public int searchInsert (int nums[], int target)
    {
        int start = 0;
        int end = nums.length-1;

        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] > target)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return start;
    }
}

public class Main {
    public static void main(String[] args) {
        int nums [] = {1,1, 2, 4, 8, 9, 7, 8};
        int target = 3;
        Solution solution = new Solution();
        int outputResult = solution.searchInsert(nums, target);
        System.out.println("Insertion position will be: "+outputResult);
    }
}