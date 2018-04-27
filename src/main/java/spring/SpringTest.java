package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.service.SimpleService;

/**
 * <p>
 * spring测试类
 * </p>
 *
 * @author liaoyalang
 * @since 2018-04-26
 **/
public class SpringTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        SimpleService service = context.getBean("simpleService", SimpleService.class);
        service.test();
    }
}