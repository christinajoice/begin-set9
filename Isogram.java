import java.io.*;
import java.util.*;
public class Isogram
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter  a string");
String str=s.nextLine();
for(int i=0;i<str.length();i++)
{
for(int j=0;j<str.length();j++)
{
if(i!=j)
{
if(str.charAt(i)==str.charAt(j))
{
System.out.println("no");
}
else
{
System.out.println("Yes");
}
}
}
}
}
}
