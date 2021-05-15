package firstStep;

public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test28 ob = new Test28();
		print(ob);
	}

	private static void print(Test28 ob) {
		// TODO Auto-generated method stub
		System.out.printf("»ï°¢ÇüÀÇ ³ĞÀÌ : %.2f",ob.getArea());
		System.out.printf("\nºøº¯±æÀÌ : %.2f",ob.getHypotenuse());
		System.out.printf("\nµÑ·¹±æÀÌ:  %.2f",ob.getPerimeter());
	}

}

class Test28{
	double base = 5.0;
	double height = 3.5;
	public double getArea() {
		return base * height / 2;
	}
	public double getHypotenuse() {
		return Math.sqrt(base*base+height*height);
	}
	public double getPerimeter() {
		return base+height+this.getHypotenuse();
	}
}