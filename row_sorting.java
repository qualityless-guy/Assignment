import java.util.Scanner;
public class row_sorting 
{
	public static void main(String args[])
	{
        	Scanner sc =new Scanner(System.in);
        	System.out.println("Enter the number of rows of matrix");
        	int m=sc.nextInt();
        	System.out.println("Enter the number of columns of matrix");
        	int n=sc.nextInt();
        	
		int a[][] = new int[m][n];
		
		System.out.println("Enter the elements of matrix");
		for(int i=0;i<m;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        a[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("Elements of the array before sorting. ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}

		for (int i = 0; i < a.length; i++)
		{
			
			for (int j = 0; j < a[i].length; j++) 
			{
        			for (int k = 0; k < a[i].length - j - 1; k++) 
        			{
					if (a[i][k] > a[i][k + 1])
					{
						int t = a[i][k];
						a[i][k] = a[i][k + 1];
						a[i][k + 1] = t;
					}
				}
			}
		}
		System.out.println("Elements of the array after sorting. ");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}
	}

	
}