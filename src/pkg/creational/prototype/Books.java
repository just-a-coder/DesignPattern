package pkg.creational.prototype;

public class Books {
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Books(String name, int price) {
        this.name = name;
        this.price = price;
    }


}
