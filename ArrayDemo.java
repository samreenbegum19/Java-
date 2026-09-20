public class ArrayDemo
{
    public static void main(String args [])
    {
        int nums[]={5,8,9};//array creation.
        int num[]=new int[5];// by default all boxes will be empty and the index size is 4.
         num[0]=10;//intializing the values for the default array.
         num[1]=20;
         num[2]=30;
         num[3]=40;
         num[4]=50;

        nums[1]=6;// updating the value of 8 to 6 .considering the index number 1.
        System.out.println(nums[0]);//through index number the value is obtained .
     //time consumming   System.out.println(nums[1]);
      //  System.out.println(num[0]);
      //  System.out.println(num[1]);
       // System.out.println(num[2]);
       // System.out.println(num[3]);
      //  System.out.println(num[4]); to overcome this problem we can use loop
      for(int i=0;i<=4;i++)
        {
System.out.println(num[i]);
      }



    }
}