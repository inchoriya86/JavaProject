/*
	Date : 2020.12.29
	Author : inchoriya
	Description : 증감연산자(IncreaseDecreaseOperation)
	Version : 1.0
 */
package Java1229;

public class Ex03_InDeOperation {

	public static void main(String[] args) {
		/*
		 	증가(++) 연산자
		 	(1) ++num : num이 가지고 있는 값에 1을 증가한 뒤 연산에 사용
		 	(2) num++ : num이 가지고 있는 값을 연산에 사용 후 1을 증가시킴
		 	
	 		감소(--) 연산자
		 	(1) --num : num이 가지고 있는 값에 1을 감소한 뒤 연산에 사용
		 	(2) num-- : num이 가지고 있는 값을 연산에 사용 후 1을 감소시킴
		 */
		
		int inNum = 5;
		// sysout 입력 후 [Ctrl] + [Space]키
		System.out.println("inNum : " + (inNum));
		System.out.println("++inNum : " + (++inNum));
		
		System.out.println("inNum++ : " + (inNum++));
		System.out.println("inNum : " + (inNum));		// 7
		
		
		int deNum = 10;
		// (1) deNum출력
		System.out.println("deNum : " + (deNum));
		// (2) --deNum출력
		System.out.println("--deNum : " + (--deNum));
		// (3) deNum--출력
		System.out.println("deNum-- : " + (deNum--));
		// (4) deNum출력
		System.out.println("deNum : " + (deNum));
		
		int num = 10;
		++num;	//	11

		
		int num1 = 10;
		num1++;	//	10
		
		
		
		System.out.println(num1);
		
		
		int num2 = 5;
		int num3 = 11;
		int result1, result2, result3;
		
		result1 = (++num2) + (--num3);
		
		System.out.println(num2);		// 6 : 6
		System.out.println(num3);		// 10 : 10
		System.out.println(result1);	// 16 : 16		
		
		
		
		
		result2 = (num3++) + (num2--);
		
		System.out.println(num2);		// 5 : 5
		System.out.println(num3);		// 11 : 11
		System.out.println(result2);	// 16 : 16

		result3 = (num2++) + (++num3);
		
		System.out.println(num2);		// 6 : 6
		System.out.println(num3);		// 12 : 12
		System.out.println(result3);	// 17 : 17
		
		
		// A		현재 출력 값		나중A 출력값
		// A++		   A				A+1
		
		// int A = 10
		// A++		  10				11
		
		
	}

}



















