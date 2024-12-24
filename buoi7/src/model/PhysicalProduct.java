package model;

public class PhysicalProduct extends Product{

    @Override
    public float totalPrice() {
        return getPrice()*getQuantity();
    }

    @Override
    public String toString() {
        return super.toString() + "total price: " + totalPrice();
    }

}
