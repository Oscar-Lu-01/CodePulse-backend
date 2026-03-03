package cn.edu.hhu.codepulse.config;

import cn.edu.hhu.codepulse.constant.AppConstant;
import cn.edu.hhu.codepulse.service.ScreenshotService;
import cn.edu.hhu.codepulse.utils.WebScreenshotUtils;
import cn.hutool.core.io.FileUtil;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.io.File;

import static cn.edu.hhu.codepulse.constant.AppConstant.SCREENSHOT_ROOT_DIR;

@Configuration
@EnableScheduling
@Slf4j
public class ScreenshotConfig {

    /**
     * 每天凌晨2点清理过期的临时截图文件
     */
    @Scheduled(cron = "0 0 2 * * ?")
    public void cleanupTempScreenshots() {
        log.info("开始定时清理过期的临时截图文件，目录: {}", AppConstant.SCREENSHOT_ROOT_DIR);
        try {
            // 检查目录是否存在
            if (FileUtil.exist(AppConstant.SCREENSHOT_ROOT_DIR)) {
                // FileUtil.clean 会清空目录下的所有内容，但保留 SCREENSHOT_ROOT_DIR 这个空壳文件夹
                FileUtil.clean(AppConstant.SCREENSHOT_ROOT_DIR);
                log.info("定时清理临时截图文件完成");
            } else {
                log.info("截图根目录不存在，无需清理");
            }
        } catch (Exception e) {
            log.error("定时清理临时截图文件失败", e);
        }
    }
}
