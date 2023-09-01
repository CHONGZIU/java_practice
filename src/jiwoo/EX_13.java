package jiwoo;
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
public class EX_13 {
	public static void main(String[] args) {

		EX_13 ex13 = new EX_13();
		String[][] results = new String[][] {
			ex13.solution(new int[] { 9, 20, 28, 18, 11 }, new int[] { 30, 1, 21, 17, 28 }),
			ex13.solution(new int[] { 46, 33, 33, 22, 31, 50 }, new int[] { 27, 56, 19, 14, 14, 10 })
		};

		for (int i = 0; i < results.length; i++) { 
			String[] result = results[i];
			
			
			for (int j = 0; j < result.length; j++) { 
				System.out.println(result[j]);
			}
			
			System.out.println();
		}
	}

	public String [] solution(int [] arr1, int[] arr2) { 
		int n = arr1.length; // 배열 길이의 변수 설정
		String[] result = new String[n]; // 변수n을 사용할 수 있는 새로운 배열함수 만들기
		
		for (int i = 0; i < n; i++) { // i는 배열의 요소의 번째
			
			
			int combine =  (arr1[i] | arr2[i]); // 배열1의 i번째 수와 배열2의 i번째 수 둘 중에 하나
			
			
			
		}
		
		
		
		
		

		
//		String[] result = new String[n];
//		int n = arr1.length;
		
//		for (int i = 0; i < n; i++) {
//			int row = arr1[i] | arr2[i];
			
//			char[] resultRow = new char[n];
			
//			for (int j = 0; j < n; j++) {
//				if ((row & 1) == 1) {
//					resultRow[n - j - 1] = '#';
//				} else {
//					resultRow[n - j - 1] = ' ';
//				}
			
//				row = row >> 1;
//			}
	
//			result[i] = new String(resultRow);
//		}
	
		return result;
	}
}