class Mobile{
    String brand; //instance variable
    int price;
    static String name;
    public void show()
    {
System.out.println(brand +" :" + price + " :"+ name);
    }
}

public class staticDemo{
    public static void main(String[]args)
    {
Mobile obj1 =new Mobile();
obj1.brand="Apple"; // called by object.since it is a instance variable individually every variable as to be 
//called,// if it is local variable if once object is created means its enough.
obj1.price=1000000;
Mobile.name="Smartphone";// since it is a static keyword it is called with main class.

Mobile obj2=new Mobile();
obj2.brand="Samsung";
obj2.price=50_000;
        Mobile.name="Smartphone";

        obj1.show();
    obj2.show();
    }
}
