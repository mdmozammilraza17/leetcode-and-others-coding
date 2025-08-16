public class Main {
    public static void main(String[] args) {
        int arr [] = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        int j = 0;
        for (int i=1; i<arr.length; i++)
        {
            if (arr[i] != arr[j])
            {
                j++;
                arr[j] = arr[i];
            }
        }

        for (int k=0; k<= j; k++)
        {
            System.out.print (arr[k]+" ");
        }
    }
}