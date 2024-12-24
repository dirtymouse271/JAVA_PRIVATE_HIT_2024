public class Interior extends Product {
    private String interior_style;
    private String interior_high;
    private String interior_color;

    public Interior() {
    }

    public Interior(String product_id, String product_name, double product_price, int product_total, String interior_style, String interior_high, String interior_color) {
        super(product_id, product_name, product_price, product_total);
        this.interior_style = interior_style;
        this.interior_high = interior_high;
        this.interior_color = interior_color;
    }

    public String getInterior_style() {
        return interior_style;
    }

    public void setInterior_style(String interior_style) {
        this.interior_style = interior_style;
    }

    public String getInterior_high() {
        return interior_high;
    }

    public void setInterior_high(String interior_high) {
        this.interior_high = interior_high;
    }

    public String getInterior_color() {
        return interior_color;
    }

    public void setInterior_color(String interior_color) {
        this.interior_color = interior_color;
    }

    @Override
    public String toString() {
        return "Interior{" +
                "interior_style='" + interior_style + '\'' +
                ", interior_high='" + interior_high + '\'' +
                ", interior_color='" + interior_color + '\'' +
                '}';
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public double calculator() {
        return super.calculator();
    }
}
