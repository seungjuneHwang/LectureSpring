package bean;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

// 이 자바 파일은 스프링 설정에 관련되어 사용하겠다고
// 설정
// beans.xml 대신 사용
@Configuration
public class AppConfig {

	// bean 설정
	// 메서드의 이름이 id가 된다. getBean 메서드 사용시
	// 메서드의 이름을 id값으로 넣어주면 이 메서드가
	// 호출되고 이 메서드가 반환하는 객체를 받는다.
	// 싱글톤
	// getBean할때 data1이라는 id를 사용하면
	// data1이라는 객체가 있는지 확인해보고 없으면
	// 이 메서드를 호출해 객체를 받아서 data1이라는
	// 이름으로 관리하게 된다.
	@Bean
	public DataClass data1(){
		System.out.println("data1 메서드 호출");
		return new DataClass();
	}
	// prototype
	@Bean
	@Scope("prototype")
	public DataClass data2(){
		System.out.println("data2 메서드 호출");
		return new DataClass();
	}
	// 수동 주입
	@Bean
	public TestClass test1(){
		TestClass t1 = new TestClass();
		// 주입할 객체를 생성한다.
		DataClass d1 = new DataClass();
		DataClass d2 = new DataClass();
		t1.setD1(d1);
		t1.setD2(d2);
		
		return t1;
	}
	// 자동주입
	// TestClass에는 d1과 d2라는 변수가 있다.
	// 이때문에 d1과 d2라는 메서드가 있는지 확인하고
	// 있으면 호출해서 객체를 받아 주입하고
	// 없으면 null을 주입해준다.
	@Bean(autowire = Autowire.BY_NAME)
	public TestClass test2(){
		return new TestClass();
	}
	@Bean
	public DataClass d1(){
		return new DataClass();
	}
	@Bean
	public DataClass d2(){
		return new DataClass();
	}
	// TestClass에 있는 변수 d1과 d2가 타입이 
	// DataClass 타입이기 때문에 DataClass 타입을
	// 반환하는 메서드를 찾아 호출한다.
	// 만약 메서가 하나가 아니라면 호출할 메서드를
	// 결정할 수 없기때문에 오류가 발생
	/*
	@Bean(autowire = Autowire.BY_TYPE)
	public TestClass test3(){
		return new TestClass();
	}
	*/
	@Bean(autowire = Autowire.BY_TYPE)
	public TestClass2 test4(){
		return new TestClass2();
	}
	// BY_TYPE 형태로 자동 주입시 호출될 메서드
	@Bean
	public DataClass2 data_method(){
		return new DataClass2();
	}
}












