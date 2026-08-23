class Mobile{
String brand;
int price;
String network;
static String name;
public void show()
{

    System.out.println(brand +"  :" + price +"  :"+ name);
}

public static void show1(Mobile obj){// static merthod it can only access static variabes .
    
    System.out.println(obj.brand +" :"+obj.price+":  "+obj.name);
}

}
public class exe
{
      public static void main(String []args)
            {
Mobile obj1 =new Mobile();
obj1.brand="Apple";
obj1.price=100000;
Mobile.name="SmartPhone";

Mobile obj2=new Mobile();
obj2.brand="Samsung";
obj2.price=70000;
Mobile.name="SmartPhone";

obj1.show();
obj2.show();
Mobile.show1(obj1);// static variables cant access instance variable to access it we need to prefer it with parameters or objects.
            }
         }    