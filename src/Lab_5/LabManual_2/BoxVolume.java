package Lab_5.LabManual_2;

class Box {
    double length, width, height;

    double getVolume(double l, double w, double h) {
        return (l * w * h);
    }
}

public class BoxVolume {
    public static void main(String[] args)
    {
        Box box1 = new Box();
        Box box2 = new Box();

        double vol1 = box1.getVolume(12,20,30);
        System.out.println("volume of 1st box : " + vol1);

        double vol2 = box2.getVolume(12,8,25);
        System.out.println("volume of 2nd box : " + vol2);
    }
}
