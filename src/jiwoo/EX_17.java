package jiwoo;

public class EX_17 {
	public static int a = 0; // class안에서 통용적으로 실행될 수 있도록 하는 게 - static
	
	public static void main(String[] args) { // 

		EX_17 ex17A = new EX_17(); // ex17A는 EX_17라는 클래스를 기반으로 만들어진 인스턴스
		EX_17 ex17B = new EX_17();
		
		ex17A.addA();
		ex17A.printA();
		ex17B.printA();
		
		ex17B.addA();
		ex17A.printA();
		ex17B.printA();
		
//		EX_17 ex_17 = new EX_17();
//		String[] results = new String[] {
//			ex17.solution()
//		}
	}
	
	// constructor
	public EX_17 () { // EX_17이라는 클래스의 인스턴스를 초기화 (저 클래스가 생성 될 때마다 이후가 항상 같이 실행된다.)
		System.out.println("Hello, World!");
	}
	
	public void addA() {
		a++;
	}
	
	public void printA() {
		System.out.println(a);
	}
}
