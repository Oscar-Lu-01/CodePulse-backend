package cn.edu.hhu.codepulse.core.saver;

import cn.edu.hhu.codepulse.ai.model.HtmlCodeResult;
import cn.edu.hhu.codepulse.exception.BusinessException;
import cn.edu.hhu.codepulse.exception.ErrorCode;
import cn.edu.hhu.codepulse.model.enums.CodeGenTypeEnum;
import cn.hutool.core.util.StrUtil;

/**
 * HTML代码文件保存器
 *
 * @author 抱璞
 */
public class HtmlCodeFileSaverTemplate extends CodeFileSaverTemplate<HtmlCodeResult> {

    @Override
    protected CodeGenTypeEnum getCodeType() {
        return CodeGenTypeEnum.HTML;
    }

    @Override
    protected void saveFiles(HtmlCodeResult result, String baseDirPath) {
        // 保存 HTML 文件
        writeToFile(baseDirPath, "index.html", result.getHtmlCode());
    }

    @Override
    protected void validateInput(HtmlCodeResult result) {
        super.validateInput(result);
        // HTML 代码不能为空
        if (StrUtil.isBlank(result.getHtmlCode())) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "HTML代码内容不能为空");
        }
    }
}
