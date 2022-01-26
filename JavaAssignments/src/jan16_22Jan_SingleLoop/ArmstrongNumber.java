package jan16_22Jan_SingleLoop;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int sum=0,rem=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check");
		int a=s.nextInt();
		int number=a;	
		while(number>0) {	
		rem=number%10;
		sum+=rem*rem*rem;
		number=number/10;		
		}	
		if(sum==a)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not armstrong");
		
	}

}
