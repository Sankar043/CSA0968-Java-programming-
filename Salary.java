import java.util.*;
class salary
{
public static void main(String[] arg)
{
try{
     int sal;
     float bonus,tot,extra,t;
     char grade;
Scanner sc=new Scanner(System.in);
System.out.println("enter your grade:");
grade=sc.next().charAt(0);
System.out.println("enter your salary");
sal=sc.nextInt();
if(grade=='B')
{
if(sal>0)
{
System.out.println("salary=" +sal);
bonus=(sal*10)/100;
System.out.println("Bonus=" +bonus);
tot=sal+bonus;
System.out.println("total to be paid:" +tot);
}
else
{
System.out.println("invalid salary");
}
}
else if(grade=='A')
{
if(sal<10000)
{
System.out.println("salary=" +sal);
bonus=(sal*5)/100;
extra=(sal*2)/100;
t=bonus+extra;
System.out.println("Bonus=" +t);
tot=sal+bonus+extra;
System.out.println("total to be paid:" +tot);
}
}
else
{
System.out.println("invalid character");
}
}
catch(Exception e)
{
System.out.println("invalid");
}
}
}
