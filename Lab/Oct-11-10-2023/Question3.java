// This() keyword - Calling default constructor from parameterized constructor  

class A{
  A(){System.out.println("hello a");}
  A(int x){
    this();
    System.out.println(x);
  }
}

class Question3 {
  public static void main(String args[]){
    A a = new A();
  }
}