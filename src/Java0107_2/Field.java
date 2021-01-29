package Java0107_2;

public class Field {
	/*
	 * 	1. 맴버변수 (필드)
	 * 		: 객체가 생성 될때 각 객체별로 초기화
	 * 		: 선언 시 초기화 하지 않으면 초기값으로
	 * 
	 *  2. static변수
	 *  	: 객체를 생성하지 않아도 바로 참조 가능
	 * 
	 *  3. 로컬변수
	 *  	: 클래스 영역이 아닌 부분에서 선언되는 변수
	 *  	: 매소드나 초기화 블록에 선언되는 변수
	 */
	
	// 맴버 변수
	int size=18;
	
	// static 변수
	static int price=200;
	
	
	// 기본생성자
	Field(){
		
	}
	
	// 매개변수 : size
	Field(int size){
		this.size = size;
	}
}
