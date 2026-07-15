class less{
    public static void main(String []args)
    {
        int x=20;
        int y=30;
        int z=40;
        if (x<y && y<z)
        {
            System.out.println(x);

        }
        else if(y<x && y<z)
        {
            System.out.println(y);

        }
        else{
            System.out.println(z);
        }
    }
}