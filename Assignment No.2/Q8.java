

class Q8
	{
		public static void main(String args[])
		{
			int rowCount=5;
			int i, j;
			for (i=1; i<=5; i++)
			{
				for(j=4; j>=i; j--)
				{ 
					System.out.print(" ");
				}
				for(j=rowCount; j<=5; j++)
				{ 
					System.out.print(j+" ");
				}
				
				System.out.println();
				
				rowCount--;
			}
		}
	}