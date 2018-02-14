package main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.DataClass;
import bean.TestClass;
import bean.TestClass2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx
			= new FileSystemXmlApplicationContext("beans.xml");
		
		// @Configation 사용
		// getBean시 메서드의 id값을 넣어주면
		// 그것과 동일한 이름의 메서드를 호출한다.
		DataClass data1 = ctx.getBean("data1", DataClass.class);
		DataClass data2 = ctx.getBean("data1", DataClass.class);
		DataClass data3 = ctx.getBean("data2", DataClass.class);
		DataClass data4 = ctx.getBean("data2", DataClass.class);
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		System.out.println("data4 : " + data4);
		
		// 수동 주입한 객체를 얻어온다.
		TestClass test1 = ctx.getBean("test1", TestClass.class);
		System.out.println("test1.d1 : " + test1.getD1());
		System.out.println("test1.d2 : " + test1.getD2());
		// 자동 주입한 객체를 얻어온다.
		TestClass test2 = ctx.getBean("test2", TestClass.class);
		System.out.println("test2.d1 : " + test2.getD1());
		System.out.println("test2.d2 : " + test2.getD2());
		
		/*
		TestClass test3 = ctx.getBean("test3", TestClass.class);
		System.out.println("test3.d1 : " + test3.getD1());
		System.out.println("test3.d2 : " + test3.getD2());
		*/
		
		TestClass2 test4 = ctx.getBean("test4", TestClass2.class);
		System.out.println("test4.d3 : " + test4.getD3());
		System.out.println("test4.d4 : " + test4.getD4());
		
		ctx.close();
	}

}







