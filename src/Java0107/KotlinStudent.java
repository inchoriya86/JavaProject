package Java0107;

public class KotlinStudent {

	public static void main(String[] args) {
		Student hic1 = new Student();
		Kotlin hic2 = new Kotlin();
		
		
		System.out.println("이름 : " + hic2.name);
		
		hic2.name = "황인철";
		System.out.println("이름 : " + hic2.name);
		
		System.out.println("소속 : " + hic2.academy);
		// (1) null   // (2) ICIA
		hic2.academy = "Google";
		System.out.println("6개월 후 소속 : " + hic2.academy);
		
		
		hic2.age = 10;
		//System.out.println(hic2.addAge1());
		System.out.println(hic2.addAge());
		System.out.println(hic2.age);
		
		hic1.setName("황인철");
		// hic1.name = "황인철";

	}

}
