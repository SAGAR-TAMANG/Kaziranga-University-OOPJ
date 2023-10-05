class summ {
  int a,b;

  void sum(){
    System.out.println("sum:" + (a + b));
  }
  
  void sum(int a, int b){
    int c;
    c = a+b;
    System.out.println("sum:" + c);
  }

}

class summm extends summ{
  void sum(){
    System.out.println("THIS IS A SUM");
  }
}

class temp {
  public static void main(String args[]){
    summ obj1 = new summ();
    summm obj2 = new summm();

    obj1.a = 1;
    obj1.b = 1;
    obj2.a = 1;
    obj2.b = 1;

    obj2.sum(); 

  }
}