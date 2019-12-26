package pkg.creational.prototype;

import java.util.List;

public class ClientMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(" Prototyping Bookshop");
        BookShop bookShopFirst = new BookShop();
        bookShopFirst.loadBooks();
        List<Books> booksListFirst = bookShopFirst.getBookList();
        BookShop bookShopSecond = (BookShop) bookShopFirst.clone();
        List<Books> booksListSecond = bookShopSecond.getBookList();
        booksListFirst.remove(1);
        System.out.println(" First Bookshop: "+booksListFirst);
        System.out.println(" Creating another Bookshop which will be having same data as first one");
        System.out.println(" Second BookShop: "+booksListSecond);
    }
}
