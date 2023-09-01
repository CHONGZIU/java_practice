package jiwoo;
// 재귀 메소드 
public class EX_15 {
	public static void main(String[] args) {
		
		System.out.println(
				new EX_15()
					.factorial(10)
		);
	}

// 재귀? for문  
// public void r(int n) {
// 	if (n < 0) {
// 		return;
// 	}
//		System.out.println(n);
//		r(n-1);
//	}

	public int factorial(int n) {		
		if (n <= 1) {
			return 1;
		}
		return n * factorial(n-1);
	}
}
