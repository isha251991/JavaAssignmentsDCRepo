package jan16_22Jan_SingleLoop;

import java.util.Scanner;

public class swappingWithoutThirdVariable {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		System.out.println("Before Swapping a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a="+a+" b="+b);
		
	}

}
