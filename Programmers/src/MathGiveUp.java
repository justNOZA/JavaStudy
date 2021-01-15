import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathGiveUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] answers1 = { 1, 2, 3, 4, 5 };
		int[] result1 = { 1 };
		int[] answers2 = { 1, 3, 2, 4, 2 };
		int[] result2 = { 1, 2, 3 };

		if (Arrays.equals(solution(answers1), result1)) {
			if (Arrays.equals(solution(answers2), result2))
				System.out.println("Á¤´ä");
		}

	}

	private static int[] solution(int[] answers) {
		ArrayList<Integer> list = new ArrayList<>();
		int a = 0;
		for (int i = 0; i < answers.length; i++) {
			if ((i + 1) % 5 == answers[i] % 5) {
				a++;
			}
		}
		int b = 0;
		for (int i = 0; i < answers.length; i++) {
			if(i % 2 == 0 && answers[i] == 2) {
				b++;
			}
			if(i % 2 != 0) {
				switch (i % 8) {
				case 1:
					if(answers[i] == 1) {
						b++;
					}
					continue;
				case 3:
					if(answers[i] == 3) {
						b++;
					}
					continue;
				case 5:
					if(answers[i] == 4) {
						b++;
					}
					continue;
				case 7:
					if(answers[i] == 5) {
						b++;
					}
					continue;
				default:
					continue;
				}
			}
		}
		
		int c = 0;
		for (int i = 0; i < answers.length; i++) {
			int num = i;
			if(num > 9) {
				num = num % 10;
			}
			switch (num/2) {
			case 0:
				if(answers[i] == 3) {
					c++;
				}
				continue;
			case 1:
				if(answers[i] == 1) {
					c++;
				}
				continue;
			case 2:
				if(answers[i] == 2) {
					c++;
				}
				continue;
			case 3:
				if(answers[i] == 4) {
					c++;
				}
				continue;
			case 4:
				if(answers[i] == 5) {
					c++;
				}
				continue;
			default:
				continue;
			}
		}
		if (a >= b && a >= c) {
            list.add(1);
        }
		if (b >= a && b >= c) {
			list.add(2);
		}
		if(c >= a && c >= b) {
			list.add(3);
		}
		Integer[] result = list.toArray(new Integer[list.size()]);
		int[] answer = Arrays.stream(result).mapToInt(Integer::intValue).toArray();
		Arrays.sort(answer);
		return answer;
	}


    public static int[] solution2(int[] answers) {
        int[][] patterns = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] hit = new int[3];
        for(int i = 0; i < hit.length; i++) {
            for(int j = 0; j < answers.length; j++) {
                if(patterns[i][j % patterns[i].length] == answers[j]) hit[i]++;
            }
        }

        int max = Math.max(hit[0], Math.max(hit[1], hit[2]));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < hit.length; i++)
            if(max == hit[i]) list.add(i + 1);

        int[] answer = new int[list.size()];
        int cnt = 0;
        for(int num : list)
            answer[cnt++] = num;
        return answer;
        
    }
}

