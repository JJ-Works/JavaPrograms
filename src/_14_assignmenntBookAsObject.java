//5. Write a class to create two objects of Book and initialize them with different titles and authors.

class Book{
    String title;
    String author;

    Book(String title, String author){

        this.title = title;
        this.author = author;
    }

    void displayBookDetails(){
        System.out.println("The title of the book is "+ title);
        System.out.println("And author of the book is "+ author);
    }
}

public class _14_assignmenntBookAsObject {

    public static void main(String[] args) {

        Book Metamorphosis = new Book("Metamorphosis", "Franz Kafka");
        Book TheAlchemist = new Book("The Alchemist", "Paulo Coelho");

        Metamorphosis.displayBookDetails();
        System.out.println(" \n");
        TheAlchemist.displayBookDetails();
    }
}
