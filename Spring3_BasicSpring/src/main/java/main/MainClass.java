package main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.HelloBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// beans.xml을 스캔한다.
		FileSystemXmlApplicationContext ctx
			= new FileSystemXmlApplicationContext("beans.xml");
		
		//id가 hello인 빈 객체를 추출한다.
		HelloBean bean = ctx.getBean("hello", HelloBean.class);
		bean.sayHello();
		
		
		ctx.close();
	}
}






