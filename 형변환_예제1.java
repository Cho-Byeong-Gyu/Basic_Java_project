/*
 제목: 형변환_예제1
 날짜: 2024.03.15.금
 내용: 타입별로 형변환 시켜보는 예제
 */

package 형변환_예제1;

import java.util.*;

public class 형변환_예제1 {
	public static void main(String[] args) {
		
		int i = 12341234;
		float f =(float)i;			// int --> float 으로 형변환
		int i2 = (int)f;			// 다시 float을 int로 형변환

		double d = (double)i;		// int --> double 으로 형변환
		int i3 = (int)f;			// float을 다시 int로 형변환
		
		System.out.printf("i=%d \n", i);
		System.out.printf("f=%f   i2=%d \n", f, i2);
		System.out.printf("d=%f   i3=%d \n", d, i3);
		
		
		
		
		
//		float f = 9.1234567f;
//		double d = 9.1234567;				
//		double d2 = (double)f;				// float --> double 형변환
//		
//		System.out.printf("f=%2.20f \n", f);		// f 를 소수점 20까지 출력
//		System.out.printf("d=%2.20f \n", d);		// d 를 소수점 20까지 출력
//		System.out.printf("d2=%2.20f \n", d2);		// d2를 소수점 20까지 출력 (double이 더 큰범위기에 값손실X)
		
		
//		int i = 10;
//		byte b = (byte)i;
//		System.out.printf("i= %d \n", i);                    // i 세팅값 출력
//		System.out.println("[int -> byte] "+b);           // int --> byte
//		
//		i = 300;
//		b = (byte)i;
//		System.out.printf("i= %d \n", i);                    // i 세팅값 출력
//		System.out.println("[int -> byte] "+b);           // int --> byte
//		
//		b = 10;
//		i = (int)b;
//		System.out.printf("b= %d \n", b);                    // b 세팅값 출력
//		System.out.println("[byte -> int] "+i);           // int --> byte
//		
//		b = -2;
//		i = (int)b;
//		System.out.printf("b= %d \n", b);                    // b 세팅값 출력
//		System.out.println("[byte -> int] "+i);           // int --> byte
		
		
//		double d = 85.4;
//		int score = (int)d;					// double형 --> int형
//		
//		System.out.println("score= "+score);
//		System.out.println("d= "+d);
	}
}
