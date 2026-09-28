public class Vegetable {
    String name;
    String color;
    double pricePerKg;

    public Vegetable(String name, String color, double pricePerKg) {
        this.name = name;
        this.color = color;
        this.pricePerKg = pricePerKg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public double getPricePerKg() {
        return this.pricePerKg;
    }

    public String toString() {
        return "Sayur: " + this.name + ", Warna: " + this.color + ", Harga: Rp" + this.pricePerKg + "/kg";
    }
}