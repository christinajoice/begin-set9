import java.io.*;
import java,util.*;
public class Stringop
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String str=s.nextLine();
for(int i=0;i<str.length();i+2)
{
System.out.print(str.next().charAt(i);
}
for(int i=1;i<str.length();i+2)
{
System.out.print(str.charAt(i);
}
}
}
