package firstStep;

public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test29 ob = new Test29();
		print(ob);
	}

	private static void print(Test29 ob) {
		// TODO Auto-generated method stub
		System.out.printf("���� ���� : %f",ob.area(3));
		System.out.printf("\n�簢���� ���� : %.2f",ob.area(4,5));
		System.out.printf("\n��ٸ����� ���� : %.2f",ob.area(3,4,7));
	}

}

class Test29{
	final double PI = Math.PI;
	
	public double area(int a) {
		return a*a*this.PI;
	}
	public double area(int a, int b) {
		return a*b;
	}
	public double area(int a, int b, int c) {
		return ((double)a+b)*c/2;
	}
}