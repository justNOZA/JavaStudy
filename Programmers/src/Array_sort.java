import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Array_sort {

	public static void main(String[] args) {
		int[] numbers1 = {2,1,3,4,1}, numbers2 = {5,0,2,7};
		ArrayList<Integer> answer1 = solution(numbers1);
		for(int i : answer1) {
			System.out.print(i+" ");
		}
		ArrayList<Integer> answer2 = solution(numbers2);
		System.out.println();
		for(int i : answer2) {
			System.out.print(i+" ");
		}
	}
	private static ArrayList<Integer> solution(int[] numbers) {
		
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = 0; i < numbers.length-1; i++) {
			for(int j = i+1; j <numbers.length; j++) {
				if(!answer.contains(numbers[i]+numbers[j])) {
					answer.add(numbers[i]+numbers[j]);
				}				
			}
		}
		Collections.sort(answer);
		
		return answer;
	}
	
	public static int[] solution2(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
