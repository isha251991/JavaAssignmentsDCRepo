package Jan9Assignments;

import java.util.Scanner;

public class userInputs2 {
	public int sum(int a,int b) {
		return(a+b);
	}
	public int sub(int a,int b) {
		return(a-b);
	}
	public int mul(int a,int b) {
		return(a*b);
	}
	public int div(int a,int b) {
		return(a/b);
	}

	public static void main(String args[]) {
		userInputs2 ui=new userInputs2();
		Scanner s =new Scanner(System.in);

		System.out.println("Please enter the value");
		int x1=s.nextInt();
		System.out.println("Please enter the value");
		int x2=s.nextInt();
		System.out.println("Please enter the value");		
		int x3=s.nextInt();
		System.out.println("Please enter the value");
		int x4=s.nextInt();
		System.out.println("Please enter the value");
		int x5=s.nextInt();
		System.out.println("Please enter the value");
		int x6=s.nextInt();

		int mul1=ui.mul(x1, x2);
		int sum1=ui.sum(mul1, x3);
		int sum2=ui.sum(sum1, x4);
		int sub1=ui.sub(sum2, x5);
		int div1=ui.div(sub1, x6);

		System.out.println("The final result is "+div1);
	}
}