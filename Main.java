# project-5
import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
if((n%400==0)||(n%4==0))
{
System.out.println("leapyear");
}
else
{
System.out.println("not a leapyear");
}
}
}
