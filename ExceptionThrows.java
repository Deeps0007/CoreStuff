class ExceptionThrows
{

static void division() throws Exception
{
int a=10,b=0;

if(b==0)
{
throw new ArithmeticException("denominator can't be zer0");
}else
{
int c=a/b;
System.out.println("Result :"+c);
}

}

public static void main(String ...args)
{
try
{
division();
}
catch(Exception e)
{System.out.println("Exception Occured...");}
}}