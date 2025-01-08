import java.util.Scanner;
public class circle{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The Radius of Circle: ");
		double x=sc.nextDouble();
		double rad=(3.17*x*x);
		System.out.printf("Area of Circle is : %f%n ",rad);
	}
}	
