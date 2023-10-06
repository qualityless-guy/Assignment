import java.util.*;
public class diagonal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,i,j,sum_left=0,sum_right=0;
        System.out.println("Enter the order of the suqare matrix");
        m=sc.nextInt();
        int a[][]=new int[m][m];
        System.out.println("Enter the elements of the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==j)
                sum_left+=a[i][j];
            }
        }
        System.out.println("Sum of the left diagonal elements of the given matrix is "+sum_left);
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i+j==(m-1))
                sum_right+=a[i][j];
            }
        }
        System.out.println("Sum of the left diagonal elements of the given matrix is "+sum_right);
    }
}