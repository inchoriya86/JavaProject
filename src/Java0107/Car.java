package Java0107;

public class Car {
	
	// (1) 필드
	// 제조사(company), 모델명(model), 색상(color), 최고속도(speed), gas(연료)
	String company;
	String model;
	String color;
	int speed;
	int gas;
	
	
	
	// (2) 메소드
	// 연료충전 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	// 연료파악 메소드
	boolean isLeftGas() {	// 연료가 없으면 false, 있으면 true
		
		if(gas<=0) {
			System.out.println("연료가 부족합니다.");
			return false;
		} else {
			//System.out.println("연료가 충분합니다.");
			System.out.println(gas + "만큼 연료가 있습니다.");
			return true;
		}
		
	}
	
	// 주행 메소드
	void run() {
		
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다! (남은 gas량 : " + gas + " )" );
				gas--;
			} else {
				System.out.println("멈춥니다! (남은 gas량 : " + gas + " )" );
				return;	// 메소드 종료
			}
		}
	}

	// toString메소드 : 출력을 도와주는 메소드
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", speed=" + speed + ", gas=" + gas
				+ "]";
	}
	
	
	
	
	
	
	// (3) 생성자

}
