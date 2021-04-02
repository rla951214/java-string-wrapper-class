## java-String,Wrapper,Class클래스

### 공부내용
- String클래스로 문자열 연결
1. 한번 생성된 string 값은 불변
2. 두개의 문자열을 연결하면 새로운 인스턴스가 생성된다

- StringBuilder, StringBuffer 사용
1. 내부적으로 가변적인 char[] 배열을 가지고 있는 클래스이다
2. stringbuffer는 멀티 쓰레드 프로그래밍에서 동기화를 보장한다
3. 단일 쓰레드 프로그램에서는 stringbuilder를 사용하기를 권장한다
4. toString() 메서드로 String을 반환한다

- class 클래스로 정보 가져오기
1. reflection 프로그래밍 방식은 class클래스를 이용하여 클래스의 정보를 가져오고 이를 활용하며 인스턴스를 생성하고, 메서드를 호출하는 방식이다
2. 일반적으로 자료형을 알 수 있는 경우에는 사용하지 않는다

- class.forName 메서드로 동적 로딩
1. 컴파일 시에 데이터 타입이 모두 biding 되어 자료형이 로딩되는 것이 아니라 실행 중에 데이터 타입을 알고 binding 되는 방식이다
2. 어떤 클래스를 사용할지 모를 때 변수로 처리하고 실행될 때 해당 변수에 대입된 값의 클래스가 실행될 수 있도록 class클래스에서 제공하는 static 메서드이다 
