package com.hzh.dp_bot_demo_004;

import com.hzh.dp_bot_demo_004.interceptor.Interceptor1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@SpringBootApplication
public class DpBotDemo004Application implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(DpBotDemo004Application.class, args);
    }
    public void addInterceptors(InterceptorRegistry registry) {
        // TODO Auto-generated method stub
        InterceptorRegistration ir=registry.addInterceptor(new Interceptor1());
        ir.addPathPatterns("/interceptor/*").excludePathPatterns("log.jsp");
        //ir.excludePathPatterns("/WEB-INF/log.jsp");
    }
}
