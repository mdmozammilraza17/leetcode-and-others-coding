public class Main {
    public static void main(String[] args) {

        int store = 0;

        int nums [] = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        for (int i=0; i<nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[store] = nums[i];
                store ++;
            }
        }

        for (int j=0; j<=store; j++)
        {
            System.out.print (nums[j]+" ");
        }
    }
}