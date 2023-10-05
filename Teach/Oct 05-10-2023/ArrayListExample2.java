import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class ArrayListExample2 {
  public static void main(String args[]){
    ArrayList obj1 = new ArrayList();
    String obj2[] = new String[3];

    obj1.add("ALUK");
    obj1.add("Amit");

    obj2[0] = "Aluk";
    obj2[1] = "Amit";

    System.out.println("THIS IS ARRAY: " + obj2[0] + " " +  obj2[1]);
    
    Iterator itr = obj1.iterator();

    while (itr.hasNext()){
      System.out.println(itr.next());
    }
  }
}
