package net.maku.security.service;

import lombok.AllArgsConstructor;
import net.maku.framework.security.mobile.MobileVerifyCodeService;
import net.maku.system.message.SmsApi;
import org.springframework.stereotype.Service;

/**
 * 短信验证码效验
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://fjshanke.cn">MAKU</a>
 */
@Service
@AllArgsConstructor
public class MobileVerifyCodeServiceImpl implements MobileVerifyCodeService {
    private final SmsApi smsApi;

    @Override
    public boolean verifyCode(String mobile, String code) {
        return smsApi.verifyCode(mobile, code);
    }
}
