/*
	Date : 2020.12.31
	Author : inchoriya
	Description : 별찍기 역순
	Version : 1.0
 */
package Java1231;

public class Ex10_ReverseStar {

	public static void main(String[] args) {
		// *****	// 1줄 : 5개
		// ****		// 2줄 : 4개
		// ***		// 3줄 : 3개
		// **		// 4줄 : 2개
		// *		// 5줄 : 1개
		
		
		for(int i=1; i<=5; i++) {
			
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
/*
 						*
 					   ***
 					  *****
 					   ***
 					    *
 */

	}

}
