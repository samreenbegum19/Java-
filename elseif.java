import java.util.Scanner;
class cond{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(  age>=18 && age<=25)
        {
        System.out.println("she is an young");
        }
        else if( age>=25 && age<=30)
        {
            System.out.println(" she is adult");
        }
        else if(age>=30 && age<=50)
        {
            System.out.println("she is old");
        }
        
        else if(age>=13 && age<=18)
        {
            System.out.println("she is teen");
        }
        else{
            System.out.println("she is child");
        }
        sc.close();
    }
}