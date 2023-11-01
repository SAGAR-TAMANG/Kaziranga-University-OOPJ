// A program that uses BOX class

class Box {
  double width;
  double height;
  double depth;

  double volume(){
    return width * height * depth;
  }

  void setDim(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
}

class Question1 {
  public static void main(String args[]){
    Box myobj1 = new Box();
    Box myobj2 = new Box();

    myobj1.setDim(10, 20, 15);
    myobj2.setDim(3, 6, 9);

    double vol;

    vol = myobj1.volume();

    System.out.println("Volume of Object 1 is "+ vol);

    vol = myobj2.volume();

    System.out.println("Volume of Object 2 is "+ vol);
  }
}