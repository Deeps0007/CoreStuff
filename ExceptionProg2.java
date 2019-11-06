class ExceptionProg2
{

static void check(int a)
{
if(a<18)
{
throw new ArithmeticException("Age can't be less than 18");
}
else
{
System.out.print("You are eligible for registration");
}

}


public static void main(String ...args)
{

check(20);

}

}