import java.util.*;
public class sum_of_corner_ppoints
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j,s;
        System.out.println("Enter the number of rows");
        m=sc.nextInt();
        System.out.println("Enter the number of columns");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter  the elements of the matrix ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("The matrix is: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        s=a[0][0]+a[0][n-1]+a[n-1][0]+a[m-1][n-1];
        System.out.println("Sum of the corner elements of the given matrix is "+s);
    }
}