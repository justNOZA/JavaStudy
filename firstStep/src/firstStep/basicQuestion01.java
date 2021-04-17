package firstStep;

public class basicQuestion01 {

	public static void main(String[] args) {
		String a = "100";
		String b = "200";
		System.out.println(solution(a,b));
	}
	
	public static int solution(String a, String b) {
		int result = Integer.parseInt(a) * Integer.parseInt(b);
		return result;
	}

}
