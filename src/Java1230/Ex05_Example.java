/*
	Date : 2020.12.30
	Author : inchoriya
	Description : 조건문연습문제(ifExample)
	Version : 1.0
 */
package Java1230;

import java.util.Scanner;

public class Ex05_Example {

	public static void main(String[] args) {
		// 국어(kor), 영어(eng), 수학(mat) 점수를 입력 받아서
		// 총점(sum), 평균(avg)을 구한다
		// 평균점수가
		// 95~100 : A+
		// 90~94 : A
		// 85~89 : B+
		// 80~84 : B
		// 75~79 : C+
		// 70~74 : C
		// 65~69 : D+
		// 60~64 : D
		// 그외에 : F
		// 단 100점을 초과하면 '입력범위 초과' 가 출력되도록

		// 총점은 000점, 평균은 000점, 학점은 00 입니다!
		Scanner sc = new Scanner(System.in);

		int kor, eng, mat;
		double sum, avg;
		String grade;

		System.out.print("국어 점수 >> ");
		kor = sc.nextInt();

		System.out.print("영어 점수 >> ");
		eng = sc.nextInt();

		System.out.print("수학 점수 >> ");
		mat = sc.nextInt();

		// 총점
		sum = kor + eng + mat;

		// 평균
		avg = sum / 3;

		if (avg <= 100) {
			if (avg >= 90) { // A+, A
				if (avg >= 95) {
					grade = "A+";
				} else {
					grade = "A";
				}
			} else if (avg >= 80) {
				if (avg >= 85) {
					grade = "B+";
				} else {
					grade = "B";
				}
			} else if (avg >= 70) {
				if (avg >= 75) {
					grade = "C+";
				} else {
					grade = "C";
				}
			} else if (avg >= 60) {
				if (avg >= 65) {
					grade = "D+";
				} else {
					grade = "D";
				}
			} else {
				grade = "F";
			}			
			System.out.print("총점은 " + sum + "점 이고, ");
			System.out.print("평균은 " + avg + "점 이고, ");
			System.out.println("학점은 " + grade + "입니다!");
		} else {
			System.out.println("입력범위 초과!");
		}

	}

}
