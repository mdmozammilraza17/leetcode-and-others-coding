import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String str = "MCMXCIV";
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);

        int result = hm.get(str.charAt(str.length()-1));

        for (int i = str.length()-2; i>=0; i--)
        {
            if (hm.get(str.charAt(i)) < result)
            {
                result = result - hm.get(str.charAt(i));
            }
            else
            {
                result = result + hm.get(str.charAt(i));
            }
        }
        System.out.println(str+ " in number: "+result);
    }
}