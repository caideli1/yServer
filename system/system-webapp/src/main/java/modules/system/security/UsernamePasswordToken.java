package modules.system.security;

/**
 * 用户和密码（包含验证码）令牌类
 */
public class UsernamePasswordToken extends org.apache.shiro.authc.UsernamePasswordToken
{

    private static final long serialVersionUID = 1L;

    private String captcha;
    private boolean mobileLogin;
    private boolean isCombineUser = false;

    public UsernamePasswordToken()
    {
        super();
    }

    public UsernamePasswordToken(String username, char[] password, boolean rememberMe, String host, String captcha, boolean mobileLogin)
    {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
        this.mobileLogin = mobileLogin;
    }

    public String getCaptcha()
    {
        return captcha;
    }

    public void setCaptcha(String captcha)
    {
        this.captcha = captcha;
    }

    public boolean isMobileLogin()
    {
        return mobileLogin;
    }

    public boolean isCombineUser()
    {
        return isCombineUser;
    }

    public void setCombineUser(boolean isCombineUser)
    {
        this.isCombineUser = isCombineUser;
    }
}
