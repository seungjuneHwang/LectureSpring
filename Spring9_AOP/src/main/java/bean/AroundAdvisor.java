package bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("around advice 1");
		//개발자가 원래 호출했던 메서드를 호출한다.
		Object obj = arg0.proceed();
		
		System.out.println("around advice 2");
		return obj;
	}

}







