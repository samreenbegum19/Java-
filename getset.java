
class Human {
    private int age;
    private String name;

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int a) {
        age = a;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String n) {
        name = n;
    }
}

public class getset {
    public static void main(String[] args) {
        Human obj = new Human();

        // Corrected method calls (no named parameters in Java)
        obj.setAge(30);
        obj.setName("Samreen");

        // Printing values
        System.out.println(obj.getAge() + " : " + obj.getName());
    }
}
