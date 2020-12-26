import java.util.ArrayList;

public class ClawMachine {
	public static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {{0,0,0,0,0}
						,{0,0,1,0,3}
						,{0,2,5,0,1}
						,{4,2,4,4,2}
						,{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		System.out.print(solution(board, moves)+" √÷¡æ ");
		
	}

	private static int solution(int[][] board, int[] moves) {
		int answer = 0;
		for(int i = 0; i < moves.length; i++) {
			for(int j = 0; j < board.length; j++) {
				int r = board[j][moves[i]-1];
				
				if(r != 0) {
					answer += collecting(r, moves.length);
					board[j][moves[i]-1] = 0;
					break;
				}
				
			}
		}
		
		return answer;
	}

	private static int collecting(int r, int length) {	
		list.add(r);
		System.out.print(list.toString());
		if(list.size() == 0) return 0;
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) == list.get(i - 1)) {
				list.remove(i);
				list.remove(i-1);
				return 2;
			}
		}
		
		
		return 0;
	}

}
