package jan16_22Jan_SingleLoop;

import java.util.Scanner;

public class primeNumber {
	
	public static void main(String[] args) {
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		if(a==0||a==1)
		System.out.println(a+ " is not prime number");
		for(int i=2;i<a/2;i++) {	
			if(a%i==0) {
				flag=false;
				break;
			}
			
		}
		if(flag==false)
			System.out.println(a+ " is not prime number");
		else
			System.out.println(a+ " is prime number");	
	
	}

}
