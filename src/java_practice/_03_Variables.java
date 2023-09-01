package java_practice;

public class _03_Variables {
	public static void main(String[] args) {
	//  name은 String이다. name은 "홍길동"이다.
	//  String name;
	//  name = "이정환"; 
	//  ㄴ> 이걸 줄이면 밑에와 같이 쓸 수 있다.
		String name = "이정환";
	//  hour은 int(정수형 변수)다. hour은 "2"이다. 
	//  int hour;
	//  hour = 2;
	//  ㄴ> 이걸 줄이면 밑에와 같이 쓸 수 있다.
		int hour = 2;
		
		System.out.println( name + "님, 배송이 시작됩니다. " + hour + "시간 후에 방문 예정입니다.");
		System.out.println( name + "님, 배송이 완료되었습니다.");
		System.out.println("");
	
		double score = 90.5;  //-> 실수형 변수
		char grade =  'A'; //->string은 문자열을 나타내는 거고, char은 문자를 나타내는 것이다.
						   //  string을 설정할 때는 ""를 사용하고, char을 설정할 때는 ''을 사용한다.
		name = "신준섭";
		System.out.println(name + "님의 점수는 " + score + "점이고,");
		System.out.println("학점은 " + grade + "학점입니다.");
		
		boolean pass = true;
		System.out.println("시험결과:" + pass);
		
		double d = 3.14159265358979;
		float f = 3.14159265358979F; //-> 플롯 함수를 사용하려면 값 뒤에다가 "F"나 "f"를 넣어주어야한다.
						 //-> 대문자와 소문자는 크게 차이가 없지만 대부분 가독성이 좋은 "F"를 사용한다.
						 //   float은 double과 달리 정밀한 처리를 할 수 없기 때문에 보다 정밀한 실수 처리를 하고 싶다면
						 //   double을 사용하는 것이 좋다.
		System.out.println(d);
		System.out.println(f);
		
	//  int i = 123456789123456789; 
		long l = 123_456_7891_234_567_89l; //-> 롱 함수를 사용하려면 값 뒤에다가 "L"나 "l"을 넣어주어야한다.
						//-> 대문자와 소문자는 크게 차이가 없지만 대부분 가독성이 좋은 "L"을 사용한다.
						//   long은 int보다 더 인식가능한 범위가 넓기 때문에 int의 범위보다 넓은 정수 처리를 해야 한다면
						//   long을 사용하는 것이 좋다.
						//   숫자가 너무 길어지게 되면 가독성을 위해 _를 넣어서 사용해도 좋다. 있으나 없으나 값은 동일하다.
		System.out.println(l);

		
		
	}
}
