package Java0107_2;

public class FieldMain {

	public static void main(String[] args) {
		// 로컬변수
		int temp;

		Field field = new Field();

		System.out.println("field.size : " + field.size);
		System.out.println("field.price(객체) : " + field.price);
		System.out.println("Field.price(클래스) : " + Field.price);

		Field field2 = new Field(99);
		System.out.println("(1) new Field() : " + field.size);
		System.out.println("(2) new Field(99) : " + field2.size);
		field2.size = 13;
		System.out.println("(3) field2.size=13 : " + field2.size);

		// System.out.println("로컬변수 temp : " + temp);

	}

}
