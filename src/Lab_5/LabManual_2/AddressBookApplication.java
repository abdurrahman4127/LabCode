package Lab_5.LabManual_2;

class Application {
    String address;
    int numOfBooks;

    String []nameOfBooks = new String[numOfBooks];

    // to update records
    void updateBooks(int index, String books) {
        this.nameOfBooks[index] = books;
    }
}

public class AddressBookApplication {
    public static void main(String[] args)
    {
        // to create
        Application owner = new Application();

        //update book numbers
        owner.numOfBooks = 10;

    }
}

