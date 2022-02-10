package Lab_4;

public class Penguin extends Bird{
 /*
    by default, everything from Bird class has been inherited
     invisibly every public members are here
     Only the default constructors gets inherited
 */

    /*public String name;
    public int wings;
    public int beaks;
    public float size;

        //Default Constructor
    public Bird() {
        this.wings = 2;
        this.beaks = 1;
    }

    fly()
    */

    // to override or modify the parent class method
    @Override
    public void fly() {
        System.out.println(super.name + " is a Penguin. It can NOT fly!");
    }
}
