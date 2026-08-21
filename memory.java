class Calculator{ // class creation
    int num=10; // global variable
    public int add(int a,int b)// method creation
    {

System.out.println(num);
return a+b;
    }
}


public class memory{
    public static void main(String []args)
    {
        int a=10; //local variable
        int b=15;
        Calculator calc=new Calculator(); // object creation
        int r1=calc.add(a,b); // method call
        System.out.println(r1);

    }
}