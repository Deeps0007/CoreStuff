class PassValidation extends Exception
{

PassValidation(String str)
{
super(str);

}

}


class CustomException
{



public void check(String p,String name)  throws Exception
{
if(p.length()<8)
{
throw new PassValidation("password length must be greater than 8");
}else 
{
System.out.println("Hello "+name+" Your password is accepted.");
}

}

public static void main(String ...args)
{
String name="Deepanshu";
String pass="deeps";

CustomException cp=new CustomException();
try
{
cp.check(pass,name);
}
catch(Exception pv)
{
System.out.println("Exception occured"+pv);
}
}

}