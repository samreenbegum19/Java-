public class demo{
    public static void main(String []args)
    {

        StringBuffer sb = new StringBuffer("Samreen");
      //  System.out.println(sb.capacity()); // by default it capacity is 16. it adds 16+7 =23.
//System.out.println(sb.length()); // it gives the length of string and it is 7 because of samreen word.
//sb.append(" begum");// it gives the output samreenbegum.
//sb.deleteCharAt (5); // it deletes the char that is present at index 4 ,which is r from the samreen.
//sb.insert(0, 0)// it is used replace the index place with a string.
sb.setLength(30);// it provide more lenth in horizontally.
sb.ensureCapacity(100);
System.out.println(sb);

    }


}