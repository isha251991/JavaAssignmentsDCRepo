package jan16_22Jan_SingleLoop;

import java.util.Scanner;

public class pallindromeNumber {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		int rem,temp=a,sum=0;
		while(temp>0) {
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}
		 if(sum==a)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
	}

