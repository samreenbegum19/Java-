import java.util.Scanner;
public class menu
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("1.Home");
        System.out.println("2.About");
        System.out.println("3.Contact");
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("WELCOME TO THE PAGE");
                break;
                case 2:
                    System.out.println("This is About Page");
                    break;
                    case 3:
                        System.out.println("This is a contact page");
                        break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
        }
        
        
        sc.close();
            }
}