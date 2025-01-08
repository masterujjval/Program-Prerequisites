import java.util.Scanner;
public class Ktom{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter the Kilometers: ");
		double km=sc.nextDouble();

		


		double ans=km*0.621371;
		System.out.printf("Kilometers in Miles is %f%n", ans);
	}
}
