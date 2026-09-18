//import tools.Calc;// TO use the tool package

//import java.util.ArrayList;// bydefault built in for DSA

//import tools.Advcalc;
import tools.*;// to use the tool package.with * it provide all  files present in the tools package.
import java.lang.*;//it is by default even if is invisible.for system class.
import other.tools.*;// it imports all files present in other and tools folder.
import others.Advcalc;
import others.Calc;
public class Demo {
  public static void main(String args[]) 
  {
    ArrayList list =new ArrayList<>();
   Calc obj=new Calc();// it can be accesed by importing the packages.
   Advcalc obj1=new Advcalc();
   //class belongs to package.
   System.out.println();// System is a class,it is imported by package by default import.java.lang.
  } 
}
