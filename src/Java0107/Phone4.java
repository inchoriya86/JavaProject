package Java0107;

public class Phone4 {
	/*
	 
	  		1. 사양 - 해상도(FHD, QHD),
	  				색상,
	  				물리키(볼륨키, 전원키),
	  				카메라,
	  				CUP,
	  				RAM,
	  				배터리,
	  				충전단자(USB-A or C)
	  		
	  		2. 기능 - 갤러리 관련(사진 및 동영상 촬영, 편집)
	  			        인터넷
	  			        문서편집(Word, PPT)
	  			        통화 및 문자
	  			        그 외에 어플리케이션 활용
	  		
	 */
	
	// 클래스의 3가지 요소
	
	// (1) 필드
	String resolution;
	String color;
	String button;
	boolean camera;
	String cpu;
	String ram;	
	int battery;
	String charger;
	
	// (2) 메소드
	void takePicture(){
		camera = true;
		System.out.println("사진을 찍습니다.");
	}
	
	// 충전
	int Charge() {
		if(charger.equals("USB-A")) {
			battery = battery + 1;
		} else if(charger.equals("USB-C")) {
			battery = battery + 2;
		}
		return battery;
	}
	
	
	
	// (3) 생성자	: 생성자를 만들지 않을 경우 기본생성자가 자동적으로 만들어진다.(눈에 보이지는 않음)
	
	//	Phone4(){
	//		
	//	}
	
}










