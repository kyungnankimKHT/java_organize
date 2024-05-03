package ncs.test5;

public class BookArrayTest {
	public static void main(String[] args) {
		Book[] bArray = new Book[3];
		
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판",0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8","금영욱",30000, "북스홈",0.1);

		/*
		 java.lang.NullPointerException: Cannot invoke "ncs.test5.Book.getTitle()" because "b" is null
			 자리는 존재하지만 자리안에 값이 없을 때 발생하는 에러
		 */
		//for-each문을 사용해서 출력
		for(Book b : bArray) {
			System.out.println("Title : " + b.getTitle());
			System.out.println("Author : " + b.getAuthor());
			System.out.println("Price : " + b.getPrice());
			System.out.println("Publisher : " + b.getPublisher());
			System.out.println("Discount Rate : " + b.getDiscountRate());
			System.out.println("할인된 가격 : " + b.get할인가());
			
			System.out.println("======================");
		}
	}
}
