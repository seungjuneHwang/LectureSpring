package bean;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
/*
 * before advisor
 * 
 * advice : 메서드를 호출할 때 중간에 스프링이 가로채고
 *          작업 순서를 어떻게 하겠다고 정의한것
 * advisor : advice를 구현한 것
 */
public class BeforeAdvisor implements MethodBeforeAdvice{
	// 개발자가 호출한 메서드를 호출하기 전에
	// 자동으로 호출되는 메서드
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before advice");
	}
}







