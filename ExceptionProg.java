class ExceptionProg
{


public static void main(String ...args)
{
String str="Success is a journey";
String arr[]=str.split(" ");

try
{
for(int i=0;i<=arr.length;i++)
{
System.out.println(arr[i]);           // after print the whole array is generate exception...i.e... ArrayIndexOutOfBound Exception...and terminate the program.

}
}catch(Exception e)
{
System.out.println("Exception Occurred..........");
}
System.out.println(arr[0]+arr[1]);

}



}