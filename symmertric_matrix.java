import java.util.*;
public class symmertric_matrix
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int m,i,j,k=0;
       System.out.println("Enter the order of the square matrix");
       m=sc.nextInt();
       int a[][]= new int[m][m];
       int b[][]= new int[m][m];
       System.out.println("Enter the elemenst of the square matrix");
       for(i=0;i<m;i++)
       {
           for(j=0;j<m;j++)
           {
               a[i][j]=sc.nextInt();
           }
       }
       for(i=0;i<m;i++)
       {
           for(j=0;j<m;j++)
           {
               b[i][j]=a[j][i];
               if(a[i][j]!=b[i][j])
               {
                   k=1;
                   break;
               }
           }
       }
       if(k==1)
       System.out.println("the matrix is not symmetrical");
       else
       System.out.println("the matrix is symmetrical");
    }
}