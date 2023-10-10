import java.util.ArrayList;
import java.util.Arrays;

public class Test {
  public static void main(String args[]){
    String arr[] = new String[4];

    ArrayList arrl = new ArrayList();

    arr[0] = "Amit";
    arr[1] = "Ashish";
    
    System.out.println("Array's first index has:" + arr[0]);

    arrl.add("Ashish");

    System.out.println("My ArrayList first index has: " + arrl.get(0));
  }
}
