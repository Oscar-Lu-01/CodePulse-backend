package cn.edu.hhu.codepulse.service;

import cn.edu.hhu.codepulse.model.dto.chathistory.ChatHistoryQueryRequest;
import cn.edu.hhu.codepulse.model.entity.User;
import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import cn.edu.hhu.codepulse.model.entity.ChatHistory;

import java.time.LocalDateTime;

/**
 * 对话历史 服务层。
 *
 * @author <a href="https://github.com/Oscar-Lu-01">抱璞</a>
 */
public interface ChatHistoryService extends IService<ChatHistory> {

    /**
     * 添加对话记录
     * @param appId
     * @param message
     * @param messageType
     * @param userId
     * @return
     */
    boolean addChatMessage(Long appId, String message, String messageType, Long userId);

    /**
     * 根据ID删除对话记录
     * @param appId
     * @return
     */
    boolean deleteByAppId(Long appId);

    /**
     * 构造查询条件
     * @param chatHistoryQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(ChatHistoryQueryRequest chatHistoryQueryRequest);

    /**
     * 分页查询对话记录（游标实现）
     * @param appId
     * @param pageSize
     * @param lastCreateTime
     * @param loginUser
     * @return
     */
    Page<ChatHistory> listAppChatHistoryByPage(Long appId, int pageSize,
                                               LocalDateTime lastCreateTime,
                                               User loginUser);
}
