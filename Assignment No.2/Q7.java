
class Q7
	{
		public static void main(String args[])
		{
			int rowCount=1;
			int i, j;
			for (i=1; i<=5; i++)
			{
				for(j=4; j>=i; j--)
				{ 
					System.out.print(" ");
				}
				for(j=1; j<=rowCount; j++)
				{ 
					System.out.print(j+" ");
				}
				
				System.out.println();
				
				rowCount++;
			}
		}
	}