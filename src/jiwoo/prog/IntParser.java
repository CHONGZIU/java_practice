package jiwoo.prog;
// 받은 문자열을 정수로 반환하는 메소드를 구현하시오.
public class IntParser {
	public int parse(String in) {
		int result = 0;
		int i = 0; // i번째 자리 수
		if (in.charAt(0) == '+' || in.charAt(0) == '-') { // in.charAt(0) -> 0번째 자리의 수를 지칭
			i = 1; // -> 첫 번째 자리가 + -인지 확인하고, i를 1로 설정
		}
		for (; i < in.length(); i++) {
			result = result * 10 + getNumber(in, i); // -> for로 범위를 설정하고 result 값을 설정
		}
		if (in.charAt(0) == '-') {
			return -result; // -> 첫 번째 자리의 부호가 -였을 때 결과 값도 -로 설정
		}
		return result;
	}	
	private int getNumber(String s, int i) {
		char c = s.charAt(i);
		if( c < '0' || c > '9' ) {
			throw new RuntimeException("not number!");
		}
		return (int) c - '0';
		
	}
}
