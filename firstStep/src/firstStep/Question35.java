package firstStep;

public class Question35 {
	int a = 0, b = 0, c = 0;
	int result;
	public Question35(int a) {
		this.a = a;
		this.result = this.a + this.b + this.c;
		System.out.printf("%d를 넘겨받은 생성자",a);
	}
	public Question35(int a, int b) {
		this.a = a;
		this.b = b;
		this.result = this.a + this.b + this.c;
		System.out.printf("\n%d, %d를 넘겨받은 생성자",a, b);
	}
	public Question35(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.result = this.a + this.b + this.c;
		System.out.printf("\n%d, %d, %d를 넘겨받은 생성자",a, b, c);
		System.out.printf("\n%d %d %d", this.a, this.b, this.c);
		System.out.printf("\n합 : %d", this.result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question35 a = new Question35(10);
		Question35 b = new Question35(10, 20);
		Question35 c = new Question35(10, 20, 30);
	}

}
