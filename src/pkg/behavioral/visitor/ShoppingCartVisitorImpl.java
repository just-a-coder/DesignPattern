package pkg.behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = 0;
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 10;
        } else {
            cost = book.getPrice();
        }
        System.out.println(" Book IsbmNumber: "+book.getIsbnNumber()+" Price:: "+cost);
        return cost;
    }

    @Override
    public int visit(Fruits fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        System.out.println(" Fruit: "+fruit.getName()+" Cost: "+cost);
        return cost;
    }
}
