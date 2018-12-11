package sk.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("sk.springboot.mapper")
@SpringBootApplication
public class StartBoot {
    public static void main(String[] args)
    {
        SpringApplication.run(StartBoot.class);
    }
}
