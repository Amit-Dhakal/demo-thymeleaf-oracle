package com.infodev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EntityScan("com.infodev.entities")
@SpringBootApplication
public class DemoThymeleafOracleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoThymeleafOracleApplication.class,args);

    }


}
