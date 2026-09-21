public class Array2d
{
    public static void main (String args[])
    {
        int nums[][] = new int[3][4];
        for(int i=0; i<3 ;i++)
        {
            for(int j=0; j<4; j++)
            {
                nums[i][j]=(int)(Math.random()*100);//it will assign the values from 1-10,if you 100 it assign 
              //  values from 1-100.
                System.out.print(nums[i][j] + " ");//if values are not assigned it bydefault
              //.  consider 0 for all elements
            }
            System.out.println();
        }
    }
}