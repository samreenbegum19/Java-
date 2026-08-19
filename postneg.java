
import java.util.Scanner;
class postneg{
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    
        int x=sc.nextInt();
      
      int y=sc.nextInt();
      int z=sc.nextInt();
       
        if(x>0)
        {
            System.out.println(x);
        }
        else if(y<0)
        {
            System.out.println(y);
        }
else if(z==0)
        {
    System.out.println(z);
        }
else   {
    System.out.println("invalid number");
       }
sc.close();


    }
}