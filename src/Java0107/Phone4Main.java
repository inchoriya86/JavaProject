package Java0107;

public class Phone4Main {

	public static void main(String[] args) {
		
		Phone4 phone = new Phone4();
		
		phone.charger = "USB-C";
		phone.battery = 10;
		
		phone.Charge();
		System.out.println("battery : " + phone.battery);
		
		
		
		
		Phone4 phone1 = new Phone4();
		phone1.charger = "USB-A";
		phone1.battery = 10;
		
		phone1.Charge();
		System.out.println("battery1 : " + phone1.battery);

	}

}
