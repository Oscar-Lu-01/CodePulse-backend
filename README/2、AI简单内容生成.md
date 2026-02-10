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
3、给字段添加描述@Description
4、提示词工程


流式输出方案：
1、LangChain4j + React：引入pom依赖，使用Flex<String>和doOnNext()
    需要配置StreamChatModel，并在构建时候加入
    需要写代码解析器
2、原生方案


使用的设计模式：
1、门面模式：把复杂系统设计为门面和子系统，调用者调用门面，门面执行子系统，调用者无需了解细节
2、策略模式：定义一系列算法以及一个算法使用策略，调用使用策略切换算法
3、模板方法模式：抽象类定义方法流程，子类实现具体的具体步骤（配合策略模式）