package Java0107;

import java.util.Scanner;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		Calculator A = new Calculator();
		
		// Calculator의 메소드 호출(실행)
		// A.sum(3, 5);
		// A.subtract(7, 2);
		// A.multiply(5, 9);
		// A.divide(12, 6);
		
		// while문, switch-case문
		// 메뉴 선택
		// 1.덧셈		2.뺄셈	3.곱셈	4.나눗셈	5.종료
		
		// 두개 숫자 입력
		// 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.종료");
			System.out.println("-------------------------------------------");
			
			System.out.print("항목 선택 >> ");
			int selectNo = sc.nextInt();
			
			int num1 = 0;
			int num2 = 0;
			
			if(selectNo>=1 && selectNo<=4) {
				System.out.print("첫번째 숫자 입력 >> ");
				num1 = sc.nextInt();
				
				System.out.print("두번째 숫자 입력 >> ");
				num2 = sc.nextInt();
			}
			
			switch(selectNo) {
			
			case 1:
				
				A.sum(num1, num2);
				break;
			case 2:
				
				A.subtract(num1, num2);
				break;
			case 3:
				
				A.multiply(num1, num2);
				break;
			case 4:
				
				A.divide(num1, num2);
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요!");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
