
public class Palindrome {
	
	public static void main(String[] args) {
		
		
		String num="1221";
		
		String result=new StringBuilder(num).reverse().toString();
		
		if(num.equals(result))
		{
			System.out.println("yes");
			
		}else
		{
			System.out.println("No");
		}
		
		
	}
}
