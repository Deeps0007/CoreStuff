package patterns;

/*
 
 ######
 #            #
 #            #
 #            #
 ######
 */

public class Pattern01 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if(j>=3&&j<=5&i>=2&&i<=4)
				{
					
					System.out.print(" ");
					
				}
				else
				{
					System.out.print("#");
				}
				
			}
			System.out.println();
		}
		
	}
	
	
}
