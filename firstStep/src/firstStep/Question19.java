package firstStep;

public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ϱ� : "+sum(3,5));
		System.out.println("���� : "+sub(7,2));
		System.out.println("���ϱ� : "+mul(4,5));
		System.out.println("������ : "+div(7,3));
		
	}

	private static String div(int i, int j) {
		// TODO Auto-generated method string
		return String.format("%.2f", ((double)i/j));
	}

	private static String mul(int i, int j) {
		// TODO Auto-generated method stub
		return ""+(i*j);
	}

	private static String sub(int i, int j) {
		// TODO Auto-generated method stub
		return ""+(i-j);
	}

	private static String sum(int i, int j) {
		// TODO Auto-generated method stub
		return ""+(i+j);
	}

}
