/*
	Date : 2020.01.05
	Autoer : inchoriya
	Description : ArrayCopy(배열복사)
	version : 1.0
*/
package Java0105;

public class Ex04_ArrayCopy {

	public static void main(String[] args) {
		// 특정 실무 제외하고는 잘 사용하지 않음
		
		String kotlin1[] = {"최윤선", "박수용", "박태용", "박창용", "남궁명규"};
		String kotlin2[] = new String[5];
		
		// kotlin1[0] = 최윤선			// kotlin2[0] = null
		// kotlin1[1] = 박수용			// kotlin2[1] = null
		// kotlin1[2] = 박태용			// kotlin2[2] = null
		// kotlin1[3] = 박창용			// kotlin2[3] = null
		// kotlin1[4] = 남궁명규			// kotlin2[4] = null
		
		// System.arraycopy(src, srcPos, dest, destPos, length);
		
		// src = 복사할 배열명
		// srcPos = 복사 시작할 인덱스 번호
		// dest = 붙여넣기할 배열명
		// destPos = 붙여넣기 시작할 인덱스 번호
		// length = 복사배열크기
		
		// kotlin1[0] = 최윤선			// kotlin2[0] = 최윤선
		// kotlin1[1] = 박수용			// kotlin2[1] = 박수용
		// kotlin1[2] = 박태용			// kotlin2[2] = 박태용
		// kotlin1[3] = 박창용			// kotlin2[3] = 박창용
		// kotlin1[4] = 남궁명규			// kotlin2[4] = 남궁명규
		
//		System.arraycopy(kotlin1, 0, kotlin2, 0, kotlin1.length);
//		
//		for(int i=0; i<kotlin1.length; i++) {
//			
//			System.out.print("kotlin1[" + i + "] =  " + kotlin1[i]);
//			System.out.println("\t"+"kotlin2[" + i + "] =  " + kotlin1[i]);
//			
//		}
		
		// kotlin1[0] = 최윤선			// kotlin2[0] = 박창용
		// kotlin1[1] = 박수용			// kotlin2[1] = 남궁명규
		// kotlin1[2] = 박태용			// kotlin2[2] = 최윤선
		// kotlin1[3] = 박창용			// kotlin2[3] = 박수용
		// kotlin1[4] = 남궁명규			// kotlin2[4] = 박태용		
		
		System.arraycopy(kotlin1, 0, kotlin2, 2, kotlin1.length-2);
		System.arraycopy(kotlin1, 3, kotlin2, 0, kotlin1.length-3);
		
		
		for(int i=0; i<kotlin1.length; i++) {
			System.out.print("kotlin1[" + i + "] =  " + kotlin1[i]);
			System.out.println("\t"+"kotlin2[" + i + "] =  " + kotlin2[i]);
		}
		

	}

}
