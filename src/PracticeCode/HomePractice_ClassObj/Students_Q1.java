package PracticeCode.HomePractice_ClassObj;

/*   Create a class named 'Student' with String variable 'name', integer variable 'roll_no',
        String variable ‘phone’ number and ‘address’.
        a. Create two objects of the Student Class.
      b. Assign and print the roll number, phone number and address of two students
       having names "Sam" and "John" respectively
 */

class Student
{
    String name, phone, address;
    int roll_no;

    Student(String name, String phone, String address, int roll_no)
    {
        System.out.println("name : " + (this.name = name));
        System.out.println("phone no. : " + (this.phone = phone));
        System.out.println("address : " + (this.address = address));
        System.out.println("roll no. : " + (this.roll_no = roll_no));
    }
}

public class Students_Q1
{
    public static void main(String[] args)
    {
        Student ar = new Student("AR","019...", "Narail", 7);
        System.out.println();
        Student tn = new Student("TN","084...", "Dong HA", 8);
    }
}
