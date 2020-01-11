package pkg.behavioral.visitor;

public class Fruits implements ItemElement {

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruits(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
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
