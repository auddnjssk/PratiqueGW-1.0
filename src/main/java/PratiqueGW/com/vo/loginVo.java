package PratiqueGW.com.vo;

import lombok.Data;

@Data
public class loginVo {

    private String loginEmail;
    private String loginPw;
    
    public loginVo(){
        super();
    }

    public loginVo(String loginEmail , String loginPw){
        super();
        this.loginEmail = loginEmail;
        this.loginPw = loginPw;
    }

    public String getLoginEmail(){
        return loginEmail;
    }

    public String getLoginPw(){
        return loginPw;
    }
}
