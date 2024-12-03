public abstract class Car {
    private String id;
    private String name;
    private double price;
    private int amout;

    public Car() {
    }

    public Car(String id, String name, double pricem, int amout) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amout = amout;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmout() {
        return amout;
    }

    public void setAmout(int amout) {
        this.amout = amout;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amout=" + amout +
                '}';
    }

    public abstract double totalPrice();
}
