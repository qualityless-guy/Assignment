import java.util.*;
public class power
{
    int pow(int m, int n)
    {
        if (n==0)
        return 1;
        else
        return m*pow(m,(n-1));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a,b,c;
        System.out.println("Enter the base number");
        a=sc.nextInt();
        System.out.println("Enter the radix  number");
        b=sc.nextInt();
        power ob=new power();
        c=ob.pow(a,b);
        System.out.println(a+" raised to power "+b+" is "+c);
    }
}