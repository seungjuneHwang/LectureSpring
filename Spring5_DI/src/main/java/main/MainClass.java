package main;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.DataClass;
import bean.TestClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx
			= new FileSystemXmlApplicationContext("beans.xml");
		
		// 자바코드로 객체 생성
		// import bean
		DataClass d1 = new DataClass();
		TestClass t1 = new TestClass(100, "문자열1", d1);
		
		// beans.xml에 정의한 빈을 가져온다.
		TestClass t2 = ctx.getBean("test1", TestClass.class);
		
		System.out.println("t1.data1 : " + t1.getData1());
		System.out.println("t2.data1 : " + t2.getData1());
		
		System.out.println("t1.data2 : " + t1.getData2());
		System.out.println("t2.data2 : " + t2.getData2());
		
		System.out.println("t1.data3 : " + t1.getData3());
		System.out.println("t2.data3 : " + t2.getData3());
		
		// 객체 생성후 setter 맴버 셋팅
		DataClass d3 = new DataClass();
		TestClass t3 = new TestClass();
		t3.setData1(200);
		t3.setData2("문자열3");
		t3.setData3(d3);
		
		System.out.println("t3.data1 : " + t3.getData1());
		System.out.println("t3.data2 : " + t3.getData2());
		System.out.println("t3.data3 : " + t3.getData3());
		
		// beans.xml에서 객체를 가져온다.
		TestClass t4 = ctx.getBean("test2", TestClass.class);
		System.out.println("t4.data1 : " + t4.getData1());
		System.out.println("t4.data2 : " + t4.getData2());
		System.out.println("t4.data3 : " + t4.getData3());
		
		// ArrayList 주입
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("list1 문자열1");
		list1.add("list1 문자열2");
		list1.add("list1 문자열3");
		
		TestClass t5 = new TestClass();
		t5.setData4(list1);
		
		System.out.println("t5.data4 : " + t5.getData4());
		
		// beans.xml에서 객체를 가져온다.
		TestClass t6 = ctx.getBean("test3", TestClass.class);
		
		System.out.println("t6.data4 : " + t6.getData4());
		
		// 제네릭이 클래스타입인 ArrayList
		ArrayList<DataClass> list2 = new ArrayList<DataClass>();
		DataClass d10 = new DataClass();
		DataClass d20 = new DataClass();
		DataClass d30 = new DataClass();
		list2.add(d10);
		list2.add(d20);
		list2.add(d30);
		
		TestClass t7 = new TestClass();
		t7.setData5(list2);
		
		System.out.println("t7.data5 : " + t7.getData5());
		
		// 스프링에서 객체 가져오기
		TestClass t8 = ctx.getBean("test4", TestClass.class);
		//TestClass t8 = (TestClass)ctx.getBean("test4");
		System.out.println("t8.data5 : " + t8.getData5());
		
		// 자바 코드로 해시맵 주입
		HashMap<String, Object> map1 = new HashMap<String, Object>();
		
		map1.put("value1", 500);
		map1.put("value2", "안녕하세요");
		DataClass d200 = new DataClass();
		map1.put("value3", d200);
		
		TestClass t9 = new TestClass();
		t9.setData6(map1);
		
		System.out.println("t9.data6 : " + t9.getData6());

		// 스프링을 통해 객체를 추출한다.
		TestClass t10 = ctx.getBean("test5", TestClass.class);
		System.out.println("t10.data6 : " + t10.getData6());
		
		ctx.close();
	}

}






