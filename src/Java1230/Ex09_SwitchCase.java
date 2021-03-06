/*
	Date : 2020.12.30
	Author : inchoriya
	Description : 조건문 SwitchCase
	Version : 1.0
 */
package Java1230;

import java.util.Scanner;

public class Ex09_SwitchCase {

	public static void main(String[] args) {
		/*
		 	switch(조건변수) {
		 	
		 	case 1:
		 		해당 조건이 맞을 경우 실행;
		 		break;
		 	case 2:
		 		해당 조건이 맞을 경우 실행;
		 		break;
		 	case 3:
		 		해당 조건이 맞을 경우 실행;
		 		break;
		 	
		 		~~~~
		 		
		 	default :
		 		case에서 주어진 변수 외에 다른 것일 입력할 경우 실행;
		 		break;
		 	}
		  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("숫자 입력(0~2) >> ");
		int num = sc.nextInt();
		
		
		switch(num) {
		
		case 0:			// if(num==0)
			System.out.println("0을 입력했습니다.");
			break;
		case 1:			// if(num==1)
			System.out.println("1을 입력했습니다.");
			break;
		case 2:			// if(num==2)
			System.out.println("2를 입력했습니다.");
			break;
		default:		// else
			System.out.println("그 외에 숫자를 입력했습니다.");
			break;
		}
		
		// case문 끝에 break가 붙어있는 이유는
		// 다음 case문을 실행하지 말고 switch문을 빠져나기 위해서..
		
		// break가 없으면 다음 case문이 실행되는데
		// 이때에는 case 변수값에 상관없이 실행!
		
		
		
		

	}

}









