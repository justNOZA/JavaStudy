package firstStep;

public class basicQuestion04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "��ȿ��";
		String department = "���ߺ�";
		String position = "�븮";
		int sal = 1500000;
		solution(name, department, position, sal);
	}

	private static void solution(String name, String department, String position, int sal) {
		// TODO Auto-generated method stub
		System.out.println("�̸� : "+name);
		System.out.printf("�μ� : %s\n",department);
		System.out.print("���� : "+position+"\n"+"�޿� : "+sal+"��");
	}
}
