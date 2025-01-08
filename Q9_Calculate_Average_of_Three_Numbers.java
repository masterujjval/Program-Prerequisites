import java.util.Scanner;
public class Cylinder{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter the 1st number: ");
		double n=sc.nextDouble();

		System.out.printf("Enter the 2nd number: ");
		double b=sc.nextDouble();

		System.out.printf("Enter the 3rd number: ");
		double a=sc.nextDouble();

		double ans=(n+b+a)/3;
		System.out.println("The average of 3 integers is: " +ans);
	}
}
