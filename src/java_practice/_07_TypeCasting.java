package java_practice;

public class _07_TypeCasting { // 형 변환
	public static void main(String[] args) {
		
		//괄호 안에 바꾸고자 하는 형을 적으면 된다.
		int score = 93;
		System.out.println(score);
		System.out.println((float)score);
		System.out.println((double)score);
		
		float score_f = 93.3F;
		double score_d = 93.4;
		System.out.println((int)score_f);
		System.out.println((int)score_d);
		
		//정수와 실수의 연산
		score = 3 + (int)3.8;
		System.out.println(score);
		
		// 자동 형변환 int -> long -> float -> double
		double convertedScoreDouble = score;
		
		// 수동 형변환 double -> float -> long -> int
		int convertedScoreInt = (int) score_d;
		
		// 숫자를 문자열로
		String s1 = String.valueOf(93);
		s1 = Integer.toString(93);
		System.out.println(s1);
		
		String s2 = String.valueOf(98);
		s2 = Double.toString(98);
		System.out.println(s2);
	}
}
