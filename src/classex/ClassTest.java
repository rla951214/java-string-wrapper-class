package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();  // 3���� ������� �����ü� �ִ� ������� ��� �����ϴ�
		
		// 1��° ���
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		// 2��° ���
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		// 3��° ���
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
	}

}
