
// Define a class called Human
class Human {
    // Private fields (encapsulation: cannot be accessed directly outside this class)
    private int age;
    private String name;

    // Getter method for age (returns the value of age)
    public int getAge() {
        return age;
    }

    // Setter method for age (sets the value of age)
    public void setAge(int age) {
        this.age = age;  // "this.age" refers to the class variable, "age" is the parameter
    }

    // Getter method for name (returns the value of name)
    public String getName() {
        return name;
    }

    // Setter method for name (sets the value of name)
    public void setName(String name) {
        this.name = name;  // "this.name" refers to the class variable, "name" is the parameter
    }
}

// Main class with the entry point of the program
public class Demo2 {
    public static void main(String[] args) {
        // Create a new object of Human class
        Human obj = new Human();

        // Use setter methods to assign values
        obj.setAge(30);          // sets age to 30
        obj.setName("Samreen");  // sets name to "Samreen"

        // Use getter methods to retrieve values and print them
        System.out.println(obj.getName() + " : " + obj.getAge());
        // Output will be: Samreen : 30
    }
}
