
class P6
{
	public static void main(String args[])
	{
	
	int n=5;
	int i, j;
	for (i=1; i<=9; i++)
			{	
				for(j=1; j<i; j++)   
				{
					System.out.print(" ");
				}
				for(j=i; j<n; j++)  
				{
					System.out.print("*");				
				}
				for(j=i; j<=n; j++)  
				{
					System.out.print("*");				
				}
				
				System.out.println();
			} 
	}
}