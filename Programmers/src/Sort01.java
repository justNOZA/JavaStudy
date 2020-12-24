import java.util.Arrays;

public class Sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++) {
				answer[i]= calculate(commands[i], array);
				System.out.println(answer[i]);
		}
		

	}
	
	public static int calculate(int[] num, int[] array) {
		int length = num[1]-num[0]+1;
		int list[] = new int[length];

		System.arraycopy(array, num[0]-1, list, 0, length);
		
		Arrays.sort(list);
		
		return list[num[2]-1];
	}

}
