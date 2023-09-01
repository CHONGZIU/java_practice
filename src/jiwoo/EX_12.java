package jiwoo;

public class EX_12 {
	public static void main(String[] args) {
		
		// 01001 (9)
		// 10100 (20)
		// 11100 (28)
		// 10010 (18)
		// 01011 (11)
		
		// 11110 (30)
		// 00001 (1)
		// 10101 (21)
		// 10001 (17)
		// 11100 (28)
		
		// 두 지도를 합쳐서,
		// "#####"
		// "# # #"
		// "### #"
		// "#  ##"
		// "#####"

//아래의 두 배열을 합쳐서 지도가 나오게 하시오.
		EX_12 ex12 = new EX_12();
		String[][] results = new String[][] {
			ex12.solution(new int[] { 9, 20, 28, 18, 11 }, new int[] { 30, 1, 21, 17, 28 }),
			ex12.solution(new int[] { 46, 33, 33, 22, 31, 50 }, new int[] { 27, 56, 19, 14, 14, 10 })
		};

		for (int i = 0; i < results.length; i++) { // i = 번째
			String[] result = results[i];
			
			for (int j = 0; j < result.length; j++) { // j = 번째
				System.out.println(result[j]);
			}
			
			System.out.println();
		}
	}

	public String[] solution(int[] arr1, int[] arr2) {
		int n = arr1.length;
		boolean[][] m = new boolean[n][n];
		for (int y = 0; y < n; y++) { //y는 배열의 y번째 요소를 의미
			int item = arr1[y];
			for (int x = n-1; x >= 0; x--) {
				if ((item & 1) == 1) {//x는 x번째 수..?(2진수)
					m[y][x] = true;
				}
				item = item >> 1;
			}
		}
		
		boolean[][] p = new boolean[n][n];
		for (int y = 0; y < n; y++) { 
			int item = arr2[y];
			for (int x = n-1; x >= 0; x--) {
				if ((item & 1) == 1) {
					p[y][x] = true;
				}
				item = item >> 1;
			}
		}
		  
		String[] result = new String[n];
		for (int y = 0; y < n; y++) {
			char[] c = new char[n];
			for (int x = n-1; x >= 0; x--) {
				if (m[y][x] || p[y][x]) {
					c[x] = '#';
				} else {
					c[x] = ' ';			
				}
			}
			result [y] = new String(c);
		} 
		return result;
	}
}
