// How to delte all the elements from my ArrayList? 

import java.util.ArrayList;

public class Test2 {
  public static void main(String args[]){
    ArrayList<String> arrl = new ArrayList<String>();

    arrl.add("Alcabiades");
    arrl.add("Tamang");
    
    System.out.println(arrl);

    arrl.clear();

    System.out.println(arrl);
  }
}
