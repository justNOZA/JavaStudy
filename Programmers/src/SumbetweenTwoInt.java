
public class SumbetweenTwoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(0,100));
	}
	public static long solution(int a, int b) {
        long answer = 0;
        if (a > b){
            int c = b;
            b = a;
            a = c;
        }
        for(int i = a ; i <= b; i++){
            answer += i;  
        }
        return answer;
    }
}
