/*
	Date : 2020.12.30
	Author : inchoriya
	Description : 최댓값, 중간값, 최솟값 구하기(MaxMidMinEx)
	Version : 1.0
 */
package Java1230;

import java.util.Scanner;

public class Ex08_MidNumber {

	public static void main(String[] args) {
		// 응용. 숫자 3개를 입력받아서 최댓값, 최솟값, 중간값!
		int num1, num2, num3;
		int max, mid, min;

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 >> ");
		num1 = sc.nextInt();
		System.out.print("두번째 숫자 >> ");
		num2 = sc.nextInt();
		System.out.print("세번째 숫자 >> ");
		num3 = sc.nextInt();

//		if(num1>num2) {
//			// num1이 num2보다 크다
//			
//			if(num1>num3) {
//				// num1이 num3보다 크다
//				max = num1;
//				if(num2>num3) {
//					// num2가 num3보다 크다
//					mid = num2;
//					min = num3;
//				} else {
//					// num3이 num2보다 크다
//					mid = num3;
//					min = num2;
//				}
//			} else {
//				// num3이 num1보다 크다(num3이  num2보다 크다)
//				max = num3;
//				mid = num1;
//				min = num2;
//			}			
//		} else {
//			// num2가 num1보다 크다
//			if(num2>num3) {
//				// num2가 num3보다 크다
//				max = num2;
//				if(num1>num3) {
//					mid = num1;
//					min = num3;
//				} else {
//					mid = num3;
//					min = num1;
//				}
//			} else {
//				// num3이 num2보다 크다
//				max = num3;
//				mid = num2;
//				min = num1;
//			}
//		}

		// 간단하게 정리
		if (num1 > num2 && num1 > num3) { // num1이 가장 클 때

			max = num1;

			/////////////////////////
			// num1이 가장 크기 때문에
			// num2와 num3만 비교
			if (num2 > num3) {
				mid = num2;
				min = num3;
			} else {
				mid = num3;
				min = num2;
			}
			/////////////////////////

		} else if (num2 > num1 && num2 > num3) { // num2가 가장 클 때

			max = num2;
			/////////////////////////
			// num2가 가장 크기 때문에
			// num1과 num3만 비교
			if (num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}
			/////////////////////////

		} else { // num3이 가장 클 때

			max = num3;
			/////////////////////////
			// num3이 가장 크기 때문에
			// num1과 num2만 비교
			if (num1 > num2) {
				mid = num1;
				min = num2;
			} else {
				mid = num2;
				min = num1;
			}
			/////////////////////////

		}

		System.out.println("최댓값 : " + max);
		System.out.println("중간값 : " + mid);
		System.out.println("최솟값 : " + min);

	}

}
