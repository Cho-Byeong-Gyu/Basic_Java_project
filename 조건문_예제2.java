package 조건문_예제2;

/*
제목: 조건문_예제2
날짜: 2024.03.21.목요일
내용: switch문 관련 예제 - 몇월인지 입력하면 해달 계절 출력해주기 
 */
import java.util.*;

public class 조건문_예제2 {
	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요: ");
		
		Scanner scanner = new Scanner(System.in);		// scanner라는 이름의 스캐너 선언
		int month = scanner.nextInt();					// 일력받은 숫자를 month변수에 저장
		
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재의 계절은 봄입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("현재의 계절은 여름입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("현재의 계절은 가을입니다.");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("현재의 계절은 겨울입니다.");
				break;
		}
	}
}
