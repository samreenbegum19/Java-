class A{
    public A()
    {
        System.out.println("A constructor");
    }
}
class B extends A{
    public B()
    {
        super(); // call the superclass which A.
        System.out.println("B constructor");
    }
}



public class supermethod {
    public static void main(String args[])
    {
B obj=new B();
    }
}
