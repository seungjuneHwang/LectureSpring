package main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.TestClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx
			= new FileSystemXmlApplicationContext("beans.xml");
		/*
		 * id가 proxy인 빈 객체를 가져왔기 때문에 이 객체가
		 * 가지고 있는 target 속성에 설정된 빈 객체의
		 * 메서드가 호출되는 것을 감지한다.
		 * 메서드 호출 시 interceptorNames 속성에 있는
		 * Advisor들을 모두 확인한다.
		 * 
		 * Advisor에 pointcut에 설정된 메서드가 호출되었
		 * 다면 advice 속성에 지정된 Advisor 빈 객체의
		 * 메서드를 앞,뒤에 호출하게 된다.
		 */
		TestClass test1 = ctx.getBean("proxy", TestClass.class);
		test1.sayHello();
		
		ctx.close();
	}

}






