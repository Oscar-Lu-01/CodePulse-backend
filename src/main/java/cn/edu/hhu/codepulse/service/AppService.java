package cn.edu.hhu.codepulse.service;

import cn.edu.hhu.codepulse.model.dto.app.AppQueryRequest;
import cn.edu.hhu.codepulse.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import cn.edu.hhu.codepulse.model.entity.App;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/Oscar-Lu-01">抱璞</a>
 */
public interface AppService extends IService<App> {

    AppVO getAppVO(App app);

    List<AppVO> getAppVOList(List<App> appList);

    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);
}
