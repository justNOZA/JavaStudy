import java.util.Arrays;

public class MathGiveUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers1 = { 1, 2, 3, 4, 5 };
		int[] result1 = { 1 };
		int[] answers2 = { 1, 3, 2, 4, 2 };
		int[] result2 = { 1, 2, 3 };

		// System.out.println(Arrays.equals(a, result1));

		if (Arrays.equals(solution(answers1), result1)) {
			if (Arrays.equals(solution(answers2), result2))
				System.out.println("");
		}

	}

	private static int[] solution(int[] answers) {
		int[] answer = {};
		int a = 0;
		for (int i = 0; i < answers.length; i++) {
			if ((i + 1) % 5 == answers[i] % 5) {
				a++;
			}
		}
		int b = 0;
		int c = 0;

		int result2 = (a > b) ? a : b;
		int result4 = (a == b) ? a : b;
		int result3 = (c < result2) ? c : result2;
		answer[0] = result3;
		if (result3 == result4) {
			answer[1] = result2;
			if (result2 == result4) {
				answer[2] = result4;
			}
		}
		Arrays.sort(answer);
		return answer;
	}

}
