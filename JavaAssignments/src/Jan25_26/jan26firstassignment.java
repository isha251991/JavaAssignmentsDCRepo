package Jan25_26;

public class jan26firstassignment {

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
		int mul=j.mul(10, 2);
		int sum1=j.sum(mul, 2);
		int sum2=j.sum(sum1, 2);
		int sub=j.sub(sum2, 2);
		int div=j.div(sub, 2);
		
		System.out.println("The result is "+div);
	}
}
