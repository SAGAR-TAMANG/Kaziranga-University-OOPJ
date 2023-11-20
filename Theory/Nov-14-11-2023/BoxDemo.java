class Box {
  double width, height, length;
}

class BoxDemo {
  public static void main(String[] args) {
    Box mybox = new Box();

    mybox.width = 3;
    mybox.height = 3;
    mybox.length = 3;

    double vol = mybox.width * mybox.height * mybox.length;

    System.out.println("VOLUME IS: " + vol);
  } 
}

