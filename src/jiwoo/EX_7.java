package jiwoo;

public class EX_7 {
	public static void main(String[] args) {
		System.out.println(1 + 1);
		System.out.println(1 - 1);
		System.out.println(1 * 1);
		System.out.println(1 / 1);
		System.out.println(1 % 1);
		System.out.println(3 & 5);
		System.out.println(5 | 2);
		
		System.out.println(~1); // not
		
		boolean a = false;
		boolean b = true;
		System.out.println(!a);
		System.out.println(a && b); // and
		System.out.println(a || b); // or		
		System.out.println(1 > 3);		
		System.out.println(1 < 3);
		System.out.println(3 <= 3);
		System.out.println(3 >= 3);
		
		int c = 1;
		System.out.println(c == 1);
		System.out.println(c = 2);
		System.out.println(c == 1);
		System.out.println(!(c == 1));//이거랑 밑에 식은 비슷한 의미
		System.out.println(c != 1);
		
		byte d = 127;
		d++;
		System.out.println(d);
	  //ㄴ> 바이트는 -128~127이 범위인데, d가 1이 증가하게 되면 128이 되버리므로 오류가 발생한다.
	}
}
