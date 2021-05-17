package firstStep;

public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test30 ob = new Test30();
		ob.main();
	}

}

class Test30{
	public void main() {
		Bookshop ob = new Bookshop();
		ob.setBook("자바완성", "황완성", 25000);
		ob.viewBook();
		ob.setBname("JSP잡기");
		ob.setAuthor("송JP");
		ob.setPrice(35000);
		System.out.println();
		System.out.printf("책 이름 : %s",ob.getBname());
		System.out.printf("\n저  자   : %s",ob.getAuthor());
		System.out.printf("\n가  격   : %d",ob.getPrice());
	}
}

class Bookshop{
	String bname;
	String author;
	int price;
	
	public void setBook(String bname, String author, int price){
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	public void viewBook() {
		System.out.printf("책 이름 : %s",bname);
		System.out.printf("\n저  자   : %s",author);
		System.out.printf("\n가  격   : %d",price);
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}