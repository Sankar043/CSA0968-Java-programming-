import java.util.Scanner;
class multiplication
{
public static void main(String[] arg)
{
try{
   int m,n;
Scanner sc=new Scanner(System.in);
System.out.print("m=");
m=sc.nextInt();
System.out.print("n=");
n=sc.nextInt();
if(n>0 && m>0)
{
for(int i=1;i<=n;i++)
   System.out.println(i +"*" +m +"=" +(i*m));
} 
else
   System.out.println("invalid n value");
}
catch(Exception e)
    {
      System.out.println("invalid");
    }
}
}
