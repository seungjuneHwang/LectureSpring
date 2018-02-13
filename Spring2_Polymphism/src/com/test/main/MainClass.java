package com.test.main;

import com.test.bean.HelloBean;
import com.test.bean.HelloBeanEn;
import com.test.bean.HelloBeanKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// HelloBeanEn은 HelloBean 인터페이스를 구현하고
		// 있기 때문에 HelloBean 타입의 참조변수에
		// 담을 수 있다.
		// HelloBean bean = new HelloBeanEn();
		// 만약 클래스가 바뀔때 새로운 클래스도
		// HelloBean 인터페이스를 구현하고 있다면
		// 참조변수 타입은 동일하다. 단, 클래스가
		// 바뀌었기 때문에 객체를 생성하는 코드는 수정해야
		// 한다.
		HelloBean bean = new HelloBeanKo();
		bean.sayHello();
	}
}






