package Jan25_26;

public class jan26secondassignment {
	
	public int sum(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}
	
	public int div(int a,int b) {
		return a/b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	public static void main(String[] args) {
		jan26firstassignment j=new jan26firstassignment();
		int div=j.div(10, 2);
		int sub1=j.sub(div, 2);
		int sum1=j.sum(sub1, 2);
		int sub2=j.sub(sum1, 2);
		int mul=j.mul(sub2, 2);
		
		System.out.println("The result is "+mul);
	}

}
