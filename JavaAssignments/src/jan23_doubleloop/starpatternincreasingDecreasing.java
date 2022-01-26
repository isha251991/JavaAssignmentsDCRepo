package jan23_doubleloop;

import java.util.Scanner;

public class starpatternincreasingDecreasing {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of rows");
		int row=s.nextInt();
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		for(int i=row;i>=1;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}

}
