class computer{
    public void playmusic()
    {
        System.out.println("play Music...");
    }
    public String getmepen(int cost)
    {
        if (cost>=10)
        return "pen";
        else 
        return"ntg";
    }
}  
  
  
  
  class demo
{
public static void main(String[]args)
{
computer obj=new computer();
obj.playmusic();
 String str=obj.getmepen(15);
 System.out.println(str);
}

}