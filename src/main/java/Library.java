import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<Book>();
    }


    public int getCapacity() {
        return this.capacity;
    }

    public int getBookCount() {
        return this.collection.size();
    }

    public boolean checkFreeCapacity() {
        return getCapacity() > getBookCount();
    }

    public void addBook(Book book){
        if (checkFreeCapacity()) {
            this.collection.add(book);
        }
        else {
            System.out.println("Library Full!");
        }

    }
}
