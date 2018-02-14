package bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("scan2")
@Scope("prototype")		// 스코프, scope 속성과 동일
                        // 생략시에는 싱글톤
public class ScanClass2 {

}
