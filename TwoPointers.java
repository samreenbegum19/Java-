public class TwoPointers
{
    public static void main (String []args)
    {
        int [] a={1,2,3,4,5,6};
        int n=a.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
        i++;
        j--;
        }
        if(i==j)
        {
            System.out.println("odd");
        }
            else
            {
                System.out.println("even");
            }
        
    }
}