public class IntegerTest {

  public static void main(String[] args) {

    int i = 0;


    for (int j = 0; j < 10; j++) {
      incrementCount(i);
    }

    System.out.println(i+ " " + "i");

  }

  public static void incrementCount(int i) {
    int k =0;
    i++;
    k++;

    System.out.println(k+ " " + "k");
  }

}