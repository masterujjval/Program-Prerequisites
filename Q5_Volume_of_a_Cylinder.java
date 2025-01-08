import java.util.Scanner;
public class Cylinder{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("Enter the radius: ");
		double rad=sc.nextDouble();

		System.out.printf("Enter the height: ");
		double height=sc.nextDouble();


		double ans=3.17*rad*rad*height;
		System.out.printf("The volumne of Cylinder is %f%n", ans);
	}
}

