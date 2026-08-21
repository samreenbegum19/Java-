class Calculator{
    public int divide(int a,int b)
    {
        return a / b;
    }
    public double divide(double a,double b)
    {
        return a/b;
    }
}



public class div{
    public static void main(String[]args)
    {
int a=10;
int b=5;
Calculator calc=new Calculator();
int r1=calc.divide(a, b);
double r2=calc.divide( 10.0, 5.0);
System.out.println(r1);
System.out.println(r2);
}
}