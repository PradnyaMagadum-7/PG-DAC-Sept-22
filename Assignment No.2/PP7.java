

class PP7
{
	public static void main(String args[])
	{
	int n=9;
	int i, j;
	for (i=1; i<=9; i++)
			{	
				for(j=1; j<=i; j++)  
				{
					System.out.print(" ");
				}
				for(j=9; j<=n; j--)  
				{
					System.out.print(j+" ");
				}
				
				System.out.println();
			} 
	}
}