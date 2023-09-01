// 배열안에 있는 것 중 가장 작은 수 찾기
package jiwoo;

public class EX_5 {
	public static void main(String[] args) {
		int[][] questions;
		questions = new int[][] {
			new int[] { 1, 2, 3, 6, 7, -2, 100, 15 },
			new int[] { 11, 24, 26, 28, 255, 23, 122, 1 }
		};
		EX_5 ex4 = new EX_5();
		for (int i = 0; i < questions.length; i++) {
			System.out.println(ex4.solution(questions[i]));
		}
	}  
	public int solution (int[] question) {
		for (int i = 1 ; i < question.length ; i++) {
			if ( question[i] > question[i-1]) {
				question[i] = question[i-1];
			}
		}
		return question[question.length - 1];
	}
}
