
// Base class A
class A {
    // Method show() in class A
    public void show() {
        System.err.println("in A"); // Prints "in A" to the error stream
    }
}

// Derived class B extends A
class B extends A {
    // Method show() in class B overrides show() in class A
    @Override
    public void show() {
        System.out.println("in B"); // Prints "in B" to the standard output
    }
}

// Main class to demonstrate method overriding
public class overridingdemo {
    public static void main(String[] args) {
        // Create object of class B
        B obj = new B();
        
        // Calls the overridden show() method in class B
        obj.show(); // Output: "in B"
    }
}
