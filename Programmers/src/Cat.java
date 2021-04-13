

import java.util.Scanner;

public class Cat {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int data = in.nextInt(); //¹Ýº¹ È½¼ö
		for(int i = 0; i < data; i++){
			Yaongi myYaong = new Yaongi();
			int test = in.nextInt(); // if Á¶°Ç¹®
			if (test == myYaong.hateCount){
				myYaong.mung();
			} else {
				myYaong.meow(test);
			}
		}
	}

}

class Yaongi {
	int hateCount = 3;
	int count;
	
	void meow(int number){
		for(count = 0; count < number; count++){
			System.out.println("¾ß¿Ë");
		}
	}
	
	void mung(){
		System.out.println("¸Û¸Û");
	}
}