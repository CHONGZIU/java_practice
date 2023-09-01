// 나머지가 있는 숫자들 중 제일 작은 몫
package jiwoo;

public class EX_1 {
	public static void main(String[] args) {
		int i = 1000;
		for (; i < 1100; i += 1) {
			System.out.println(new EX_1().solution(i));		
		}
	}
	public int solution(int n) {
		for ( int a = 2; a < n; a++) {
			if ( n%a == 1 ) {
				return a;
			}
		}
		return -1;
	}
}