import java.util.Scanner;

class Ashish{
  static  int a = 10;
  static void print(){
    System.out.println(a);
  }
}

class Tamang extends Ashish {
  static int a = 20;
  void printt(){
    System.out.println(super.a);
  }
}

class thiss{
  public static void main(String args[]){
    // Ashish.a = 20;
    Tamang obj1 = new Tamang();

    obj1.printt();
    
  }
}