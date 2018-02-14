package main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.TestClass;
import bean.TestClass2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx
			= new FileSystemXmlApplicationContext("beans.xml");
		
		TestClass t1 = ctx.getBean("test1", TestClass.class);
		System.out.println("t1.data1 : " + t1.getData1());
		System.out.println("t1.data2 : " + t1.getData2());
		
		TestClass t2 = ctx.getBean("test2", TestClass.class);
		System.out.println("t2.data1 : " + t2.getData1());
		System.out.println("t2.data2 : " + t2.getData2());
		
		/*
		TestClass t3 = ctx.getBean("test3", TestClass.class);
		System.out.println("t3.data1 : " + t3.getData1());
		System.out.println("t3.data2 : " + t3.getData2());
		*/
		TestClass2 t4 = ctx.getBean("test4", TestClass2.class);
		System.out.println("t4.type1 : " + t4.getType1());
		System.out.println("t4.type2 : " + t4.getType2());
		System.out.println("t4.type3 : " + t4.getType3());
		System.out.println("t4.type4 : " + t4.getType4());
		System.out.println("t4.type5 : " + t4.getType5());
		System.out.println("t4.type6 : " + t4.getType6());
		
		TestClass t5 = ctx.getBean("test5", TestClass.class);
		System.out.println("t5.data1 : " + t5.getData1());
		System.out.println("t5.data2 : " + t5.getData2());
		
		TestClass t6 = ctx.getBean("test6", TestClass.class);
		System.out.println("t6.data1 : " + t6.getData1());
		System.out.println("t6.data2 : " + t6.getData2());
		
		TestClass t7 = ctx.getBean("test7", TestClass.class);
		System.out.println("t7.data1 : " + t7.getData1());
		System.out.println("t7.data2 : " + t7.getData2());
		
		ctx.close();
	}

}







