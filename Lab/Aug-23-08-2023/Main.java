class Car {
    String brand;
    String model;
    
    public static void printDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class Main {
    public static void main(String[] args) { 
        Car s = new Car(); 
        s.brand = "Tesla";
        s.model = "Model 3";
        s.printDetails(); 

        unmain();
    }

    public static void unmain(){
        Car obj = new Car();
        obj.brand = "Lambo";
        obj.model = "123";
        obj.printDetails();
    }
}

