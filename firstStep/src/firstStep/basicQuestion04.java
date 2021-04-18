package firstStep;

public class basicQuestion04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "이효리";
		String department = "개발부";
		String position = "대리";
		int sal = 1500000;
		solution(name, department, position, sal);
	}

	private static void solution(String name, String department, String position, int sal) {
		// TODO Auto-generated method stub
		System.out.println("이름 : "+name);
		System.out.printf("부서 : %s\n",department);
		System.out.print("직위 : "+position+"\n"+"급여 : "+sal+"원");
	}
}
