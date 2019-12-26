package pkg.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements  Cloneable{
    List<Books> bookList = new ArrayList<>() ;

    public List<Books> getBookList() {
        return bookList;
    }

    public BookShop(List<Books> bookList) {
        this.bookList = bookList;
    }

    public BookShop() {
        super();
    }

    // Shallow Copying
/*    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }*/

    // Deep Copy
    @Override
    protected Object clone() throws CloneNotSupportedException{
        List<Books> booksList = new ArrayList<>();
        for (Books book : this.bookList) {
            booksList.add(book);
        }
        return new BookShop(booksList);
    }



    public void loadBooks() {
        Books b1 = new Books("Book1",100);
        Books b2 = new Books("Book2",200);
        Books b3 = new Books("Book3",300);
        Books b4 = new Books("Book4",400);
        Books b5 = new Books("Book5",500);
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
    }
}
