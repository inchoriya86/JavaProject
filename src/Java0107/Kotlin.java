package Java0107;

public class Kotlin {
	// (1)필드
	// 이름(name), 나이(age), 소속(academy), 연락처(phone), 주소(addr)
	String name;
	int age;
	String academy = "ICIA";
	String phone;
	String addr;
	
	
	// (2) 메소드
	int addAge() {
		return ++age;
	}	// 반환되는 값이 있다.
		// 메소드 자체가 값(int형)이다.
	
	
	void addAge1() {
		age++;
	}
	// 반환되는 값이 없다.
	// 메소드 안에 있는 내용만 실행.
	
	
	
}
