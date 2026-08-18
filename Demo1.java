class Demo1{
    public static void main(String []args)
    {

        String S1="Java";
        String S2="Java";
        String S3="Python";
        System.out.println(S1==S2); // it checks whether 2 variables refer to same object/reference.
        System.out.println(S1.equals(S2));// it checks whether 2 strings have the same content(imp).
        System.out.println(S2.equals(S3));

    }
}