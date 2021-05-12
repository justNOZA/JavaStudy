package firstStep;

public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info list = new Info();
		list.setScore(sumSet(list.getScore()));
		list.setAvg(calAvg(list.getAvg() ,list.getScore()));
		list.setGrade(check(list.getAvg()));
		list.setPass(checkPass(list.getGrade()));
		list.setRank(checkRank(list.getRank(),list.getAvg()));
		print(list);
	}

	private static void print(Info list) {
		// TODO Auto-generated method stub
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t학점\t재수강\t순위");
		for(int i = 0; i < 3; i++) {			
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%c\t%s\t%d\n",i+1,list.getName()[i],list.getScore()[i][0],list.getScore()[i][1],list.getScore()[i][2],list.getScore()[i][3],list.getAvg()[i],list.getGrade()[i],list.getPass()[i],list.getRank()[i]);
		}
		
	}

	private static int[] checkRank(int[] is, double[] avg) {
		// TODO Auto-generated method stub
		if(avg[0] < avg[1]) {
			is[0]++;
			if(avg[0] < avg[2]) {
				is[0]++;
				if(avg[2] > avg[1]) {
					is[1]++;
				}else {
					is[2]++;
				}
			}else {
				is[2] += 2;
			}
		} else if(avg[0] < avg[2]) {
			is[1] += 2;
			is[0]++;
		} else {
			is[1]++;
			is[2]++;
			if(avg[1] < avg[2]) {
				is[1]++;
			}else {
				is[2]++;
			}
		}
		return is;
	}

	private static String[] checkPass(char[] grade) {
		// TODO Auto-generated method stub
		String[] result = new String[grade.length];
		for(int i = 0; i < result.length; i++) {
			if(grade[i] == 'F') {
				result[i] = "fail";
			} else {
				result[i] = "pass";
			}
		}
		return result;
	}

	private static char[] check(double[] avg) {
		// TODO Auto-generated method stub
		char[] result = new char[avg.length];
		for(int i = 0; i < result.length; i++) {
			if(avg[i] >= 90) {
				result[i] = 'A';
			} else if(avg[i] >= 80) {
				result[i] = 'B';
			} else if(avg[i] >= 70) {
				result[i] = 'C';
			} else if(avg[i] >= 60) {
				result[i] = 'D';
			} else {
				result[i] = 'F';
			}
		}
		return result;
	}

	private static double[] calAvg(double[] ds, int[][] is) {
		// TODO Auto-generated method stub
		for(int i = 0; i < ds.length; i++) {
			ds[i] = is[i][3]/3.0;
		}
		return ds;
	}

	private static int[][] sumSet(int[][] score) {
		// TODO Auto-generated method stub
		for(int i = 0; i < score.length; i++) {
			score[i][3] += score[i][0];
			score[i][3] += score[i][1];
			score[i][3] += score[i][2];
		}
		return score;
	}

}

class Info {
	private String[] name = {"모나", "유우", "사키"};
	private int[][] score = {{90,95,100,0},{75,55,65,0},{100,100,100,0}};
	private double[] avg = {0.0,0.0,0.0};
	private char[] grade = new char[3];
	private String[] pass = new String[3];
	private int[] rank = {1,1,1};
	
	public Info() {
		super();
	}

	public String[] getName() {
		return name;
	}
	
	public int[][] getScore() {
		return score;
	}

	public void setScore(int[][] score) {
		this.score = score;
	}

	public double[] getAvg() {
		return avg;
	}

	public void setAvg(double[] avg) {
		this.avg = avg;
	}

	public char[] getGrade() {
		return grade;
	}

	public void setGrade(char[] grade) {
		this.grade = grade;
	}

	public String[] getPass() {
		return pass;
	}

	public void setPass(String[] pass) {
		this.pass = pass;
	}

	public int[] getRank() {
		return rank;
	}
	
	public void setRank(int[] rank) {
		this.rank = rank;
	}
}