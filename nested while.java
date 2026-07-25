class nested_while
{
    public static void main(String[]args)
{

    int i=1;
    while(i<=5)
    {
        System.out.println("hiii"  +i);
        int j=1;
        while(j<=3)
        {
            System.out.println("bye"  +j);
            j++;
        }
        i++;
        System.out.println("good bye");
    }
}

}