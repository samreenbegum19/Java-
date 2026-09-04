// Parent class A
class A {
    // No-argument constructor of class A
    public A() {
        System.out.println("A constructor");
    }
}

// Child class B extends A
class B extends A {
    // No-argument constructor of class B
    public B() {
        // Calls the parent class (A) constructor first
        super();
        System.out.println("B constructor");
    }

    // Parameterized constructor of class B
    public B(int n) {
        // Calls B's no-argument constructor first
        // Which in turn calls A's constructor
        this();
        System.out.println("B constructor with parameters");
    }
}

// Main class to run the program
public class thismethod {
    public static void main(String args[]) {
        // Creating an object of B using parameterized constructor
        // This triggers the chain: A() → B() → B(int)
        B obj = new B(10);
    }
}

