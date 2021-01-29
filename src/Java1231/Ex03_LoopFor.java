/*
	Date : 2020.12.31
	Author : inchoriya
	Description : 반복문for(LoopFor)
	Version : 1.0
 */
package Java1231;

public class Ex03_LoopFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 	<For문의 구조>
		 	
		 	for(초기화식 ; 조건식 ; 증감식) {
		 	
		 		수행문 (실행 될 내용)
		 	
		 	}
		 	
		 	① 초기화식 → ②조건식(참일 경우) → ③수행문 → ④증감식
		 			→ ②조건식(참일 경우) → ③수행문 → ④증감식
		 			
		 			→ ②조건식(거짓일 경우) → ⑤반복문 종료
		 */
		
		//for(int i=0; i<10; i++) {
		//	System.out.println("안녕하세요!");
		//}
		
		// 초기화식 : int i = 0;
		// 조건식    : i<10;
		// 수행문    : System.out.println("안녕하세요!");
		// 증감식	  : i++
		
		// 1부터 10까지 출력
		int i;
		
		for(i=1; i<=10; i++) {
			
			System.out.println(i);
			
		}
		
		System.out.println("반복문 종료 후 i 값 : " + i);
		
		
		
		
		
	}

}










