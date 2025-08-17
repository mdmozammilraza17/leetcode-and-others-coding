class Solution
{
    public int removeElements (int nums[], int val)
    {
        int j = 0;
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] != val)
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
        int nums [] = {3, 2, 2, 3};
        int val = 3;
        Solution solution = new Solution();
        int result = solution.removeElements(nums, val);
        System.out.println("After Removing Element:");
        for (int i=0; i<result; i++)
        {
            System.out.print(nums[result]+" ");
        }
    }
}