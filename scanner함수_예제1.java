package scanner함수_예제1;

import java.util.*;        // Scanner를 사용하기 위한 헤더파일선언

public class scanner함수_예제1 {
	public static void main(String[] args) {         // 메인 메서드 선언
		
		Scanner scanner = new Scanner(System.in);    // 스캐너 클래스의 객체 생성
		
		System.out.print("두자리 정수를 하나 입력해주세요: ");
		
		String input = scanner.nextLine();           // 스캐너로 문자열 입력받음
		int num = Integer.parseInt(input);           // 입력받은 문자열을 숫자로 변환
		
		System.out.println("입력내용 :" +input);        // 입력받은 내용 출력
		System.out.printf("num = %d \n", num);       // 숫자로변환한 값 출력
	}
}
