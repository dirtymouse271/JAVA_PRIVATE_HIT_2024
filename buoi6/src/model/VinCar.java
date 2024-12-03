public class VinCar extends Car {
    public VinCar() {
    }

    @Override
    public double totalPrice() {
        return this.getPrice() * this.getAmout();
    }

    @Override
    public String toString() {
        return super.toString() +  "VinCar{}";
    }
}
