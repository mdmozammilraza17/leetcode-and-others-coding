import java.util.List;
import java.util.stream.Stream;

class Main
{
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,2,3,4,4,5);
        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println(list1);
    }
}