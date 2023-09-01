package jiwoo.prog;
//크기를 비교해서 큰 게 몇 개인지?
public class Ex11 {
	public static void main(String[] args) {
		Ex11 ex = new Ex11();
		System.out.println(ex.solution("3141592", "271"));
		System.out.println(ex.solution("500220839878", "7"));
		System.out.println(ex.solution("10203", "15"));
		System.out.println(ex.solution("974873658192847182", "10000000000000000"));
	}
	
	private int solution(String a, String b) {	
		int x = b.length(); // x는 b의 길이
		int y = a.length(); // y는 a의 길이
		int countA = 0;
		
	// y랑 b를 인수로 만들기
		IntParser parser = new IntParser();
		int numB = parser.parse(b);
		
	// y랑 b를 비교하기
		for (int i = x; i <= y ; i++) {
			String z= a.substring(i - x, i);
			int numA = parser.parse(z);
			if ( numA > numB ) {
				countA += 1;	
			}
		}
		return countA;
	}
}

// String z= a.substring(i,x);랑 int numA = parser.parse(z);를 for안에 넣기
// String z= a.substring(i,x) 이 안에 있는 x를 바꿔야 한다.









