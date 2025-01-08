import java.util.Scanner;

public class Cylinder{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter the Base: ");
		double b=sc.nextDouble();

		System.out.printf("Enter the Exponent: ");
		double e=sc.nextDouble();


		double ans=Math.pow(b,e);
		System.out.println("The answer is: "+ans);
	}
}
