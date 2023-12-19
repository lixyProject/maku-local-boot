package net.maku.message.sms;

import java.util.Map;

/**
 * 短信
 *
 * @author flyfish 
 * <a href="https://maku.net">MAKU</a>
 */
public interface SmsStrategy {

    /**
     * 发送短信
     *
     * @param mobile 手机号
     * @param params 参数
     */
    void send(String mobile, Map<String, String> params);
}
