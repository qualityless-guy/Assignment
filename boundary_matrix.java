import java.util.*;
public class boundary_matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,m,sum=0,sum1=0;
        System.out.println("Enter the order of the square matrix");
        m=sc.nextInt();
        int a[][]= new int[m][m];
        System.out.println("Enter the elements of the square matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is :");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                sum+=a[i][j];
            }
        }
        for(i=1;i<m-1;i++)
        {
            for(j=1;j<m-1;j++)
            {
                sum1+=a[i][j];
            }
        }
        System.out.println("the sum of the boundary elemets is "+(sum-sum1));
        System.out.println("The sum of the non boundary elements of the matrix is "+sum1);        
    }
}