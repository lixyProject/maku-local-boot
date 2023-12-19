package net.maku.framework.security.mobile;

/**
 * 手机短信登录，验证码效验
 *
 * @author flyfish
 * <a href="https://maku.net">MAKU</a>
 */
public interface MobileVerifyCodeService {

    boolean verifyCode(String mobile, String code);
}
