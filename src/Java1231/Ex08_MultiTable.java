/*
	Date : 2020.12.31
	Author : inchoriya
	Description : 구구단 만들기
	Version : 1.0
 */
package Java1231;

public class Ex08_MultiTable {

	public static void main(String[] args) {	

		for(int i=1; i<=9; i++) {		// 가로 9
			
			for(int j=2; j<=9; j++) {	// 세로 8
				System.out.print(j + "x" + i + "=" + (j*i));
				System.out.print("\t");
			}
			
			System.out.println();
		}
		
	}

}








