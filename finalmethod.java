class Calc
{
    public final void show()
    {
        System.out.println("in A show");
    }
  //  public void show()
   // {
   //     System.out.println("in A");
  //  }
    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}
class Advcalc extends Calc{
    
}


public class finalmethod {
    public static void main(String args [])
    {
Advcalc obj =new Advcalc();
obj.show();
obj.add(10, 20);
    }
}
