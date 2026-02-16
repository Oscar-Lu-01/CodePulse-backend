package cn.edu.hhu.codepulse.service;

import cn.edu.hhu.codepulse.model.dto.app.AppQueryRequest;
import cn.edu.hhu.codepulse.model.entity.User;
import cn.edu.hhu.codepulse.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import cn.edu.hhu.codepulse.model.entity.App;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/Oscar-Lu-01">抱璞</a>
 */
public interface AppService extends IService<App> {

    /**
     * 获取应用封装视图对象
     *
     * @param app 应用实体
     * @return 应用视图对象
     */
    AppVO getAppVO(App app);

    /**
     * 获取应用封装视图对象列表
     *
     * @param appList 应用实体列表
     * @return 应用视图对象列表
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 获取查询包装器
     *
     * @param appQueryRequest 应用查询请求
     * @return 查询包装器
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    /**
     * AI 对话生成代码（流式返回）
     *
     * @param appId     应用 ID
     * @param message   用户对话内容
     * @param loginUser 当前登录用户
     * @return 响应式代码片段流
     */
    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    String deployApp(Long appId, User loginUser);
}
