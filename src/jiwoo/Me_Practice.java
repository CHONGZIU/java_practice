package jiwoo;

public class Me_Practice {
	public static void main(String[] args) {
		Person selly;
		selly = new Selly();
		selly.study();
		selly.score();
		selly.study();
		selly.study();
		selly.study();
		selly.score();
		
		System.out.println(Selly.count);
		
		Person vicky;
		vicky = new Vicky();
		vicky.score();
		vicky.study();
		vicky.study();
		vicky.score();
		
		System.out.println(Vicky.count);//?
	}
}

interface Person {
	void study();
	void score();
}
// ㄴ> Person이라는 인터페이스 안에 있는 메서드는 study, score
class Selly implements Person {
// ㄴ> Selly라는 클래스가 Person이라는 인터페이스에 있는 메서드를 이용하여 구현한다.
	static int count; //->count라는 변수를 선언한 것
	int x = 0;
	
	public void study() {
		count++;
		x++;
	}
	
	public void score() {
		System.out.println("제 점수는 " + x + "입니다.");
	}
}

class Vicky implements Person {
	static int count;
	int x = 0;
	
	public void study() {
		count++;
		x += 2;
	}
	
	public void score() {
		System.out.println("제 점수는 " + x + "입니다.");
	}
}
