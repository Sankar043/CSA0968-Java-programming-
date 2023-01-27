import java.util.Scanner;
class subject
{
public static void main(String[] arg)
{
try{
  int c,c1,py,ja;
  int tot;
  float avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter c programming mark:");
c=sc.nextInt();
System.out.println("enter c++ programming mark:");
c1=sc.nextInt();
System.out.println("enter python programming mark:");
py=sc.nextInt();
System.out.println("enter java programming mark:");
ja=sc.nextInt();
tot=c+c1+py+ja;
System.out.println("total:" +tot);
avg=tot/4;
System.out.println("aggregate:" +avg);
if(tot>=200 && tot<=400)
{
if(avg>=75)
  System.out.println("distinction");
else if(avg>=60 && avg<75)
  System.out.println("first division");
else if(avg>=50 && avg<60)
  System.out.println("second division");
else if(avg>=40 && avg<50)
  System.out.println("third division");
else
  System.out.println("fail");
}
else
{
System.out.println("invalid range");
} 
}
catch(Exception e)
  {
System.out.println("invalid");
}
}
}
