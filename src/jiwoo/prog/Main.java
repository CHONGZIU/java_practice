package jiwoo.prog;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		IntParser parser = new IntParser();
		Map<String, Integer> map= new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		for (;;) {
			System.out.println("키를 입력하시오.");
			String s;
			s = scanner.nextLine();
			if (s.equals("EXIT")) {
				return ;
			}
			
			System.out.println("값을 입력하시오.");
			String sValue = scanner.nextLine();
			
			try {
				map.put(s ,parser.parse(sValue));
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1); // 강제 종료
			}
		}
	}
}
