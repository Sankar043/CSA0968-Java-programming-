import java.util.Scanner;
class Interest{
    public static double calculateInterest(double principal, double rate, int years, boolean isSeniorCitizen) {
        if (isSeniorCitizen) {
            rate = 0.12;
        } else {
            rate = 0.1;
        }
        return (principal * rate * years);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        System.out.print("Are you a senior citizen? (true/false): ");
        boolean isSeniorCitizen = sc.nextBoolean();
        double interest = calculateInterest(principal, 0, years, isSeniorCitizen);
        System.out.println("Interest: " + interest);
    }
}
