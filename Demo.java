
class Laptop {
    String model;   // field to store laptop model
    int price;      // field to store laptop price

    // Overriding toString() to print meaningful info
    @Override
    public String toString() {
        return "Model: " + model + ", Price: " + price;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Create a new Laptop object
        Laptop obj = new Laptop();

        // Assign values to fields
        obj.model = "Lenova";
        obj.price = 100_00; // underscores are allowed for readability (10000)

        // Print the object -> calls toString()
        System.out.println(obj);
    }
}
