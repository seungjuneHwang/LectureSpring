package main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import bean.ScanClass;
import bean.ScanClass2;
import bean.XmlClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileSystemXmlApplicationContext ctx
			= new FileSystemXmlApplicationContext("beans.xml");
		// xml에 정의한 빈 객체를 추출
		XmlClass xc1 = ctx.getBean("xc1", XmlClass.class);
		XmlClass xc2 = ctx.getBean("xc1", XmlClass.class);
		XmlClass xc3 = ctx.getBean("xc2", XmlClass.class);
		XmlClass xc4 = ctx.getBean("xc2", XmlClass.class);
		
		System.out.println("xc1 : " + xc1);
		System.out.println("xc2 : " + xc2);
		System.out.println("xc3 : " + xc3);
		System.out.println("xc4 : " + xc4);
		
		// 스캔한 빈을 가져온다.
		ScanClass sc1 = ctx.getBean("scan1", ScanClass.class);
		ScanClass sc2 = ctx.getBean("scan1", ScanClass.class);
		ScanClass2 sc3 = ctx.getBean("scan2", ScanClass2.class);
		ScanClass2 sc4 = ctx.getBean("scan2", ScanClass2.class);
		
		System.out.println("sc1 : " + sc1);
		System.out.println("sc2 : " + sc2);
		System.out.println("sc3 : " + sc3);
		System.out.println("sc4 : " + sc4);
		
		ctx.close();
	}

}















