class Human {
    private int age;
    private String name;

    // Constructor initializes fields
    public Human() {
        this.age = 25;          // assign to class field
        this.name = "Samreen";  // assign to class field
        System.out.println("Constructor called!");
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

public class ConstructDemo {
    public static void main(String[] args) {
        // Create object -> constructor runs
        Human obj = new Human();

        // Print default values set by constructor
        System.out.println(obj.getName() + " : " + obj.getAge());

        // Change values using setters
        obj.setAge(30);
        obj.setName("Mohammed");

        // Print updated values
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
