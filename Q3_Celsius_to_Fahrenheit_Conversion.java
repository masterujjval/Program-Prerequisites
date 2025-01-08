import java.util.Scanner;
public class Ftoc{
	public static void main(String []args){
		double cel;
		Scanner input=new Scanner(System.in);

		System.out.println("Enter the temperature in Celsius");
		cel=input.nextDouble();

		double farhen=(cel*9/5)+32.00;

		System.out.println("Temperature in Farhenheit is: ");
		System.out.println(farhen);
	}
}
