package Java0107;

import java.util.Scanner;

public class Calculator {
	
	// (1) 필드
	
	
	// (2) 메소드
	//	덧셈, 뺄셈, 곱셈, 나눗셈 메소드를 선언
	
	// 덧셈 메소드
	public void sum(int num1, int num2) {
		
		int result = num1 + num2;
		System.out.println("덧셈 결과 : " + result);
		
	}
	
	// 뺄셈 메소드
	public void subtract(int num1, int num2) {
		
		int result = num1 - num2;
		System.out.println("뺄셈 결과 : " + result);
	}
	
	// 곱셈 메소드
	public void multiply(int num1, int num2) {
		
		int result = num1 * num2;
		System.out.println("곱셈 결과 : " + result);
	}
	
	// 나눗셈 메소드
	public void divide(int num1, int num2) {
		
		int result = num1 / num2;
		System.out.println("나눗셈 결과 : " + result);
	}
	
	// 숫자 입력 메소드
	public void inputNum() {
		
		
	}
	
	
	
	
	
	
	
	
	// (3) 생성자

}
