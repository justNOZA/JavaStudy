package firstStep;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] result = output(10,"#");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}

	private static String[] output(int i, String string) {
		// TODO Auto-generated method stub
		String[] result = new  String[i];
		for(int j = 0; j < result.length; j++) {
			result[j] = string;
		}
		return result;
	}

}
