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
        System.out.println(String.format("最大内存: {%s}m  已分配内存: {%s}m  已分配内存中的剩余空间: {%s}m  最大可用内存: {%s}m", Runtime.getRuntime().maxMemory() / 1024 / 1024, Runtime.getRuntime().totalMemory() / 1024 / 1024, Runtime.getRuntime().freeMemory() / 1024 / 1024,
                (Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory() + Runtime.getRuntime().freeMemory()) / 1024 / 1024));
    }
}