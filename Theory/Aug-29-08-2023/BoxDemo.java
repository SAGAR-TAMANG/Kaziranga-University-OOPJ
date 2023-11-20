class Box {
  double width;
  double height;
  double depth;

  Box(double w, double h, double d){
    width = w;
    height = h;
    depth = d;
  }

  double volume(){
    return width * height * depth;
  }
}

class BoxDemo {
  public static void main(String args[]){
    Box myobj1 = new Box(10, 20, 30);
    Box myobj2 = new Box(2, 5, 3);
    
    double vol;

    vol = myobj1.volume();

    System.out.println("Volume of Object 1 is "+ vol);

    vol = myobj2.volume();

    System.out.println("Volume of Object 2 is "+ vol);
  }
}
