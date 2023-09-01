// 별 쌓기 문제
package jiwoo;

public class EX_10 {
	public static void main(String[] args) {
		EX_10 ex10 = new EX_10(4);
		ex10.draw();
	}

	int height;
	public EX_10(int height) {
		this.height = height; 
	}

	public void draw() { 
		for( int n = 1 ; n < height + 1 ; n++) {
			makeSpace(n, height);
			drawLine(n, height);
		}
	}

	public void makeSpace(int n, int height) {
		for (int b = 0; b < height - n; b++) {
			System.out.print(" ");
		}
	}

	public void drawLine(int n, int height) { 
		for (int a = 0; a < 2*n-1; a++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
 
