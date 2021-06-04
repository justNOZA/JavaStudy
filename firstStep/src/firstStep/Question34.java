package firstStep;

public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test34 ob = new Test34("야철대장", 85000000, "철가방");
		ob.getInformation();
		ob.getInformationV2();
		// iOS _ Strudy2 git commiut   해었음
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
		System.out.printf("이름: %s", this.name);
		System.out.printf("\n연봉: %s", this.salary);
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
		System.out.printf("\n부서: %s", this.department);
	}
}