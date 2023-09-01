// 각 배열에 있는 숫자 1,2의 갯수가 같으면 true, 다르면 false
package jiwoo;

public class EX_4 {
	public static void main(String[] args) {
		int[][] questions;
		questions = new int[][] {
			new int[] { 1, 2, 2, 1, 2, 2, 1, 1 },
			new int[] { 1, 2, 2, 2, 2, 2, 1, 1 }
		};
		EX_4 ex4 = new EX_4();
		for (int i = 0; i < questions.length; i++) {
			System.out.println(ex4.solution(questions[i]));
		}
	}  
	public boolean solution (int[] question) {
		int countA = 0;
		int countB = 0;
		
		for (int i = 0; i < question.length; i++) {
			if (question[i] == 1) {
				countA += 1;
			} else {
				countB += 1;
			}
		}
		
		return countA == countB;
	}
}