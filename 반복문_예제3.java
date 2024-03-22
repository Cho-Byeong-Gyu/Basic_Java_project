package 반복문_예제3;

public class 반복문_예제3 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			
			System.out.printf("i=%d ", i);
		
			int tmp = i;
			
			do {									// do~while문으로 3,6,9가포함되면 '박수'출력
				if(tmp%10%3==0 && tmp%10 !=0) {		// 3,6,9로 끝나는지 1의자리 검증
					System.out.print("박수 ");
				}
			}while((tmp /= 10) != 0);				// 10으로 나눈 카운트로 10의자리 검증
													// '/='는 '+='랑 같은 원리 --> temp = tmep/ 10와 동일
	
			System.out.printf("\n");
		}
	}
}
