package firstStep;

public class Question32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test32 ob1 = new Test32(10,20);
		System.out.println();
		Test32 ob2 = new Test32(12.4,9.45);
		System.out.println();
		Test32 ob3 = new Test32('Z','p');
	}

}
class Test32{
	public Test32(int a, int b) {
		if(a > b) {
			System.out.print("max = "+a);
		}else if (a == b) {
			System.out.print("same value");
		} else {			
			System.out.print("max = "+b);
		}
	}
	public Test32(double a, double b) {
		if(a > b) {
			System.out.print("max = "+a);
		}else if (a == b) {
			System.out.print("same value");
		} else {			
			System.out.print("max = "+b);
		}
	}
	public Test32(char a, char b) {
		if(a > b) {
			System.out.print("max = "+a);
		}else if (a == b) {
			System.out.print("same value");
		} else {			
			System.out.print("max = "+b);
		}
	}
	
}