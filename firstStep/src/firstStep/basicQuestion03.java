package firstStep;

public class basicQuestion03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pay = 1500000;
		int bonus = 55000;
		int tax = 10;
		int result = actualAmount(pay, bonus, tax);
		System.out.printf("실 수령액 : %d원", result);
	}
	
	public static int actualAmount(int a, int b, int c) {
		return (a + b) - (a * c / 100);
	}

}
