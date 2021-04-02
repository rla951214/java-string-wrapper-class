package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();  // 3가지 방법으로 가져올수 있다 결과값은 모두 동일하다
		
		// 1번째 방법
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		// 2번째 방법
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		// 3번째 방법
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
	}

}
