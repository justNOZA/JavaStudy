package firstStep;

import java.util.Scanner;

public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T33 ob = new T33();
		while(true) {
			int result = ob.menu();
			if(result == 4 ) {
				return;
			}
		}
	}

}

class T33{
	double area;
	final double PI = 3.141592;
	public T33() {
		this.area = 0.0;
	}
	public double circle(double r) {
		return r*r*this.PI;
	}
	public double triangle(double h, double b) {
		return h*b*0.5;
	}
	public double trapezoid(double t, double b, double h) {
		return (t+b)/2*h;
	}
	public void output() {
		
	}
	public int menu() {
		System.out.println("**** �� �� �� �� ****");
		System.out.println("1. �ﰢ��");
		System.out.println("2. ��");
		System.out.println("3. ��ٸ���");
		System.out.println("4. ����");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch(num) {
		case 1 :
			System.out.println("**** �ﰢ���� ���� ****");
			System.out.print("�غ� :");
			int a = sc.nextInt(); 
			System.out.print("\n���� :");
			int b = sc.nextInt(); 
			System.out.printf("\n���� : %.2f",this.triangle(a, b));
			break;
		case 3 :
			System.out.println("**** ��ٸ����� ���� ****");
			System.out.print("�Ʒ��� :");
			int c = sc.nextInt(); 
			System.out.print("\n���� :");
			int d = sc.nextInt(); 
			System.out.print("\n���� :");
			int e = sc.nextInt(); 
			System.out.printf("\n���� : %.2f",this.trapezoid(c, d, e));
			break;
		case 2 :
			System.out.println("**** ���� ���� ****");
			System.out.print("������ :");
			int f = sc.nextInt(); 
			System.out.printf("\n���� : %.2f",this.circle(f));
			break;
		case 4 :
			System.out.println("�����մϴ�.");
		}
		return num;
	}
}