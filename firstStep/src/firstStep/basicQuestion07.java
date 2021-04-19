package firstStep;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class basicQuestion07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			br.close();
			solution(a,b);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	private static void solution(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Å« ¼ö´Â : "+(a > b ? a : b));
	}
	

}
