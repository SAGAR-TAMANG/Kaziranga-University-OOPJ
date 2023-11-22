class MyClass {
  double r;

  double area(){
    return (3.14 * r * r);
  }
}

class Question1 {
  public static void main(String[] args) {
      MyClass obj1 = new MyClass();
      obj1.r = 10;
      double ans = obj1.area();
      System.out.println("Area is:" + ans);
      
      obj1.r = 20;
      ans = obj1.area();
      System.out.println("Area is:" + ans);
  }
}
