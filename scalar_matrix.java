import java.util.*;
public class scalar_matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,i,j,k=0,num;
        System.out.println("Enter the order of the matrix");
        m=sc.nextInt();
        int a[][]= new int[m][m];
        System.out.println("Enter the elemets of the matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        num=a[0][0];
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==j)
                {
                    if(a[i][j]!=num)
                    {
                        k=1;
                        break;
                    }
                }
            }
        }
        if(k==1)
        System.out.println("It is not a scalar matrix");
        else
        System.out.println("It is a scalar matrix");
    }
}