 class cal
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}
 class advcal extends cal
{
    public int multi(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}
class  veryadvcal extends advcal
{
    public double power(int n1,int n2)
    {
        return Math.pow(n1, n2);
    }
}

public class multiinhertdemo
{
    public static void main(String []args)
    {
      //  cal obj=new cal();
       // advcal obj= new advcal();
        veryadvcal obj=new veryadvcal();
        int r1=obj.add(10,20 );
        int r2=obj.sub(45, 10);
        int r3=obj.multi(10, 5);
        int r4=obj.div(10, 5);
        double r5=obj.power(4, 2);
        System.out.println(r1+" :"+r2+" :"+r3+" :"+r4 +" :"+r5);



    }
}