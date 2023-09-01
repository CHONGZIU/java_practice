// 각 자리수의 합
package jiwoo;

public class EX_2 {
	public static void main(String[] args) {
		int i = 100;
		for (; i < 111; i += 1) {
			System.out.println(new EX_2().solution(i));
		}
	}

	public int solution (int n) {
		int answer = 0;
		
		for (; n > 0; n /= 10) {
			answer += n%10; 
	// ㄴ> n > 0 보다 크면 answer += n%10에 n을 대입해서 계산한 다음에 n /= 10을 실행하는 건가?
		}
		return answer;
	}
}
