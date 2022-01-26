package jan16_22Jan_SingleLoop;

import java.util.Scanner;

public class table {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a+" * "+i+" is "+i*a);
		}
	}

}
