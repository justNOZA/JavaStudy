package firstStep;

public class basicQuestion02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int money = 65430;
		int[] result = countNote(money);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	public static int[] countNote(int money) {
		int[] result = new int[4];
		result[0] = money/10000;
		result[1] = (money%10000)/1000;
		result[2] = (money%1000)/100;
		result[3] = (money%100)/10;
		return result;
	}
}
