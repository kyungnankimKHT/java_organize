package 자바_예제문제실습;

import java.io.Serializable;

/*
 캡슐화 원칙에 맞게 구현하기
//필드 
 String 동물이름;
 int 나이;
 
//메서드
 //Getter
 //Setter
 //기본 생성자
 //필수 생성자
 //@Override toString 활용해서 문자열 출력하기
 */
//다른데서 데이터를 사용할 수 있으니 직렬화 표기 하기
public class Animal implements Serializable {
//필드
	private String 동물이름;
	private int 나이;
//메서드
	//Setter
	public void set동물이름(String 동물이름) {
		this.동물이름 = 동물이름;
	}

	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	//Getter
	public String get동물이름() {
		return 동물이름;
	}

	public int get나이() {
		return 나이;
	}
	//기본생성자 ctrl space
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	//필수생성자 //alt shift o 
	public Animal(String 동물이름, int 나이) {
		super();
		this.동물이름 = 동물이름;
		this.나이 = 나이;
	}
	
	//toString alt shift s
	@Override
	public String toString() {
		return "동물이름=" + 동물이름 + ", 나이=" + 나이;
	}
	
 
	
	
}









