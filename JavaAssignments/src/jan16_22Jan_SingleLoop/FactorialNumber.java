package jan16_22Jan_SingleLoop;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		for(int i=a-1;i>=1;i--) {
			a=a*i;
		}
	   System.out.println("Factorial of a number is "+a);
	}
}
