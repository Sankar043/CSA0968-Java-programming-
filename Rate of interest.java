import java.util.Scanner;

class Rateofintrest;

{

    public static void main(String[] args)

    {

        int p,t,r;

	    float si;	    String s;

        Scanner sc=new Scanner(System.in);

	    System.out.println("Senior citizen(yes/no): ");

	    s=sc.nextLine();

		System.out.print("Enter the principle ammount: ");

		p=sc.nextInt();

		System.out.print("Enter the time period: ");

		t=sc.nextInt();

		if(s.equals("yes"))

	    {

	        r=12;

si=(p*t*r)/100;

	        System.out.println("Simple interest= "+si);

	    }

	    else if(s.equals("no"))

	    {

	        r=10;

	        si=(p*t*r)/100;

	        System.out.println("Simple interest= "+si);

	    }

	    else

	    {

	        System.out.println("Invalid");

	    }

    }

	

}
