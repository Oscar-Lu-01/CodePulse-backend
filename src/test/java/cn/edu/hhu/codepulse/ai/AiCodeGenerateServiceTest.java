package cn.edu.hhu.codepulse.ai;

import cn.edu.hhu.codepulse.ai.model.HtmlCodeResult;
import cn.edu.hhu.codepulse.ai.model.MultiFileCodeResult;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AiCodeGenerateServiceTest {

    @Resource
    private AiCodeGeneratorService aiCodeGenerateService;

    @Test
    void generateHtmlCode() {
        HtmlCodeResult result =  aiCodeGenerateService.generateHtmlCode("做一个编程导航html代码，20行左右");
        Assertions.assertNotNull(result);
    }

    @Test
    void generateMultiFileCode() {
        MultiFileCodeResult result = aiCodeGenerateService.generateMultiFileCode("做一个编程导航程序代码");
        Assertions.assertNotNull(result);
    }
}