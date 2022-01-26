package jan16_22Jan_SingleLoop;

import java.util.Scanner;

public class swappingNumbers {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c=0;
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		System.out.println("Before Swapping a="+a+" b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping a="+a+" b="+b);
		
	}
}
