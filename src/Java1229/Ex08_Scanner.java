/*
	Date : 2020.12.29
	Author : inchoriya
	Description : 입력(Scanner)
	Version : 1.0
 */
package Java1229;

import java.util.Scanner;

public class Ex08_Scanner {

	public static void main(String[] args) {
		// Scanner클래스는 java.util 패키지 있는 입력 클래스 
		// import java.util.Scanner 추가
		
		// 스캐너를 사용하기 위해 스캐너 객체(변수) 선언
		Scanner sc = new Scanner(System.in);
		//Scanner scan = new Scanner(System.in);
		//Scanner scanner = new Scanner(System.in);
		
		// 이름, 나이, 주소
		String name;
		int age;
		String addr;
		
		System.out.print("이름을 입력하세요 >> ");
		name = sc.next();
		
		System.out.print("나이를 입력하세요 >> ");
		age = sc.nextInt();
		
		
		// age 입력 후 enter를 처리하기 위해서 addr위에 
		// sc.nextLine();를 한번 작성한다.
		sc.nextLine();
		System.out.print("주소를 입력하세요 >> ");
		addr = sc.nextLine();
		
		// nextLine() : 입력받은 한줄을 모두 저장한다.
		
		
		System.out.println();
		System.out.println("====== 출력 ======");
		System.out.println("입력한 이름 : " + name);
		System.out.println("입력한 나이 : " + age);
		System.out.println("입력한 주소 : " + addr);
		
		
		

	}

}











