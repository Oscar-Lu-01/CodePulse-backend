package cn.edu.hhu.codepulse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.hhu.codepulse.mapper")
public class CodePulseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodePulseApplication.class, args);
    }

}
