package Lab_4;

public class House {
    // member variable / attributes / fields
    public int walls;
    public int doors;
    public int windows;
    public String namePlate;
    public String location;

    //private members
    private float price;

    public void printNameplate()
    {
        System.out.println("This is " + this.namePlate +". It has " + this.walls + " walls, " + this.doors+ " door, " +this.windows
                + " windows. Its name is " + this.namePlate+ ", It's located at " + this.location + ", It has price of " + this.price
                +" $" );
    }

    // Constructor name will be exactly same as the class name
    // Constructor is a method (function) that has no return type
    // Constructor will be public

    public House() {
        this.walls = 4;
        this.windows = 2;
        this.doors = 1;
        this.price = 1000;
    }

    // overloaded constructor 1
    public House(String houseLocation, String houseNameplate) {
        this.walls = 4;
        this.windows = 2;
        this.doors = 1;
        this.location = houseLocation;
        this.namePlate = houseNameplate;
    }

    // overloaded constructor 2
    public House(int houseWalls, int houseDoors, int houseWindows, String houseLocation, String houseNamePlate){
        this.walls = houseWalls;
        this.doors = houseDoors;
        this.windows = houseWindows;
        this.location = houseLocation;
        this.namePlate = houseNamePlate;
    }

//    // getter func for price
//    public float getPrice()
//    {
//        return this.price;
//    }
//
//    // setter func for price
//    public void setPrice(float housePrice) {
//        this.price = housePrice;
//    }


    /*
     Polymorphism == many faces, but one name
     face == function signature  --> number of params, types of params, same return type
     int add(int a, int b)
     int add(int a, int b, int c)
     int add(int a, float b)
     int add()

     function return type is NOT a function signature
     float add(int a, int b) is clashing with int add(int a, int b) or int add(int a, float b)
     */
}
