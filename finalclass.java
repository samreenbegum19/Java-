final class Calc
{
    public void show()
    {
        System.out.println("in A show");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
//class Advcal extends Calc
//{
//compilation error when final keyword is used in class ,it cant be inherited.
//}


public class finalclass {
    public static void main(String args[])
    {
//Advcal obj=new Advcal(); cant inherit.
Calc obj=new Calc();
obj.show();
obj.add(10,20);
    }
    
}
