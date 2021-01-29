package Java0105;

import java.util.Scanner;

public class Ex10_ArrayProject {

	public static void main(String[] args) {
		// (1) while문 이용
		// (2) 출제 문항수 입력
		// (3) 문제 출제(단어, 뜻) 입력
		// (4) 문제 풀기
		// (5) 결과보기
		// (6) 길이가 가장 긴 단어 찾기! (words[i][j].length)
		// (7) 종료
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		boolean check = true;
		boolean result = true;		// 
		
		String words[][] = null;
		
		int wordsNum = 0;
		int score = 0;
		
		int max = 0;
		String maxWord = "";
		
		System.out.println(""
				+ "**********************************\n"
				+"	Words Game System v1.0\n"
				+"		Designed by inchoriya\n"
			    +"**********************************\n");
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println(" 1.문항수 입력 | 2.문제출제 | 3.문제보기");
			System.out.println(" 4.문제풀기     | 5.결과보기 | 6.종  료 ");
			System.out.println("--------------------------------");
			
			System.out.print("메뉴 선택 >> ");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1:
				System.out.print("문항수 입력 >> ");
				wordsNum = sc.nextInt();
				break;
				
			case 2:
				// wordsNum 조건
				// wordsNum = 0일때 true
				// wordsNum = 2일때 false
				
				System.out.println("확인 : " + (wordsNum <= 0));
				if(wordsNum <= 0) {
					System.out.println("문항수를 입력해주세요!");
					break;
				}
				// wordsNum이 0보다 클 경우 
				words = new String[wordsNum][2];
				
				// wordsNum이 3일 경우
				
				// words[0][0] : 첫번째 단어
				// words[0][1] : 첫번째 단어 뜻
				
				// words[1][0] : 두번째 단어
				// words[1][1] : 두번째 단어 뜻

				// words[2][0] : 세번째 단어
				// words[2][1] : 세번째 단어 뜻
				
				
				for(int i=0; i<words.length; i++) {
					System.out.print((i+1)+"번 단어 입력 >> ");
					words[i][0] = sc.next();
					System.out.print((i+1)+"번 뜻 입력 >> ");
					words[i][1] = sc.next();
				}	// words[i][0] : 단어 , words[i][1] : 뜻
				
				check = false;	// 문제를 출제했다.
				break;
				
			case 3:
				// check는 문제 출제를 하지 않을 경우 true => if문 실행
				// 문제출제(case2)를 하면 false로 바뀐다 => if문 실행X
				
				if(check) { //문제 출제를 하지 않았을 경우 
					System.out.println("문제를 출제하세요!"); 
					break; 
				}
				
				 
				for(int i=0; i<words.length; i++) {
					
					
					System.out.println((i+1)+"번 단어 : " + words[i][0]	
							+",\t\t뜻: " + words[i][1]);
				}
				
				break;
				
			case 4:
				
				if(check) {	//문제 출제를 하지 않았을 경우
					System.out.println("문제를 출제하세요!");
					break;
				}
				
				for(int i=0; i<words.length; i++) {
					System.out.print("문제" + (i+1) + ". " + words[i][0] + "의 뜻은? ");
					// 문제1. [      ] 의 뜻은?
					
					String answer = sc.next();
					// 입력한 값을 String타입의 변수 answer에 담기
					// answer  =  사과
					
					
					// answer == 사과
					// 문자타입일 경우 
					// 문자변수.equals(비교할문자)
					
					// 우리가 입력한 값이랑 단어뜻을 비교하여 같으면 if문 실행
					if(answer.equals(words[i][1])) {
						
						System.out.println("정답입니다!");
						score++;
						// score += 1;
						
					} else {
						
						System.out.println("틀렸습니다!");
						System.out.println("정답은 " + words[i][1] + " 입니다.");
						
					}
				}
				result = false;
				break;
				
			case 5:
				// if(조건) 조건 만족 : true / 불만족 : false
				// 문제를 풀지 않을 경우 true
				// 문제를 풀었을 경우(case4) false
				if(result) {	//문제 풀지 않았을 경우
					System.out.println("먼저 문제를 풀어주세요!");
					break;
				}
				
				System.out.println();
				System.out.println("========== 결과 ============");
				System.out.println("총 " + words.length + "개 중에서 " + score + "개 맞췄습니다!");
				
				double percent = (double)score/words.length * 100;
				System.out.println("정답률은 " + percent +"% 입니다!");
				
				// words.length
				// [Array].length
				
				// words[i][0].length()
				// [String].length()
				
				for(int i=0; i<words.length; i++) {
					if(words[i][0].length()>max) {
						max = words[i][0].length();
						maxWord = words[i][0];
					}
				}
				System.out.println("가장 긴 단어는 " + maxWord + "이고, " + max + "자 입니다!");
				System.out.println();
				break;
				
			case 6:
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요!");
				break;
				
			} // end switch
			
		} // end while
	System.out.println("프로그램을 종료합니다!");

}

}
