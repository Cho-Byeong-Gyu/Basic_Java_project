/*
 제목: 변수_예제1
 날짜: 2024.03.14
 내용: 변수 선언 및 초기화 예제 + println함수 활용
 */
package 변수_예제1;

public class 변수_예제1 {

	public static void main(String[] args) {
		
		int year = 0;
		int age = 14;
		
		System.out.println(year);		//System.out 이랑 system.out 다름 -> 알아서 System으로 고쳐주긴함
		System.out.println(age);
		
		year =age + 2000;
		age = age +1;
		
		System.out.println(year);
		System.out.println(age);
		
	}

}
