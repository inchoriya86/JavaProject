/*
	Date : 2020.12.29
	Author : inchoriya
	Description : 산술연산자(arithmeticOperation)
	Version : 1.0
 */
package Java1229;

public class Ex04_ariOperation {

	public static void main(String[] args) {
		// 정수형 변수 2개를 선언(a, b)
		// +, -, *, /, % 연산 수행

		int a = 7;
		int b = 2;
		int result = 0;

		// + 연산 (더하기)
		result = a + b;
		System.out.println("+ 결과 : " + result);		// 7+2=9

		// - 연산(빼기)
		result = a - b;
		System.out.println("- 결과 : " + result);		// 7-2=5

		// * 연산(곱하기)
		result = a * b;
		System.out.println("* 결과 : " + result);		// 7*2=14

		// / 연산(나누기)
		result = a / b;
		System.out.println("/ 결과 : " + result);		// 7/2=3

		// % 연산(나머지)
		result = a % b;
		System.out.println("% 결과 : " + result);		// 7%2=1
		
		// Q.7나누기 2의 결과가 3.5가 나오게 작성하시오!
		
		double c = 7;
		double d = 2;
		
		double result1 = (double)a / b;
		result1 = c/d;
		System.out.println("7/2 = " + result1);

	}

}












