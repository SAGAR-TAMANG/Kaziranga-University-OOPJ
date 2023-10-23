class A{
  private int A;

  void setter(int var){
    A = var;
  }

  void getter(){
    System.out.println(A);
  }
}

class encap{
  public static void main(String args[]){
    A obj1 = new A();

    obj1.setter(10);
    obj1.getter();
  }
}