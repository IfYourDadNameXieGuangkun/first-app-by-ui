package thinkinspringboot.firstappbyui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import thinkinspringboot.firstappbyui.config.WebAutoConfiguration;
import thinkinspringboot.firstappbyui.config.WebConfiguration;

//@SpringBootApplication
@EnableAutoConfiguration
public class FirstAppByUiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FirstAppByUiApplication.class, args);
        WebConfiguration bean = context.getBean(WebConfiguration.class);
        System.out.println(bean);

    }

}
