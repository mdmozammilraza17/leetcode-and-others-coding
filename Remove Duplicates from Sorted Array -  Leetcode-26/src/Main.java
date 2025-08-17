class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i=1; i<nums.length; i++)
        {
            if (nums[i] != nums[i-1])
            {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
public class Main {
    public static void main(String[] args) {
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution solution = new Solution();
        int result = solution.removeDuplicates(nums);

        System.out.println("After Removing Duplicates:");

        // Iterate the duplicate from sorted array based on j result.
        for (int i=0; i<result; i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
}