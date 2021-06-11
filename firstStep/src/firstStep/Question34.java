package firstStep;

public class Question34 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test34 ob = new Test34("æﬂ√∂¥Î¿Â", 85000000, "√∂∞°πÊ");
		ob.getInformation();
		ob.getInformationV2();
	}
}

class Salary {
	String name;
	int salary;
	
	public Salary(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void getInformation() {
		System.out.printf("¿Ã∏ß: %s", this.name);
		System.out.printf("\nø¨∫¿: %s", this.salary);
	}
}

class Test34 extends Salary {
	
	String department;
	
	public Test34(String name, int salary, String department) {
		super(name, salary);
		this.name = name;
		this.salary = salary;
		this.department = department;
		
	}
	
	public void getInformationV2() {
		System.out.printf("\n∫Œº≠: %s", this.department);
	}
}