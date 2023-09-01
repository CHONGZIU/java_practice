package jiwoo;

// default (아무것도 없을 때)
// public 
// private

public class EX_8 {
	public static void main(String[] args) {
		Dog3 dog = new Dog3();
		dog.walk();
	}
}

class Dog3 {
	private int x = 0;
	
	public void walk() {
		x++;
	}
}