class P9{
	public static void main(String args[]){
		char i;
		char j;
		
		for( i='A';i<='E';i++){
			for(j=i;j<'E';j++)
			{
				System.out.print(" ");
			}	
			for( j='A'; j<=i;j++)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}
}