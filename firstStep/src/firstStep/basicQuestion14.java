package firstStep;

public class basicQuestion14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[50];
		for(int i = 0; i < list.length; i++) {
			list[i] = (int)(Math.random() * 101);
		}
		for(int i = 0; i < list.length; i += 6) {
			for(int j = i; j < i + 6; j++) {
				if(j == list.length) {
					break;
				}
				System.out.print(list[j]+" ");
			}
			System.out.println();
		}
	}

}
