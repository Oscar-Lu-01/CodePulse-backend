package cn.edu.hhu.codepulse.ai;

import cn.edu.hhu.codepulse.ai.model.HtmlCodeResult;
import cn.edu.hhu.codepulse.ai.model.MultiFileCodeResult;
import dev.langchain4j.service.SystemMessage;

public interface AiCodeGeneratorService {

    /**
     * 生成 HTML 代码
     * @param userMessage 用户提示词
     * @return AI生成结果
     */
    @SystemMessage(fromResource = "prompt/codegen-html-system-prompt.txt")
    HtmlCodeResult generateHtmlCode(String userMessage);

    /**
     * 生成多文件 HTML 代码
     * @param userMessage 用户提示词
     * @return AI生成结果
     */
    @SystemMessage(fromResource = "prompt/codegen-multi-file-system-prompt.txt")
    MultiFileCodeResult generateMultiFileCode(String userMessage);
}
