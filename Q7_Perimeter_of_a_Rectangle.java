import java.util.Scanner;
public class Perimeter{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter the Length: ");
		double l=sc.nextDouble();

		System.out.printf("Enter the width: ");
		double w=sc.nextDouble();


		double ans=2*(l+w);
		System.out.printf("The perimeter of rectangle is %f%n", ans);
	}
}
