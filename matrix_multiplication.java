import java.util.*;
public class matrix_multiplication
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,k,m,n,p,q,sum;
        System.out.println("Enter the number of  rows of first matrix");
        m=sc.nextInt();
        System.out.println("Enter the number of coulumns of the first matrix");
        n=sc.nextInt();
        System.out.println("Enter the number of rows of the second matrix");
        p=sc.nextInt();
        System.out.println("Enter the number of the columns of the second matrix");
        q=sc.nextInt();
        if(n!=p)
        System.out.println("Matrix multiplication is not possible");
        else
        {
            int a[][]=new int[m][n];
            int b[][]=new int[p][q];
            int c[][]=new int[m][q];
            System.out.println("Enter the elements of the first matrix");
            for(i=0;i<m;i++)
            {
                for(j=0;j<n;j++)
                {
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the elements of the second matrix");
            for(i=0;i<p;i++)
            {
                for(j=0;j<q;j++)
                {
                    b[i][j]=sc.nextInt();
                }
            }
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    sum=0;
                    for(k=0;k<p;k++)
                    {
                        sum=sum+a[i][j]*b[k][j];
                    }
                    c[i][j]=sum;
                }
            }
            System.out.println("the resultant matrix is ");
            for(i=0;i<m;i++)
            {
                for(j=0;j<q;j++)
                {
                    System.out.print(c[i][j]+ "\t");
                }
                System.out.println();
            }
        }
    }
}