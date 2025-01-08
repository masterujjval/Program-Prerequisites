import java.util.Scanner;
public class Simple{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter the Principal Amount: ");
		double p=sc.nextDouble();

		System.out.printf("Enter the Rate of Interest: ");
		double Rate=sc.nextDouble();


		System.out.printf("Enter the Time: ");
		
		double t=sc.nextDouble();
		double ans=(p*Rate*t)/100;
		
		System.out.printf("The Simple Interest is %f%n", ans);
	}
}
