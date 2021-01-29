package Java0104;

import java.util.Scanner;

public class Ex03_ForExam2 {

	public static void main(String[] args) {
		// 다이아몬드!!!
		// (2) 숫자(줄)를 입력받아서 다이아몬드 만들기
		
		System.out.print("숫자(홀수)를 입력해주세요 >> ");
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		
		if(line%2==0) {
			System.out.println("입력하신 숫자 "+ line +"는 짝수입니다.");
			line += 1;
			
			System.out.println("입력하신 숫자에 +1을 한 후 " + line + "(으)로 진행하겠습니다.");
		}
		
		int space = line / 2;
		int star = 1;
		
		for(int i=1; i<=line; i++) {
			
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=star; k++) {
				System.out.print("*");
			}
			
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			
			if(i<(line/2)+1) {
				space -= 1;
				star += 2;
			} else {
				space += 1;
				star -= 2;
			}
			
			System.out.println();
			
		}
		
		
		
		
			
		

	}

}













