import java.util.*;
public class OccurenceChar{

public static void main(String[] args) {
	
	String str="Thanks for visiting my blog";
	int count=0;
	str=str.replace(" ","");
	
	while(str.length()>0)
	{
                                           int prev=str.length();
		char ch=str.charAt(0);
		str=str.replace(""+ch, "");
		int after=str.length();
		
		
		System.out.print(ch+"="+(prev-after)+" ");
	}	
	
	
	
	
	
}

}