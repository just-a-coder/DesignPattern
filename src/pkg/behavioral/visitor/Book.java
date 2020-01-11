package pkg.behavioral.visitor;

public class Book implements ItemElement {
    private int price;
    private String isbnNumber;

    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    /**
     * implementation of accept() method in concrete classes,
     * its calling visit() method of Visitor and passing itself as argument.
     */
    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
