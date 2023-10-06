import java.util.*;
public class print_diagonal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,i,j;
        System.out.println("Enter the order the square matrix");
        m=sc.nextInt();
        int a[][]= new int [m][m];
        System.out.println("Enter the elements of the square matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("Matrix: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        System.out.println("The diagonal elements of the given matrix is");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==j)
                System.out.print(a[i][j]+"\t");
                else if (i+j==m-1)
                System.out.print(a[i][j]+"\t");
                else
                System.out.print(" "+"\t");
            }
            System.out.println();
        }
    }
}