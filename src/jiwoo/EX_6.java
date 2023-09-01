package jiwoo;

public class EX_6 {
	public static void main(String[] args) {
		Animal dog;
		dog = new Dog2();
		dog.walk();
		dog.sayPosition();
		dog.walk();
		dog.walk();
		dog.walk();
		dog.sayPosition();
		
		System.out.println(Dog.count);
		
		Animal cat = new Cat();
		cat.sayPosition();
		cat.walk();
		cat.walk();
		cat.walk();
		cat.sayPosition();
		
		System.out.println(Dog.count);
	}
}

interface Animal {
	void walk();
	void sayPosition();
}

class Dog implements Animal {
	
	static int count;
	int x = 0;
	
	public void walk() {
		count++;
		x++;
	}
	
	public void sayPosition() {
		System.out.println("x:" + this.x);
	}
}

class Dog2 extends Dog {
	int x;
	
	public void walk() {
		super.walk();
		this.x++;
	}
	
	public void sayPosition() {
		System.out.println("x2:" + this.x + " " + super.x);
	}
}

class Cat implements Animal {
	static int count;
	int x = 0;
	
	public void walk() {
		count++;
		x += 2;
	}
	
	public void sayPosition() {
		System.out.println("x:" + x);
	}
}
