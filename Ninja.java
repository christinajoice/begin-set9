import java.util.*;
import java.io.*;
public class Ninja
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[10];
int b[]=new int[10];
System.out.println("Enter the number of rows");
System.out.println("Enter number of kabali's ninjas and opponent ninjas in each line");
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
b[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
if(b[i]>a[i])
{
System.out.println(b[i]-a[i]);
}
}
}
}
