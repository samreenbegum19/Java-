class Calculator{
    public int add(int n1,int n2)
    {

        return n1+n2;
    }
    public int sub(int n3,int n4)
    {
        return n3-n4;
    }
    public int multi(int n5,int  n6)
    {
        return n5*n6;
    }
}

public class demo{
    public static void main(String[]args)
    {
    int n1=15;
    int n2=10;
    int n3=14;
    int n4=11;
    int n5=3;
    int n6=2;

    Calculator calc=new Calculator();
    int r1 =calc.add(n1, n2);
    int r2 =calc.sub(n3, n4);
    int r3 =calc.multi(n5, n6);

    System.out.println(r1);
    System.out.println(r2);
    System.out.println(r3);
}
}