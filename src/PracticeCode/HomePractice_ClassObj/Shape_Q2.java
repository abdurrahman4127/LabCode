package PracticeCode.HomePractice_ClassObj;

/*
2. Create a class called ‘Shape’ with four variables type, length, height and width and
methods ‘printShapeType()’, ‘calculateArea()’ and ’calculateVolume()’ with no
parameters. Fill in the last two methods with appropriate formulae. These methods will
return the area and volume of an object respectively, if passed.
a. Create two object ‘triangle’ and ‘rectangle’ of Shape class.
b. Fill in the details of the object as necessary and print their type using
‘printShapeType()’ method.
c. Call the objects’ ‘calculateArea()’ and ’calculateVolume()’ methods and print the
both objects’ area and volume respectively
 */

class Shape
{
    String  type;
    double length, height, width;

    Shape(String  type, double length, double height, double width)
    {
        this.type = type;
        this.height = height;
        this.length = length;
        this.width = width;
    }

    void printShapeType()
    {
        System.out.println("this is a " + type + " shape");
    }

    void calculateArea()
    {
        double areaOfTriangle = (length * height) / 2;
        System.out.println("area of " + " is : " + areaOfTriangle);

        double areaOfRectangle = length * height;
        System.out.println("area of " + " is : " + areaOfRectangle);
    }

    void calculateVolume()
    {
        double volOfTriangle =  height * (length * height) / 2;
        System.out.println("volume of " + " is : " + volOfTriangle);

        double volOfRectangle = height * width * width;
        System.out.println("volume of " + " is : " + volOfRectangle);

    }
}


public class Shape_Q2
{
    public static void main(String[] args)
    {
        // gotta pass the parameter type, length, height, width . . .
//        Shape triangle = new Shape();
//        Shape rectangle = new Shape();

//        triangle.calculateArea();
//        triangle.calculateVolume();
//
//        rectangle.calculateArea();
//        rectangle.calculateVolume();
    }
}
