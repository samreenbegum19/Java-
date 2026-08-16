 class Laptop{
    String model;// instance  variable, but not shared by all objects ,it must be written individually for each object and 
    //it is not shared.
    int ram;
    double price;
    static String category;// static variables it is shared by all objects


    static{// static block

         category="Electronics";// variables can't be declared at static block.
         System.out.println("Static block executed");
    }

    public Laptop(){ // constructor assign the values for the varaibles.and dont forget paranthesis.

        model="first";
        ram=19;
        price=10000.0;
        System.out.println("Constructer executed");
    }
    public void show(){// mwthod of the class
        System.out.println(model +" :" + ram + " :" + price +" :" +category);
    }
    
 }


public class pract {
    public static void main(String []args) // main method program starts fromhere.
    {
        Laptop obj1 = new Laptop(); // obj creation.
//obj1.model="first";// it is already initialised at constructor.
//obj1.ram="19Gb";
      //  obj1.price=10000.0;
        obj1.show();// call method.since whe are using void at method so,we need to use show() not display().

    }
    
}
