package core;

import filter.ApplicationFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


@EnableZuulProxy
@SpringBootApplication
public class MdcProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MdcProxyApplication.class, args);
    }

    @Bean
    public ApplicationFilter applicationFilter() {
        return new ApplicationFilter();
    }
}
