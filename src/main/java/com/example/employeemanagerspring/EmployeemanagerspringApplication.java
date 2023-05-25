package com.example.employeemanagerspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeemanagerspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeemanagerspringApplication.class, args);
    }


    //    @Bean
//    public CorsFilter corsFilter() {
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
//        config.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
//                "Accept", "Authorization", "Origin, Accept", "X-Requested-With",
//                "Access-Control-Request-Method", "Access-Control-Request-Headers"));
//        config.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
//                "Access-Control-Allow-Origin", "Access-Control-Allow-Origin",
//                "Access-Control-Allow-Credentials"));
//        config.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }
}
