package cn.edu.hhu.codepulse;

import dev.langchain4j.community.store.embedding.redis.spring.RedisEmbeddingStoreAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.edu.hhu.codepulse.mapper")
@SpringBootApplication(exclude = {RedisEmbeddingStoreAutoConfiguration.class})
public class CodePulseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodePulseApplication.class, args);
    }

}
