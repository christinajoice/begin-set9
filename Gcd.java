import java.io.*;
import java.util.*;
public class Gcd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers");
int n1=s.nextInt();
int n2=s.nextInt();
int gcd=1;
int min=Math.min(n1,n2);
for(int i=1;i<=min;i++)
{
if((n1%i==0)&& (n2%i==0))
{
gcd=gcd*i;
}
}
System.out.println(gcd);
}
}
