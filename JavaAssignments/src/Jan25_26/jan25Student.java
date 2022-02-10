package Jan25_26;

public class jan25Student {

	String name;
	int age;
	int rollno;
	
	public void display1() {
		System.out.println("Welcome all of you");
	}
	
	public void display2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		jan25Student s=new jan25Student();
		s.age=21;
		s.name="Isha";
		s.rollno=9;
		s.display1();
		s.display2();
		System.out.println("Student details are Name="+s.name+" Age= "+s.age+" Rollno="+s.rollno);
	}
}
