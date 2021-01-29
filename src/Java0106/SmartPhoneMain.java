package Java0106;

public class SmartPhoneMain {

	// 클래스는 한 파일안에 두개 이상도 선언이 가능하다
	// 하지만 통상 파일 하나당 하나의 클래스를 선언한다.
	public static void main(String[] args) {
		
		// 변수 선언
		// int num;
		//SmartPhone phone;
		
		// 객체 생성
		// num = 10;
		//phone = new SmartPhone();
		
		// 변수선언 + 객체생성
		// int num = 10;
		SmartPhone phone = new SmartPhone();
		
		// 두가지 비교
		// SmartPhone phone = new SmartPhone();
		// Scanner sc = new Scanner(System.in);
		
		// 변수초기화
		// 객체의 맴버(필드)에 접근방법 : .(도트)연산자 사용
		phone.company = "Samsung";
		phone.color = "black";
		phone.price = 100;
		phone.size = 6;
		phone.volume = 5;
		
		System.out.println("phone정보 출력1");
		System.out.println("phone.company : " + phone.company);
		System.out.println("phone.color : " + phone.color);
		System.out.println("phone.price : " + phone.price);
		System.out.println("phone.size : " + phone.size);
		System.out.println("phone.volume : " + phone.volume);
		System.out.println();
		
		System.out.println("phone정보 출력2");
		System.out.println(phone.toString());
		System.out.println();
		
		// 메소드 호출
		// 객체의 맴버(메소드)에 접근방법 : .(도트)연산자 사용
		System.out.println("메소드 호출");
		phone.onPower();
		phone.offPower();
		phone.downVolume();
		phone.downVolume();
		phone.downVolume();
		
		System.out.println(phone.toString());
		
		
		// 매개변수(파라미터)를 이용한 생성자 사용 
		System.out.println();
		System.out.println("생성자 사용");
		SmartPhone iphone = new SmartPhone("Apple", "White", 180, 5, 10);
		
		System.out.println(iphone);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
























