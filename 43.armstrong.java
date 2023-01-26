import java.util.Scanner;
import java.lang.Math;
public class armstrong
{
static boolean isArmstrong(int n)
{
int temp,digits=0,last=0;
double sum=0;
temp=n;
while(temp>0)
{
temp=temp/10;
digits++;
}
temp=n;
while(temp>0)
{
last=temp%10;
sum=sum+(Math.pow(last,digits));
temp=temp/10;
}
if(n==sum)
   return true;
else
    return false;
}
public static void main(String[] arg)
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number: ");
num=sc.nextInt();
System.out.println("armstronng number up to" +num +"are:");
for(int i=0;i<=num;i++)
{
   if(isArmstrong(i))
        System.out.print(i+",");
    }
}
}
