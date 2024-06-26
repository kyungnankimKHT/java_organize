package ncs.test5;

public class Book {
//필드 전역변수
	private String title; 	     //멤버변수
	private String author;	     //멤버변수
	private int price;		    //멤버변수
	private String publisher;   //멤버변수
	private double discountRate;//멤버변수
	
//메서드
	//기본생성자 ctrl space
	public Book() {
	}
	
	//필수생성자 ctrl s o
	public Book(String title, String author, int price, String publisher, double discountRate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	

	//Getter Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	//할인율과 정상가격을 확인해서 할인가를 알고 싶을 때 작성하는 메서드
	public int get할인가() {
		//할인하는 계산 방식 실수
		double discountAmount = price * discountRate; //예를들어 100원 10% 판매하겠다.  10원이 들어감
		
		//정상가 - % 만큼 할인이 들어간 금액
		//					1000  -  10      = 900
		int 할인가격 = (int) (price - discountAmount);
		return 할인가격;
		
	}
	
	
	//toString String
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher
				+ ", discountRate=" + discountRate + "]";
	}


}
