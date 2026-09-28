public class LeafyVegetable extends Vegetable {
    int freshnessLevel; // Tingkat kesegaran (skala 1-10)

    public LeafyVegetable(String name, String color, double pricePerKg, int freshnessLevel) {
        super(name, color, pricePerKg);
        this.freshnessLevel = freshnessLevel;
    }

    public int getFreshnessLevel() {
        return this.freshnessLevel;
    }

    // Override method toString untuk menambahkan informasi khusus sayur daun
    public String toString() {
        String str = super.toString();
        return str + " | Tingkat Kesegaran: " + this.freshnessLevel + "/10";
    }
}