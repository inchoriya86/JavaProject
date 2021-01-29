package Java0108;

import java.util.Scanner;

public class KotlinStuMain {

	public static void main(String[] args) {
		// 학생수 입력 -- hint)stu[i]
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("student count >> ");
		int i = sc.nextInt();
		
		KotlinStu stu[] = new KotlinStu[i];
		
		for(i=0; i<stu.length; i++) {
			System.out.println("No."+ (i+1) + " Student");
			
			System.out.print("Id >> ");
			String id = sc.next();
			
			System.out.print("Password >> ");
			String password = sc.next();
			
			System.out.print("Name >> ");
			String name = sc.next();
			
			System.out.print("Birth >> ");
			String birth = sc.next();
			
			System.out.print("Gender >> ");
			String gender = sc.next();
			
			System.out.print("Email >> ");
			String email = sc.next();
			
			System.out.print("Phone >> ");
			String phone = sc.next();
			
			stu[i] = new KotlinStu(id, password, name, birth, gender, email, phone);
			System.out.println();
		}
		
		
		for(i=0; i<stu.length; i++) {
			System.out.println(stu[i]);
		}
		
		
		
			
		// 입력받은 학생수만큼 정보 입력(아이디, 비밀번호 등등..)
		// 매개변수 생성자를 객체로 만든다.
		
		// 학생정보를 출력(3명이면 3개의 학생 정보출력)
		

	}

}
