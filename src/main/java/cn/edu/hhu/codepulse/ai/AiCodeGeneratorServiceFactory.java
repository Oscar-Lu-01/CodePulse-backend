package cn.edu.hhu.codepulse.ai;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AI 服务创建工厂
 */
@Configuration
public class AiCodeGeneratorServiceFactory {

    @Resource
    ChatModel chatModel;

    @Bean
    AiCodeGeneratorService aiCodeGenerateService(){
        return AiServices.create(AiCodeGeneratorService.class,chatModel);
    };
}
