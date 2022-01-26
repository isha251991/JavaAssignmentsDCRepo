package Jan9Assignments;

import java.util.Scanner;

public class UserInputs1 {
	
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
		UserInputs1 ui=new UserInputs1();
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
		
		int sum1=ui.sum(x1,x2);
		int sub1=ui.sub(sum1, x3);
		int sub2=ui.sub(sub1,x4);
		int mul1=ui.mul(sub2, x5);
		int div1=ui.div(mul1, x6);
		
		System.out.println("The final result is "+div1);
		
	}

}
