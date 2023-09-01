//　コンソールに入力した数値を２進数に変換してコンソール表示するプログラムを作りなさい。
//　2進数表示16桁[けた]まで対応するものとする。


// 콘솔에 입력받을 창을 만들기 v
// (수를 입력받기) 입력받은 수를 int로 바꾸기
// 입력받은 수를 2진수로 변환 -> 2진수로 변환하는 식??
// 2진수 표시 16자리까지 대응하게 끔 -> 0~16까지의 10진수를 받을 수 있게 끔

package jiwoo;

import java.util.Scanner;

public class EX_19 {
	
	public int changeNum(String c) { // string의 숫자를 int의 숫자로 바꾸고, 숫자가 아니면 받아들여지지 않게 한다??
		char ch = c.charAt(0);
		if ( ch < '0' || ch > '9' ) {
			System.out.println("숫자를 적어주세요");
		}
		return (int) ch - '0';
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine(); //입력받은 값
		
	}
}
