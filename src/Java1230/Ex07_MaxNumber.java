/*
	Date : 2020.12.30
	Author : inchoriya
	Description : 최댓값구하기(maxNumberEx)
	Version : 1.0
 */
package Java1230;

import java.util.Scanner;

public class Ex07_MaxNumber {
	public static void main(String[] args) {
		// 숫자 두개를 입력 받아서 큰 수를 출력하시오.

		Scanner sc = new Scanner(System.in);

		int num1, num2, max;

		System.out.print("첫번째 숫자 입력 >> ");
		num1 = sc.nextInt();

		System.out.print("두번째 숫자 입력 >> ");
		num2 = sc.nextInt();

//		if(num1 > num2) {
//			max = num1;
//		} else {
//			max = num2;
//		}
//		
//		System.out.println("둘중 큰 수는 " + max + " 입니다.");

		// 숫자 3개를 입력 받아서 큰 수를 출력하시오!
		int num3;
		System.out.print("세번째 숫자 입력 >> ");
		num3 = sc.nextInt();

		if (num1 > num2) {
			// num1 더 큼
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			// num2 더 큼
			if (num2 > num3) {
				max = num2;
			} else {
				max = num3;
			}
		}
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		// [Ctrl] + [Shift] + [F]
	}
}
