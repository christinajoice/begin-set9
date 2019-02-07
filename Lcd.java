import java.io.*;
import java.util.*;
public class Lcd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter two numbers");
int n1=s.nextInt();
int n2=s.nextInt();
int lcd=1;
int min=Math.min(n1,n2);
int max=Math.max(n1,n2);
for(int i=1;i<=min;i++)
{
if((max%n1==0) && (max%n2==0))
{
lcd=max;
}
else
{
max=max*i;
}
}
System.out.println(lcd);
}
}
