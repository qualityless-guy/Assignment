import java.util.*;
public class snippet
{
    int number(int n)
    {
        if(n>0)
        return 0;
        else 
        return (n*number(n-1));
    }
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
    snippet ob=new snippet();
    int b=ob.number(a);
    System.out.println(b);
}
}