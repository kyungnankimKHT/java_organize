package 자바_예제문제실습;
/*
 빨간선이 뜨는 부분을 해결하기
 */
public class 오버로딩 {
	public void test() {}
	public void test(String str) {}
	public void test(short a,String s ) {}
	
	public void test(int i,int a) {}
	public void test(int a) {}
	
	public void test(char a) {}
	public void test(char ch,int a) {}
	
	public void test(boolean a) {}
	public void test(int a,boolean b) {}
	public void test(short s) {}
	public void test(short c,int a) {}
	
	
	public void test(int a, String b, boolean c) {}
	public void test(int a, String b, String d) {}

	public void test(String c, int b, int a) {}
	public void test(String c, int b) {}
	
	public void test(boolean a, boolean b, short c) {}
	public void test(boolean a, boolean b) {}
	
	
	
	
} 
