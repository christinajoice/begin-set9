import java.io.*;
import java.util.*;
public class Area
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.prntln("Enter the length and breadth of the farm");
float length=s.nextInt();
float breadth=s.nextInt();
float area=length*breadth;
System.out.format("%.5f",area);
}
}
