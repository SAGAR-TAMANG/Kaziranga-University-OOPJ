abstract class A{
  abstract void callme();

  void callmetoo(){
    System.out.println("THIS IS NON ABS");
  }
}

class B extends A{
  void callme(){
    System.out.println("THIS IS NON ABSTRACT");
  }
}

class Driver{
  public static void main(String args[]){
    B obj1 = new B();

    obj1.callme();
    obj1.callmetoo();
  }
}