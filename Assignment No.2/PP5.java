
class PP5

{
		public static void main(String args[])
		{
			int rowCount=9;
			int num=9;
			int i, j;
			for (i=1; i<=9; i++)
			{
				for(j=1; j<=2*num; j++)
				{ 
					System.out.print(" ");
				}
				for(j=rowCount; j<=9; j++)
				{ 
					System.out.print(j+" ");
				}
				
				
				for(j=8; j>=num; j--)
				{ 
					System.out.print(j+" ");
				}
				
				System.out.println();
				rowCount--;
				num--;
			}
		}
	}