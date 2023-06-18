package com.example.swdemo2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CrosConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 对所有的URL，路径进行 CORS 的配置
                .allowedOriginPatterns("*") // 允许所有来源
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 支持的请求方法
                .allowedHeaders("*") // 允许携带的请求头
                .allowCredentials(true) // 是否允许使用 cookie
                .maxAge(3600); // 预检请求的有效期
    }
}