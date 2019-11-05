
public class CompressedString {

	//  aaaaabbbbccc=a5b4c3;
	
	public  static void result(String str)
	{
	    int n=str.length();
	    while(n>0)
	    {
	    	char ch=str.charAt(0);
	    	System.out.print(ch+""+count(str,ch));
	    	str=str.replace(" "+ch,"");	
	    }	
	}
	
	public static int count(String str,char ch) 
	{
		int counter=0;
		while(str.indexOf(ch)!=-1)
		{
			counter++;
			str=str.substring((str.indexOf(ch)+1));
		}
		
		return counter;
	}
	
	
	
	public static void main(String[] args) {
		
	
	String str="aaaaabbbbccc";
	result(str);
	}
	
	
	
	
	
	
	
}
