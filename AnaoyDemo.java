class A{
    public A()
    {
        System.out.println("object cretaed");
    }
    public void show()
    {
System.out.println("method");
    }
}


public class AnaoyDemo
{
    public static void main(String []args)
    {
        int marks;// declaring
        marks=99;// assigning
        // A OBJ=new A(); THIS IS OBJECT CREATION.WITH REFERENCE,reference obj
        
new A().show();// the above method is followed here,object creation without reference,anaoymous object and it can be called once.

    }
}