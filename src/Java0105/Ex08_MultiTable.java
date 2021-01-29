/*
	Date : 2020.01.05
	Autoer : inchoriya
	Description : MultiTable(구구단)
	version : 1.0
*/
package Java0105;

public class Ex08_MultiTable {

	public static void main(String[] args) {
		// 구구단을 2차원 배열과 for문을 사용해서 만들어보자!
		
		//int multi[][] = new int[10][10];
		// 9단까지 만들기 위해
		
//		for(int i=2; i<multi.length; i++) {
//			System.out.println("=== " + i + "단 ===");
//			for(int j=1; j<multi[i].length; j++) {
//				
//				multi[i][j] = i*j;
//				System.out.println(i + "x" + j + " = " + multi[i][j]);
//				
//			}
//			System.out.println();
//			
//		}
		
		int multi[][] = new int[8][9];
		
		for(int i=0; i<multi.length; i++) {	// 0(+2)~7(+2) :: 2~9
			System.out.println("=== " + (i+2) + "단 ===");
			
			for(int j=0; j<multi[i].length; j++) {	// 0(+1)~8(+1) :: 1~9
				
				multi[i][j] = (i+2)*(j+1);
				System.out.println((i+2) + "x" + (j+1)+ "=" + multi[i][j]);
				
			}
			
			System.out.println();
		}
		
		
		
		
		

	}

}
