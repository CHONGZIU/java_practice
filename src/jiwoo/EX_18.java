//｛30, 355, 24, 12, 98, 72, 5, 76, 60, 35, 54, 62, 2, 12, 35｝の数値配列を昇順にソートするプログラムを作りなさい。
//ソート方法は挿入ソートを使いなさい。
// Hint 첫 번째는 정렬이 돼있다. for문은 2개 사용
package jiwoo;

import java.util.Scanner;

public class EX_18 {
	public static void main(String[] args) {
		int[] result = new int[] {30, 355, 24, 12, 98, 72, 5, 76, 60, 35, 54, 62, 2, 12, 35};
		
		int r = result.length;
		int temp;
		for (int i = 1; i < r; i++) { // -> for문을 돌면서 칸을 오른쪽으로 밀어야 한다.
// X
			temp = result[i];
			
			int j = i;
			for (; j > 0; j--) {
				if (temp >= result[j-1]) {
					break;
				}

				result[j] = result[j-1];
			}
			
			result[j] = temp;
		}

		for (int i = 0; i < result.length; i++) {
			if (i > 0) {
				System.out.print(", ");	
			}
			System.out.print(result[i]);
		}
		System.out.println();
	}	
} Scanner scanner = new Scanner(System.in);

// X
// if (result[i] < result[i-1]) {
//   temp = result[i];
//   result[i] = result[i-1];
//   result[i-1] = temp;
// }

