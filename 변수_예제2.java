package 변수_예제2;

public class 변수_예제2 {

	public static void main(String[] args) {
		
		final int MAX_SPEED_1 = 10;		// 상수 선언 및 초기화
		final int MAX_SPEED_2 = 20;		
		
		System.out.println(MAX_SPEED_1);
		System.out.println(MAX_SPEED_2);
		
	//	system.out.println(MAX_SPEED_1, MAX_SPEED_2);        //에러남
		
		System.out.printf("%d %d", MAX_SPEED_1, MAX_SPEED_2);
	}

}
