package Lab_4;

public class BirdCreator {
    public static void main(String[] args)
    {
        Bird sparrow = new Bird();
        System.out.println(sparrow.wings); // 2
        System.out.println(sparrow.beaks); // 1
        System.out.println(sparrow.name); // null

        Bird national_bird = new Bird("Dowel");
        System.out.println(national_bird.name); //Dowel
        System.out.println(national_bird.size); //0.0

        Bird parrot = new Bird("Toyota", 50);
        System.out.println(parrot.size); //50
        System.out.println(parrot.beaks); //1

        Eagle eg = new Eagle();
        System.out.println("Eagle wings: "+  eg.wings);
        eg.name = "Super king";

        Eagle eg2 = new Eagle();
        System.out.println(eg.beaks);
        eg2.name = "King";
        eg2.size = 1500;

        Eagle eg3 = new Eagle("King", 2000);
        eg3.fly();

        Eagle eg4 = new Eagle("Icarus", 2, 1, 2500, "Brown");
        eg4.fly();

        Penguin pg = new Penguin();
        System.out.println(pg.wings);
        pg.name = "Emperor";
        System.out.println("Pg name: " + pg.name);
        pg.fly();

        eg.fly();

    }
}
