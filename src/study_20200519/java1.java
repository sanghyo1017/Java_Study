package study_20200519;

import com.sun.tools.sjavac.server.SysInfo;

public class java1 {
	
	public static void main(String[] args) {
		//식별자 - 클래스명, 변수명, 메서드명, 패키지 이름
		
		//error가 나는 경우
		
		//1. int 1a = 10; //식별자에 숫자가 먼저 오는 경우
		//2. int a# = 10; //식별자에 $,_를 제외한 특수문자가 오는 경우
		//3. int father Age = 10; //식별자에 공백이 있는 경우
		//4. int break = 10; //식별자에 예약어가 오는 경우
		
		//10진수 표현법
		byte b1 = 10;
		
		//8진수 표현법
		byte b2 = 012;
		
		//2진수 표현법
		byte b3 = 0b1010;
		
		long l1 = 1000l;
		
		float f1 = 21.45f;
		
		double d1 = 32.45d;
		
		boolean isSuccess = false;
		
		//character 리터럴은 세가지
		
		//1. 문자 표현법
		char c1 = 'a';
		
		//2. 아스키코드 표현법
		char c2 = 97;//97=a, 65=A, 48=0
		
		//3. 유니코드 표현법
		
		char c3 = '\uc774';
		char c4 = '\uc0c1';
		char c5 = '\ud6a8';
		
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		//casting 했을 경우 circuit 발생
		 byte e1 = (byte)129; //-128 ~ 127
		
		//casting 할 경우 cut 발생
		int e2 = (int)1234.56;
		
		//증감연산자
		int e3 = 10;
		int e4 = e3++; //10, 대입 후 증가
		//int e4 = e3 -> e3+1(=11)
		int e5 = ++e3; //12, 증가 후 대입
		//int e5 = e3+1(=12)
		
		// a && b => a가 false 일 때 short circuit 발생
		// a || b => a가 true 일 때 short circuit 발생
		
		
		
		
		
	
		
		
		

		
		
	}

}
