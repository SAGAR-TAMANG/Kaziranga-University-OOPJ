// BOX Class with Length = 20; Height = 10;

class Box {
  double length, height;
}

class Question112 {
  public static void main(String[] args) {
    Box obj1 = new Box();
    Box obj2 = new Box();

    obj1.length = 20;
    obj1.height = 10;

    System.out.println(obj1.length * obj1.height);
  }
}