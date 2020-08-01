package pl.coderslab.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.coderslab.beans.HelloWorld;

public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("jee-spring-java");

//        HelloWorld bean = context.getBean(HelloWorld.class);
        // Tutaj id bean jest taki jak nazwa metody @Bean
        HelloWorld bean = (HelloWorld) context.getBean("helloWorld");
        bean.hello();

        context.close();
    }
}
