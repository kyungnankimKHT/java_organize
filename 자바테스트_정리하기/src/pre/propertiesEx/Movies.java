package pre.propertiesEx;

public class Movies implements Comparable<Movies>{
//필드
	private String name;
	private int 평점;
	private int 관람객;
//메서드
	//기본생성자 ctrl space 
	public Movies() {
	}
	//필수생성자 alt shift s o
	public Movies(String name, int 평점, int 관람객) {
		super();
		this.name = name;
		this.평점 = 평점;
		this.관람객 = 관람객;
	}

	
	//Getter alt shift s 
	public String getName() {
		return name;
	}
	public int get평점() {
		return 평점;
	}
	public int get관람객() {
		return 관람객;
	}
	//Setter alt shift s 
	public void setName(String name) {
		this.name = name;
	}
	public void set평점(int 평점) {
		this.평점 = 평점;
	}
	public void set관람객(int 관람객) {
		this.관람객 = 관람객;
	}

	//toString alt shift s s
	@Override
	public String toString() {
		return "name=" + name + ", 평점=" + 평점 + ", 관람객=" + 관람객 ;
	}
	
	//compareTo ctrl space
	@Override
	public int compareTo(Movies o) {
		// 비교는 스스로 만들어 기준을 정하기 위해 처음값 0 
		return this.name.compareTo(o.name);
	}
}








