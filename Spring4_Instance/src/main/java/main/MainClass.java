package main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.TestClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx
			= new FileSystemXmlApplicationContext("beans.xml");
		
		// 싱글톤 객체 추출
		// xml 파일을 로딩할 때 객체가 생성이 된다.
		// getBean 할 때 마다 계속 같은 객체의 주소값이
		// 반환된다.
		// import bean
		TestClass t1 = ctx.getBean("test1", TestClass.class);
		TestClass t2 = ctx.getBean("test1", TestClass.class);
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		
		// 프로토타입 객체
		// getBean 메서드를 호출할 때 객체가 생성된다.
		TestClass t3 = ctx.getBean("test2", TestClass.class);
		TestClass t4 = ctx.getBean("test2", TestClass.class);
		
		System.out.println("t3 : " + t3);
		System.out.println("t4 : " + t4);
		ctx.close();
	}
}








