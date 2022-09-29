

class PP4

{
		public static void main(String args[])
		{
			int rowCount=1;
			int num=9;
			int i, j;
			for (i=1; i<=9; i++)
			{
				for(j=1; j<=2*num; j++)
				{ 
					System.out.print(" ");
				}
				for(j=1; j<=rowCount; j++)
				{ 
					System.out.print(j+" ");
				}
				
				
				for(j=i-1; j>=1; j--)
				{ 
					System.out.print(j+" ");
				}
				
				System.out.println();
				rowCount++;
				num--;
			}
		}
	}