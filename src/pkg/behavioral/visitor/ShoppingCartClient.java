package pkg.behavioral.visitor;

public class ShoppingCartClient {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(120,"1001"),
                                                new Book(40,"1002"),
                                                new Fruits(30,2,"Banana"),
                                                new Fruits(120,1,"Apple")};
        int total = calculatePriceItems(items);
        System.out.println(" Total Cost: "+total);
    }

    private static int calculatePriceItems(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement itemElement : items) {
            sum = sum + itemElement.accept(visitor);
        }
        return sum;
    }
}
