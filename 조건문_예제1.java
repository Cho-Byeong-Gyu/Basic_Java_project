package 조건문_예제1;

import java.util.*;

public class 조건문_예제1 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력해주세요: ");
		
		Scanner scanner = new Scanner(System.in);		// 스캐너라는 이름의 스캐너 선언
		score = scanner.nextInt();						// 화면을 통해 입력받은 정수를 score 변수에 저장
	
		System.out.printf("당신의 점수는 %d입니다. \n", score);
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {						// 스코어가 98점 이상이면 A+로 출력
				opt = '+';
			} else if ( score < 94) {				// 스코어가 94점 이하면 A-로 출력
				opt = '-';
			}
		}else if(score >= 80) {							
			grade = 'B';
			if(score >= 88) {						// 스코어가 88점 이상이면 B+로 출력
				opt = '+';
			} else if ( score < 84) {				// 스코어가 84점 이하면 B-로 출력
				opt = '-';
			}
		}else {
			grade = 'C'; 							// 스코어가 80미만이면 C로 출력
		}
	
		System.out.printf("당신의 학점은 %c%c입니다. \n", grade, opt);
	}
}









