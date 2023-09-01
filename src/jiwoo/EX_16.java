package jiwoo;
// 재귀 메소드 
public class EX_16<T> {
	public static void main(String[] args) {
		EX_16<String> strex = new EX_16<String>();
		EX_16<Integer> intex = new EX_16<Integer>();
		
		String s = strex.getValue();
		Integer s2 = intex.getValue();
	}
	
	private T value;
	
	public T getValue() {
		return this.value;
	}
}
