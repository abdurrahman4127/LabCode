package Lab_5.LabManual_3;

class Store
{
    //capable to store 100 books
    String []books = new String[100];

    //to books at any index
    void addBooks(int index, String name)
    {
        this.books[index] = name;
    }

    //to show all the available books
    void showBooks()
    {
        for (int i=0; i<books.length; i++)
        {
            if(books[i] != null)  // in case we don't have all 100 books
                System.out.println(books[i]);
        }
        System.out.println();
    }

    // for buying
    void buyBook(String bookName)
    {
        int flag = 0;
        for(int i=0; i<books.length; i++)
        {
            if(books[i].equalsIgnoreCase(bookName))
            {
                flag++;  //if found,
                System.out.println("take it");
                break;   // if fount, break
            }
        }
        if(flag == 0)
            System.out.println("book wasn't found");
    }

    //to order books
    String orderedBook;
    void orderedBook(String orderBook)
    {
        this.orderedBook = orderBook;
    }

    //show ordered books
    void showOrderedBooks()
    {
        System.out.println("ordered book : " + this.orderedBook);
    }
}

public class BookStore
{
    public static void main(String[] args)
    {
        Store owner = new Store();

        //need to add like this
        owner.addBooks(0,"Quran");
        owner.addBooks(1,"Tafsir");
        owner.addBooks(2,"bukhari");

        owner.showBooks();

//        Store buyer = new Store();
//        buyer.buyBook("Quran");
//        buyer.orderedBook("Sherlock");
//
//        owner.showOrderedBooks();

    }
}
