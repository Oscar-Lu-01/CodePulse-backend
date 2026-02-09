流程：用户描述 -> LLM回答 -> 提取生成内容 -> 写入本地文件

https://docs.langchain4j.info/

https://api-docs.deepseek.com/zh-cn/

langchain4j关键点：
1、模型：LanguageModel/ChatLanguageModel
2、记忆：ChatMemory（持久化、淘汰策略，对systemmeaasge特殊处理，对工具消息特殊处理）
3、流式传输
4、结构化输出：写对应的类即可


提高结构化输出成功率的技巧：
1、设置最大输出长度
2、使用RESPONSE_FORMAT_JSON_SCHEMA：https://docs.langchain4j.dev/integrations/language-models/open-ai/#structured-outputs-for-response-format
3、