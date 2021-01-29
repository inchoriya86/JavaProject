package Java0107;

import java.util.Scanner;

public class CarMain {
	
	public static void main(String[] args) {
	
		Car myCar = new Car();
		myCar.company = "테슬라";
		myCar.model = "모델X";
		myCar.color = "black";
		myCar.speed = 200;
		
//		System.out.println("내차 정보");
//		System.out.println("제조사 : " + myCar.company);
//		System.out.println("모델명 : " + myCar.model);
//		System.out.println("색   상 : " + myCar.color);
//		System.out.println("최고속도 : " + myCar.speed);

		//
		Car pcwCar = new Car();
		pcwCar.company = "기아";
		pcwCar.model="카니발";
		pcwCar.color="black";
		pcwCar.speed=200;

		//
		Car lmsCar = new Car();
		lmsCar.company = "Benz";
		lmsCar.model = "C클래스";
		lmsCar.color = "Black";
		lmsCar.speed = 200;
		
		// 메소드1. setGas()
		lmsCar.setGas(10);
		System.out.println("lmsCar.gas : " + lmsCar.gas);
		
		// 메소드2. isLeftGas()
		boolean gasState = lmsCar.isLeftGas();
		System.out.println("gasState : " + gasState);
		// isLeftGas()는 메소드지만 true나 false 값을 가진다.

		
		// 메소드3. run()
		if(gasState) {
			lmsCar.run();
		}		
		
		//
		pcwCar.setGas(20);
		gasState = pcwCar.isLeftGas();
		if(gasState) {
			pcwCar.run();
		}	
		
		// Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();
		
		// Scanner : 클래스
		// sc : 객체
		// nextInt() : 메소드
		
	}
	

}
