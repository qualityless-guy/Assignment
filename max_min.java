import java.util.*;
public class max_min
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n,i,j;
        System.out.println("Enter the number of rows");
        m=sc.nextInt();
        System.out.println("Enter the number of columns of the matrix ");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("matrix: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        int maxNum = a[0][0];
        int minNum = a[0][0];
        for (i = 0; i < a.length; i++) 
        {
            for (j = 0; j < a[i].length; j++) 
          {
            if(maxNum < a[i][j])
            {
             maxNum = a[i][j];
            }        
            else if(minNum > a[i][j])
            {
            minNum = a[i][j];
            }
          }
        }
        System.out.println("Largest number: " 
        + maxNum + " Smallest number: " + minNum);
    }
}