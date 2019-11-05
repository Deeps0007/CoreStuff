import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();               // if you want to reverse integer number.
		String input=String.valueOf(n);
		
		String result= new StringBuilder(input).reverse().toString();	
	
		System.out.println(result);
		
	}
	
	
}
