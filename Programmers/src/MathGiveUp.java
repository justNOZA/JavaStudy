import java.util.Arrays;

public class MathGiveUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers1 = {1,2,3,4,5};
		int[] result1 = {1};
		int[] answers2 = {1,3,2,4,2};
		int[] result2 = {1,2,3};
		
		//System.out.println(Arrays.equals(a, result1));
		
		if(Arrays.equals(solution(answers1), result1)) {
			if(Arrays.equals(solution(answers2), result2)) System.out.println("");
		}

	}

	private static int[] solution(int[] answers1) {
		// TODO Auto-generated method stub
		return null;
	}

}
