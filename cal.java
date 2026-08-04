class calculator
{

public int add(int n1,int n2)
{

    int r=n1+n2;
    return r;
}
}

class cal{
    public static void main(String []args)
    {
        int num1=10;
        int num2=10;
        calculator calc=new calculator();
        int result=calc.add(num1,num2);
        System.out.println(result);

    }
}