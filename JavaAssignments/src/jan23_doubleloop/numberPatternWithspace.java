package jan23_doubleloop;

import java.util.Scanner;

public class numberPatternWithspace {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=s.nextInt();
		int n=1;	
		for(int i=1;i<=row;i++) {

			for(int j=1;j<=i;j++) {
				System.out.print(n++);
				System.out.print(" ");

			}
			System.out.println();

		}

	}

}


