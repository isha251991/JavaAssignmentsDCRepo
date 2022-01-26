package jan16_22Jan_SingleLoop;

import java.util.Scanner;

public class fibonacciSeries {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter upto how many numbers you want to print the fibonacci");
		int a=s.nextInt();
		int firstnumber=0;
		int secondnumber=1;
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		
		for(int i=3;i<=12;i++) {
			int sum=firstnumber+secondnumber;
			System.out.println(sum);
			firstnumber=secondnumber;
			secondnumber=sum;
		}
	}
}
